package hashsettester;

import java.util.HashSet;

public class HashSetTester {
	public static void main(String[] args) {
		HashSet<Integer> integerHashSet = new HashSet<>();
		integerHashSet.add(34);
		integerHashSet.add(12);
		integerHashSet.add(23);
		integerHashSet.add(45);
		integerHashSet.add(67);
		integerHashSet.add(34);
		integerHashSet.add(98);
		System.out.println(integerHashSet.toString());
		integerHashSet.add(23);
		System.out.println(integerHashSet.toString());
		integerHashSet.remove(67);
		System.out.println(integerHashSet.toString());
		System.out.println(integerHashSet.contains(23));
		System.out.println(integerHashSet.size());
	}
}
