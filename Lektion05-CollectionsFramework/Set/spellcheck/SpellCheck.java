package spellcheck;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SpellCheck {
	public static void main(String[] args) throws FileNotFoundException {
		// Set<String> dictionaryWords = readWords("words");
		Set<String> documentWords = readWords("document.txt");
		for (String word : documentWords) {
			System.out.println(word);
		}
	}

	public static Set<String> readWords(String filename) throws FileNotFoundException {
		Set<String> words = new HashSet<String>();
		File file = new File(filename);
		Scanner in = new Scanner(file);
		// Use any characters other than a-z or A-Z as delimiters
		in.useDelimiter("[^a-zA-Z]+");
		while (in.hasNext()) {
			words.add(in.next().toLowerCase());
		}
		in.close();
		return words;
	}
}
