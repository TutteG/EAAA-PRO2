package spelltreeset;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class SpellCheck {
	public static void main(String[] args) throws FileNotFoundException {
		TreeMap<String, Integer> words = readWords("Gjøngehøvdingen.txt");
		Set<String> keySet = words.keySet();
		for (String word : keySet) {
			System.out.println(word + " " + words.get(word));
		}
	}

	public static TreeMap<String, Integer> readWords(String filename) throws FileNotFoundException {
		TreeMap<String, Integer> words = new TreeMap<String, Integer>();
		Scanner in = new Scanner(new File(filename));
		// Use any characters other than a-z or A-Z as delimiters
		in.useDelimiter("[^a-zA-Z]+");
		while (in.hasNext()) {
			String nextIn = in.next();
			if (words.containsKey(nextIn)) {
				int something = words.get(nextIn);
				words.put(nextIn, something + 1);
			} else {
				words.put(nextIn, 1);
			}
		}
		in.close();
		return words;
	}
}
