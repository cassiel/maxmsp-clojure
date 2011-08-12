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

	@Override
	public void exec(String statement) {
		Reader reader = null;
		
		try {
			reader = new StringReader(statement);
	
			Var.pushThreadBindings(
					RT.map(RT.CURRENT_NS, RT.CURRENT_NS.deref(),
						   RT.IN, new LineNumberingPushbackReader(reader),
						   RT.OUT, new OutputStreamWriter(System.out),
						   RT.ERR, new OutputStreamWriter(System.err))
					);
				
			IN_NS.invoke(USER_SYM);
			/*ignore*/ Compiler.load(reader);
		} catch (Exception exn) {
			getProxy().error(exn.toString());
		} finally {
			Var.popThreadBindings();
		}
	}

	@Override
	public void eval(String statement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invoke(String fn, Integer inlet00, Atom[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unwindCallbacks() {
		// TODO Auto-generated method stub
		
	}

}
