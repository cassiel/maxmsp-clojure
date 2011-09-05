//	$Id$
//	$Source$

package net.loadbang.mxj;

import net.loadbang.clojure.ClojureEngineImpl;
import net.loadbang.clojure.NSOwner;
import net.loadbang.scripting.Engine;
import net.loadbang.scripting.MaxObjectProxy;
import net.loadbang.scripting.ScriptEngineBase;

import com.cycling74.max.Atom;

public class Clojure extends ScriptEngineBase implements NSOwner {
	static final String USER = "user";

	private String itsNamespaceName;

	protected Clojure(Atom[] args) {
		super("$Id$",
			  "net.loadbang.clojure",
			  Clojure.class,
			  args,
			  ".clj",
			  "NS"
			 );
		itsNamespaceName = generateUniqueNamespaceName();
	}

	static int theNSNameCounter = 0;

	/**	Generate a unique namespace name for this MaxObject instance.
	 	The instance can always replace it with something more
	 	accessible.
	 	
		@return the unique namespace name
	 */

	static private String generateUniqueNamespaceName() {
		return "ns" + (++theNSNameCounter);
	}

	@Override
	protected Engine buildEngine(MaxObjectProxy proxy) {
		return new ClojureEngineImpl(proxy, this);
	}
	
	/**	Attribute callback: set the namespace.

		@param ns the name of the namespace
	 */

	void setNS(String ns) {
		itsNamespaceName = ns;
	}
	
	/**	Attribute callback: get the namespace.

		@return the name of the namespace
	 */

	public String getNS() {
		if (itsNamespaceName.equals(USER)) {
			return USER;
		} else {
			return itsNamespaceName;
		}
	}
}
