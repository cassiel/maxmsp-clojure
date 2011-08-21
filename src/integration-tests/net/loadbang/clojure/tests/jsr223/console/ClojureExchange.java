//	$Id$
//	$Source: /Users/nick/workspace/MaxMSP/DEVELOPMENT_0/mxj-development/jsr223/java/integration-tests/net/loadbang/jsr223/tests/console/ClojureExchange.java,v $

package net.loadbang.clojure.tests.jsr223.console;

import java.io.File;
import java.util.Map;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ClojureExchange {
	public static void main(String[] args) {
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine engine = sem.getEngineByName("Clojure");
		
		File f = new File("test.txt");
		engine.put("f", f);
		
		try {
			engine.eval("(def s (.getAbsolutePath f))");
			engine.eval("(println s)");
			
			ScriptContext context = engine.getContext();
			System.out.println("Scopes: " + context.getScopes());

			printBindings("GLOBAL", context, ScriptContext.GLOBAL_SCOPE);
			printBindings("ENGINE", context, ScriptContext.ENGINE_SCOPE);
			
			Object obj = engine.get("user/s");
			System.out.println("Extracted: " + obj);
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}

	private static void printBindings(String name, ScriptContext context, int scope) {
		System.out.println(">>> " + name);
		Bindings bindings = context.getBindings(scope);
		
		for (Map.Entry<String, Object> entry: bindings.entrySet()) {
			System.out.println("    " + entry.getKey() + " -> " + entry.getValue());
		}
	}
}
