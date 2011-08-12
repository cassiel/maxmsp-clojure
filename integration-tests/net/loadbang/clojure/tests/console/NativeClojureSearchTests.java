//	$Id: NativeClojureSearchTests.java,v 4decded1efde 2011/05/09 19:56:40 nick $
//	$Source: /Users/nick/workspace/MaxMSP/DEVELOPMENT_0/mxj-development/jsr223/java/integration-tests/net/loadbang/jsr223/tests/console/NativeClojureSearchTests.java,v $

package net.loadbang.clojure.tests.console;

import java.io.File;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ResourceBundle;

import org.junit.Test;

import clojure.lang.Compiler;
import clojure.lang.IMapEntry;
import clojure.lang.ISeq;
import clojure.lang.LineNumberingPushbackReader;
import clojure.lang.Namespace;
import clojure.lang.RT;
import clojure.lang.Symbol;
import clojure.lang.Var;

/**	This is raw Clojure, not JSR-223. */

public class NativeClojureSearchTests {
	private static final Symbol    USER_SYM            = Symbol.create("user");
	private static final Var       IN_NS               = RT.var("clojure.core", "in-ns");

	private void extendClasspath(File newDir) throws Exception {
		ClassLoader currentClassLoader = Thread.currentThread().getContextClassLoader();
		
		URLClassLoader urlClassLoader =
			new URLClassLoader(new URL[] { newDir.toURI().toURL() },  currentClassLoader);
		
		Thread.currentThread().setContextClassLoader(urlClassLoader);
	}
	
	private Object run(File file) throws Exception {
		Reader reader = null;

		try {
			reader = new FileReader(file);

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
	
	private void put(String name, Object value) {
		//	This is largely cargo-culting.
	    if (name.indexOf('.') == -1) {
	    	String nsName = "user";
	    	if (name.indexOf('/') >= 0) {
	    		String[] names = name.split("/");
	    		nsName = names[0];
	    		name = names[1];
	    	} 

	    	Var.intern(Namespace.findOrCreate(Symbol.create(nsName.intern())),
	    			Symbol.create(name.intern()), value);
	    }
	}
	
    private Object find00(String name) {
        for (ISeq seq = Namespace.all(); seq != null; seq = seq.next()) {
            Namespace ns = (Namespace) seq.first();
            String nsName = ns.toString();
            if (nsName.startsWith("clojure")) continue;
            
	        for (ISeq mseq = ns.getMappings().seq(); mseq != null; mseq = mseq.next()) {
	            IMapEntry e = (IMapEntry) mseq.first();
	            String k = e.getKey().toString();
	            if (k.equals(name)) {
		            Object val = e.getValue();
		            if (val.toString().startsWith("#'clojure")) continue;
	            	if (val instanceof Var) {
	            		val = ((Var) val).deref();
	            		return val;
	            	}
            	}       	
	        }
        }
        
        return null;
    }

	@Test
	public void loadViaClasspath() throws Exception {
		ResourceBundle bundle = ResourceBundle.getBundle("net.loadbang.clojure.props.TEST_CONFIG");
		String baseDir = bundle.getString("TEST_SCRIPT_BASE");
		System.out.println(baseDir);
		File location = new File(baseDir, "location1");
		extendClasspath(location);
		put("injected", 12345);
		Object obj = run(new File(location, "main.clj"));
		System.out.println(obj.toString());
		Object xxx = find00("xxx");		
	}
}
