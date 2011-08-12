//	$Id$
//	$Source$

package net.loadbang.mxj;

import net.loadbang.clojure.ClojureEngineImpl;
import net.loadbang.scripting.Engine;
import net.loadbang.scripting.MaxObjectProxy;
import net.loadbang.scripting.ScriptEngineBase;

import com.cycling74.max.Atom;

public class Clojure extends ScriptEngineBase {
	protected Clojure(Atom[] args) {
		super("$Id$",
				  "net.loadbang.clojure",
				  Clojure.class,
				  args,
				  ".clj"
				 );
	}

	@Override
	protected Engine buildEngine(MaxObjectProxy proxy) {
		return new ClojureEngineImpl(proxy);
	}
}
