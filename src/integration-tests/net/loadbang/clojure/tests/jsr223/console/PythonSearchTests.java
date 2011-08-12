//	$Id: PythonSearchTests.java,v dfaf5b82b9c7 2011/05/09 16:17:12 nick $
//	$Source: /Users/nick/workspace/MaxMSP/DEVELOPMENT_0/mxj-development/jsr223/java/integration-tests/net/loadbang/jsr223/tests/console/PythonSearchTests.java,v $

package net.loadbang.clojure.tests.jsr223.console;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ResourceBundle;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.SimpleBindings;

import org.junit.Ignore;

public class PythonSearchTests {
	private Bindings itsInitialScope00 = null;
	
	private Bindings cloneBindings(Bindings b) {
		SimpleBindings eb2 = new SimpleBindings();
		eb2.clear();
		eb2.putAll(b);
		return eb2;
	}
	
	private Object resultFromLocation(ScriptEngineManager sem, File file)
		throws Exception
	{
		ScriptEngine engine = sem.getEngineByName("jython");
		Bindings eb = engine.getBindings(ScriptContext.ENGINE_SCOPE);
		
		if (itsInitialScope00 == null) {
			itsInitialScope00 = eb;
		}
		
		engine.setBindings(cloneBindings(itsInitialScope00), ScriptContext.ENGINE_SCOPE);

		Reader reader = null;
		try {
			reader = new FileReader(file);
			engine.eval("import sys");
			engine.eval(String.format("sys.path.insert(0, '%s')", file.getParent()));
			engine.eval("print '>>> %s' % sys.path");
			engine.eval(reader);
			return engine.get("result");
		} finally {
			if (reader != null) {
				try { reader.close(); } catch (IOException e) { }
			}
		}
		
	}

	@Ignore
	public void enginePathsAreDistinct() throws Exception {
		ResourceBundle bundle = ResourceBundle.getBundle("net.loadbang.jsr223.props.TEST_CONFIG");
		String baseDir = bundle.getString("TEST_SCRIPT_BASE");
		System.out.println(baseDir);

		ScriptEngineManager sem = new ScriptEngineManager();
		
		assertEquals("hello",
					 resultFromLocation(sem, new File(new File(baseDir, "location1"), "main.py"))
					);
		assertEquals("goodbye",
					 resultFromLocation(sem, new File(new File(baseDir, "location2"), "main.py"))
					);
	}
}
