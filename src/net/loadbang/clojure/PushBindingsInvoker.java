//	$Id$
//	$Source$

package net.loadbang.clojure;

import java.io.OutputStreamWriter;
import java.io.Reader;

import net.loadbang.scripting.MaxObjectProxy;
import clojure.lang.LineNumberingPushbackReader;
import clojure.lang.Namespace;
import clojure.lang.RT;
import clojure.lang.Symbol;
import clojure.lang.Var;

abstract public class PushBindingsInvoker<T> {
	abstract public T invoke() throws Exception;
	
	static final Symbol USER_SYM = Symbol.create("user");
	static final Var IN_NS = RT.var("clojure.core", "in-ns");
	static final Namespace MAX_NS = Namespace.findOrCreate(Symbol.intern("max"));
	static final Var MAX_OBJECT = Var.intern(MAX_NS, Symbol.intern("maxObject"), null);

	private Reader itsReader;
	private MaxObjectProxy itsProxy;
	
	public PushBindingsInvoker(MaxObjectProxy proxy,
							   Reader reader
							  ) {
		itsProxy = proxy;
		itsReader = reader;
	}

	public T doit() throws Exception {
		Var.pushThreadBindings(
			RT.map(MAX_OBJECT, itsProxy,
					RT.CURRENT_NS, RT.CURRENT_NS.deref(),
					RT.IN, new LineNumberingPushbackReader(itsReader),
					RT.OUT, new OutputStreamWriter(System.out),
					RT.ERR, new OutputStreamWriter(System.err))
		);
			
		IN_NS.invoke(USER_SYM);

		try {
			return invoke();
		} finally {
			Var.popThreadBindings();
		}
	}
	
	public Reader getReader() {
		return itsReader;
	}
}
