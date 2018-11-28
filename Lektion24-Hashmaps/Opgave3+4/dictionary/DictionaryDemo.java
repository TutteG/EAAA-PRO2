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
//		

		Dictionary<Integer, String> dic = new DictionaryHashMap<Integer, String>();
		System.out.println(dic.isEmpty());
		System.out.println(dic.size());

		dic.put(8, "Hans");
		dic.put(3, "Viggo");
		System.out.println(dic.isEmpty());
		System.out.println(dic.size());

		System.out.println(dic.get(8));

		dic.put(7, "Bent");
		dic.put(2, "Lene");
		System.out.println(dic.isEmpty());
		System.out.println(dic.size());
		System.out.println(dic.remove(3));

		System.out.println(dic.size());

		System.out.println(dic.put(8, "Ida"));
		System.out.println(dic.get(8));
		System.out.println(dic.get(2));
		System.out.println(dic);
		System.out.println(dic.size());

	}

}
