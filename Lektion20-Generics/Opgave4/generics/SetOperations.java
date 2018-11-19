package generics;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
//		Set<T> newSet
		Set<T> newSet = new HashSet<T>();
		for (T t : s1) {
			T t2 = s2.iterator().next();
			if (t == t2) {
				newSet.add(t);
			} else {
				newSet.add(t);
				newSet.add(t2);
			}
		}
		return newSet;
	}

	public static <T> Set<T> differens(Set<T> s1, Set<T> s2) {
		Set<T> newSet = new HashSet<T>();
		for (T t : s1) {
			if (!s2.contains(t)) {
				newSet.add(t);
			}
		}
		return newSet;

	}

	public static <T> Set<T> intesection(Set<T> s1, Set<T> s2) {
		Set<T> newSet = new HashSet<T>();
		for (T t : s1) {
			if (s2.contains(t)) {
				newSet.add(t);
			}
		}
		return newSet;
	}

}
