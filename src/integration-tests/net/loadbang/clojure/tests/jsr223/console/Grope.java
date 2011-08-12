//	$Id: Grope.java,v dfaf5b82b9c7 2011/05/09 16:17:12 nick $
//	$Source: /Users/nick/workspace/MaxMSP/DEVELOPMENT_0/mxj-development/jsr223/java/integration-tests/net/loadbang/jsr223/tests/console/Grope.java,v $

package net.loadbang.clojure.tests.jsr223.console;

import java.util.List;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Grope {
	static public void main(String[] args) {
		ScriptEngineManager sem = new ScriptEngineManager();
		List<?> list = sem.getEngineFactories();
		ScriptEngineFactory f;
		for (int i = 0; i < list.size(); i++) {
			f = (ScriptEngineFactory) list.get(i);
			String engineName = f.getEngineName();
			String engineVersion = f.getEngineVersion();
			String langName = f.getLanguageName();
			String langVersion = f.getLanguageVersion();
			System.out.println(engineName + " " +
					engineVersion + " " +
					langName + " " +
					langVersion);
			String statement = f.getOutputStatement("\"hello, world\"");
			System.out.println(statement);
			ScriptEngine e = f.getScriptEngine();
			try {
				e.eval(statement);
				System.out.println();
			} catch (ScriptException ex) {
				ex.printStackTrace();
			}
		}
	}
}
