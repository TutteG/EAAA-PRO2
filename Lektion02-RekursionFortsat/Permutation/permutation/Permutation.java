package permutation;

import java.util.ArrayList;

public class Permutation {
	public static ArrayList<String> Permutations(String string) {
		ArrayList<String> result = new ArrayList<String>();
		if (string.length() == 0) {
			result.add(string);
			return result;
		} else {
			for (int i = 0; i < string.length(); i++) {
				String shorter = string.substring(0, i) + string.substring(i + 1);

				ArrayList<String> shorterPermutations = Permutations(shorter);

				for (String s : shorterPermutations) {
					result.add(string.charAt(i) + s);
				}
			}
			return result;
		}
	}
}
