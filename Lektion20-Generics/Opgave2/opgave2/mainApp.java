package opgave2;

public class mainApp {

	public static void main(String[] args) {
		Dictionary<Integer, String> dictionary = new Dictionary<>();
		System.out.println("Størrelse af dictionary: " + dictionary.size());

		dictionary.put(1, "Torben");
		dictionary.put(2, "Peter");
		dictionary.put(3, "Michael");
		dictionary.put(4, "Per");
		System.out.println(dictionary.put(5, "Niels"));
		System.out.println("Størrelse af dictionary: " + dictionary.size());

		System.out.println();
		System.out.println("Hent på key 2: " + dictionary.get(2));
		System.out.println();
		System.out.println("Ændre key 2's value til Lars \nGammel værdi: " + dictionary.put(2, "Lars"));
		System.out.println();
		System.out.println("Hent på key 2: " + dictionary.get(2));

		System.out.println();
		System.out.println("Fjern key 2 \nvalue på key: " + dictionary.remove(2));
		System.out.println();

		System.out.println("Hent key 2: " + dictionary.get(2));
	}
}
