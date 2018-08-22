package app;

import permutation.Permutation;

public class mainApp {
	public static void main(String[] args) {
		for (String string : Permutation.Permutations("basilisken")) {
			System.out.println(string);
		}
	}
}
