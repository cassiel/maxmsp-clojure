//	$Id$
//	$Source$

package net.loadbang.clojure;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.net.MalformedURLException;

import net.loadbang.scripting.EngineImpl;
import net.loadbang.scripting.MaxObjectProxy;
import net.loadbang.scripting.util.Converters;

import clojure.lang.Compiler;
import clojure.lang.LineNumberingPushbackReader;
import clojure.lang.Namespace;
import clojure.lang.RT;
import clojure.lang.Symbol;
import clojure.lang.Var;

import com.cycling74.max.Atom;
import com.cycling74.max.MaxObject;

/* TODO spurious change. */

public class ClojureEngineImpl extends EngineImpl {
	static final Symbol USER_SYM = Symbol.create("user");
	static final Var IN_NS = RT.var("clojure.core", "in-ns");
	static final Namespace MAX_NS = Namespace.findOrCreate(Symbol.intern("max"));
	static final Var MAX_OBJECT = Var.intern(MAX_NS, Symbol.intern("maxObject"), null);

	/**	The directory for any place-holder. */
	private File itsPlaceHolderDirectory00;
	
	/**	Create an instance of a Clojure engine.

		@param proxy a proxy for the owning {@link MaxObject}.
	 */

	public ClojureEngineImpl(MaxObjectProxy proxy) {
		super(proxy);
	}

	/**	Clear the environment. Since we only have one Clojure
	 	interpreter it's not clear that this means anything,
	 	but we might want to clear any on-delete functions.

	 	@see net.loadbang.scripting.Engine#clear()
	 */
	
	public void clear() {
		// TODO Auto-generated method stub	
	}
	
	/**	Run a script file in a given directory. The directory is
	 	(temporarily) made the root of a classpath entry so that
	 	libraries can be found relative to the directory using
	 	'require and friends.
	 	
		@param directory the directory containing the file, used
			as a classpath root
			
		@param filename the name of the script file in that
			directory to run
	 */

	private void run1(final File directory, final String filename) {
		try {
			new ClassLoaderInvoker<Object>() {
				@Override
				public Object invoke() {
					try {
						Compiler.loadFile(new File(directory, filename)
								  		  .getCanonicalPath()
								 		 );
					} catch (Exception exn) {
						getProxy().error(exn.getMessage());
						exn.printStackTrace();
					}
					
					return null;
				}
			}.doit(directory);
		} catch (MalformedURLException exn) {
			getProxy().error(exn.getMessage());
			exn.printStackTrace();
		}
	}

	/**	Run a script from a file in a given directory,
	 	the latter provided for a search path. This
	 	search path should be considered transient;
	 	the "real" search path is set by the place-holder.
	 	
	 	@see net.loadbang.scripting.Engine#runScript(java.lang.String, java.lang.String)
	 */

	public void runScript(String directory, String filename) {
		run1(new File(directory), filename);
	}

	/**	Run a script file with a path rooted on the
	 	current place-holder.
	 	
	 	@see net.loadbang.scripting.Engine#runUsingPlaceHolder(java.lang.String)
	 */

	public void runUsingPlaceHolder(String name) {
		if (itsPlaceHolderDirectory00 == null) {
			getProxy().error("engine not loaded: place-holder problem?");
		} else {
			run1(itsPlaceHolderDirectory00, name);
		}
	}

	/**	Add (stack) a cleanup function.

	 	@see net.loadbang.scripting.Engine#addCleanup(java.lang.Object)
	 */

	public void addCleanup(Object obj) {
		// TODO Auto-generated method stub
	}

	/**	Data converters. Generally universal, but (probably) with
	  	some Clojure-specific routines.
	  	
	 	@see net.loadbang.scripting.EngineImpl#getConverters()
	 */

	@Override
	protected Converters getConverters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setupEngineOnPlaceHolder(String directory) {
		itsPlaceHolderDirectory00 = new File(directory);
	}

	@Override
	public void setVar(String id, Object args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Object getVar00(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**	Raw evaluation. We could establish the classpath for the
	 	current root before running this, but the encumbent
	 	Groovy and Python systems don't do this.
	 	
		@param statement the Clojure statement to evaluate
		@return the result of the evaluation
		@throws Exception if evaluation throws an exception
	 */

	private Object evaluate(String statement) throws Exception {
		try {
			Reader reader = new StringReader(statement);
	
			Var.pushThreadBindings(
					RT.map(MAX_OBJECT, getProxy(),
						   RT.CURRENT_NS, RT.CURRENT_NS.deref(),
						   RT.IN, new LineNumberingPushbackReader(reader),
						   RT.OUT, new OutputStreamWriter(System.out),
						   RT.ERR, new OutputStreamWriter(System.err))
					);
				
			IN_NS.invoke(USER_SYM);
			return Compiler.load(reader);
		} finally {
			Var.popThreadBindings();
		}
	}

	@Override
	public void exec(String statement) {
		try {
			/*ignore*/ evaluate(statement);
		} catch (Exception exn) {
			getProxy().error(exn.toString());
		}
	}

	@Override
	public void eval(String statement) {
		try {
			Object obj = evaluate(statement);
			getProxy().outlet(0, obj);
		} catch (Exception exn) {
			getProxy().error(exn.toString());
		}
	}

	/** Invoke a function followed by a set of arguments (Atoms).
	 	We frig this slightly to allow a special form: if the "fn" begins
	 	with "(" we assume the entire input is a Clojure form and do
	 	an eval(), ignoring the inlet number.

	 	@see net.loadbang.scripting.EngineImpl#invoke(java.lang.String, java.lang.Integer, com.cycling74.max.Atom[])
	 */

	@Override
	public void invoke(String fn, Integer inlet00, Atom[] args) {
		if (fn.startsWith("(")) {
			eval(fn + " " + Atom.toOneString(args));
		} else {
			//	TODO
		}
	}

	@Override
	public void unwindCallbacks() {
		// TODO Auto-generated method stub
	}
}
