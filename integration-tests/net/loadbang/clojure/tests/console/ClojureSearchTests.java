//	$Id: ClojureSearchTests.java,v ed81c5a46a05 2011/05/09 17:11:52 nick $
//	$Source: /Users/nick/workspace/MaxMSP/DEVELOPMENT_0/mxj-development/jsr223/java/integration-tests/net/loadbang/jsr223/tests/console/ClojureSearchTests.java,v $

package net.loadbang.clojure.tests.console;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ResourceBundle;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.junit.Test;

public class ClojureSearchTests {
	private void extendClasspath(File newDir) throws Exception {
		ClassLoader currentClassLoader = Thread.currentThread().getContextClassLoader();
		
		URLClassLoader urlClassLoader =
			new URLClassLoader(new URL[] { newDir.toURL() },  currentClassLoader);
		
		Thread.currentThread().setContextClassLoader(urlClassLoader);
	}

	@Test
	public void loadViaClasspath() throws Exception {
		ResourceBundle bundle = ResourceBundle.getBundle("net.loadbang.jsr223.props.TEST_CONFIG");
		String baseDir = bundle.getString("TEST_SCRIPT_BASE");
		System.out.println(baseDir);

		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine engine = sem.getEngineByName("Clojure");
		
		File file = new File(new File(baseDir, "location1"), "main.clj");

		Reader reader = null;
		try {
			extendClasspath(new File(baseDir, "location1"));
			reader = new FileReader(file);
			engine.eval(reader);
		} finally {
			if (reader != null) {
				try { reader.close(); } catch (IOException e) { }
			}
		}
	}
}
