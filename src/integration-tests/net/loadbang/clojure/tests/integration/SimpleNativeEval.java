//	$Id$
//	$Source$

package net.loadbang.clojure.tests.integration;

import static org.junit.Assert.assertEquals;

import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;

import org.junit.Test;

import clojure.lang.Compiler;
import clojure.lang.LineNumberingPushbackReader;
import clojure.lang.RT;
import clojure.lang.Symbol;
import clojure.lang.Var;

public class SimpleNativeEval {
	@Test
	public void simpleEval() throws Exception {
		final Symbol USER_SYM = Symbol.create("user");
		final Var    IN_NS    = RT.var("clojure.core", "in-ns");

		Reader reader = null;
	
		try {
			reader = new StringReader("(+ 2 2)");
	
			Var.pushThreadBindings(
					RT.map(RT.CURRENT_NS, RT.CURRENT_NS.deref(),
						   RT.IN, new LineNumberingPushbackReader(reader),
						   RT.OUT, new OutputStreamWriter(System.out),
						   RT.ERR, new OutputStreamWriter(System.err))
					);
				
			IN_NS.invoke(USER_SYM);
			Integer result = (Integer) Compiler.load(reader);
			assertEquals("simple eval", 4, result.intValue());
		} finally {
			Var.popThreadBindings();
		}
	}
}
