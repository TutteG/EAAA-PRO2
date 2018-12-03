package dictionary;

public class DictionaryDemo {

	public static void main(String[] args) {
//		Dictionary<Integer, String> dictionary = new DictionaryLinked<Integer, String>();
//		System.out.println(dictionary.isEmpty());
//		System.out.println(dictionary.size());
//
//		dictionary.put(8, "Hans");
//		dictionary.put(3, "Viggo");
//		System.out.println(dictionary.isEmpty());
//		System.out.println(dictionary.size());
//
//		System.out.println(dictionary.get(8));
//
//		dictionary.put(7, "Bent");
//		dictionary.put(2, "Lene");
//		System.out.println(dictionary.isEmpty());
//		System.out.println(dictionary.size());
//		System.out.println(dictionary.remove(3));
//
//		System.out.println(dictionary.size());
//
//		System.out.println(dictionary.put(8, "Ida"));
//		System.out.println(dictionary.get(8));
//		System.out.println(dictionary.get(2));
//		System.out.println(dictionary);
//		System.out.println(dictionary.size());

		Dictionary<Integer, String> dic = new DictionaryHashMap<Integer, String>();
		System.out.println("isEmpty: " + dic.isEmpty());
		System.out.println("Hashmap elementer: " + dic.size());

		System.out.println("put Hans og Viggo");
		dic.put(8, "Hans");
		dic.put(3, "Viggo");

		System.out.println("isEmpty: " + dic.isEmpty());
		System.out.println("Hashmap elementer: " + dic.size());

		System.out.println("Hent value på key 8: " + dic.get(8));

		System.out.println("put Bent, Lene og Janni");
		dic.put(7, "Bent");
		dic.put(2, "Lene");
		dic.put(12, "Janni");
		System.out.println("isEmpty: " + dic.isEmpty());
		System.out.println("Hashmap størrelse: " + dic.size());
		System.out.println("remove key 3: " + dic.remove(3));
		System.out.println("remove key 3: " + dic.remove(3));

		System.out.println("Hashmap elementer: " + dic.size());

		System.out.println("put Ida på key 8, gammel value? " + dic.put(8, "Ida"));
		System.out.println("Hent value på key 8: " + dic.get(8));
		System.out.println("Hent value på key 2: " + dic.get(2));
		System.out.println("\nVis alle elementer:\n" + dic);
		System.out.println("Hashmap elementer: " + dic.size());

	}

}
