package iotsuite.pubsubmiddleware;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static <T> Set<T> intersection(Set<T> setA, Set<T> setB) {

		if (setA != null && setB != null) {

			Set<T> tmp = new HashSet<T>();
			for (T x : setA)
				if (setB.contains(x))
					tmp.add(x);
			return tmp;
		} else {
			return null;
		}
	}

	/*
	 * public static <T> Set<T> intersection(Set<T> setA, Set<T> setB) {
	 * 
	 * if (setA != null && setB != null) {
	 * 
	 * Set<T> tmp = new TreeSet<T>(); for (T x : setA) if (setB.contains(x))
	 * tmp.add(x); return tmp; } else { return null; } }
	 */

}
