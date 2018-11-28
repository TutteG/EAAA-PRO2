package opgave2;

/**
 * This program demonstrates the hash set class.
 */
public class HashSetDemo {
	public static void main(String[] args) {
		testHashSetChaining();
	}

	public static void testHashSetChaining() {
		HashSetChaining names = new HashSetChaining(13);

		names.add("Harry");
		names.add("Sue");
		names.add("Nina");
		names.add("Susannah");
		names.add("Larry");
		names.add("Eve");
		names.add("Sarah");
		names.add("Adam");
		names.add("Tony");
		names.add("Katherine");
		names.add("Juliet");
		names.add("Romeo");

		System.out.println(names);

		System.out.println("Size: " + names.size());
		System.out.println("Contains Romeo: " + names.contains("Romeo"));

		names.remove("Romeo");
		System.out.println("Contains Romeo: " + names.contains("Romeo"));
		names.remove("Nina");
		System.out.println("Contains Nina: " + names.contains("Nina"));
		System.out.println(names.size());
		System.out.println();
		System.out.println(names);
		System.out.println("Actual size of array: " + names.actualSize());

		names.add("Romeo1");
		names.add("Romeo2");
		names.add("Romeo3");
		names.add("Romeo4");
		names.add("Romeo5");
		names.add("Romeo6");
		System.out.println("Actual size of array: " + names.actualSize());

		System.out.println(names);
	}

}
