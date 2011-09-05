//	$Id$
//	$Source$

package net.loadbang.clojure;

import clojure.lang.Symbol;
import java.util.HashSet;
import java.util.Set;

public class NamespaceTracker {
	private Set<Symbol> itsEncounteredSymbols = new HashSet<Symbol>();

	public synchronized boolean firstEncounter(Symbol sym) {
		if (itsEncounteredSymbols.contains(sym)) {
			return false;
		} else {
			itsEncounteredSymbols.add(sym);
			return true;
		}
	}
}
