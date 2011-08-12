//	$Id$
//	$Source$

package net.loadbang.clojure;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;

import net.loadbang.scripting.EngineImpl;
import net.loadbang.scripting.MaxObjectProxy;
import net.loadbang.scripting.util.Converters;
import clojure.lang.Compiler;
import clojure.lang.LineNumberingPushbackReader;
import clojure.lang.RT;
import clojure.lang.Symbol;
import clojure.lang.Var;

import com.cycling74.max.Atom;

public class ClojureEngineImpl extends EngineImpl {
	static final Symbol USER_SYM = Symbol.create("user");
	static final Var    IN_NS    = RT.var("clojure.core", "in-ns");

	public ClojureEngineImpl(MaxObjectProxy proxy) {
		super(proxy);
		// TODO Auto-generated constructor stub
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public void runScript(String directory, String filename) {
		// TODO Auto-generated method stub
		
	}

	public void runUsingPlaceHolder(String name) {
		// TODO Auto-generated method stub
		
	}

	public void addCleanup(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Converters getConverters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setupEngineOnPlaceHolder(String directory) throws IOException {
		// TODO Auto-generated method stub
		
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
	
	private Object evaluate(String statement) throws Exception {
		try {
			Reader reader = new StringReader(statement);
	
			Var.pushThreadBindings(
					RT.map(RT.CURRENT_NS, RT.CURRENT_NS.deref(),
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
