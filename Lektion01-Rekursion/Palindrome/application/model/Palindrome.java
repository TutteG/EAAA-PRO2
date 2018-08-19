package application.model;

public class Palindrome {

	// bad solution - cycle heavy..
	// public static boolean isPalindrome(String text) {
	// int length = text.length();
	//
	// // seperate case for shortest strings.
	// if (length <= 1) {
	// return true;
	// } else {
	// // get first and last characters, converted to lower case
	// char first = Character.toLowerCase(text.charAt(0));
	// char last = Character.toLowerCase(text.charAt(length - 1));
	//
	// if (Character.isLetter(first) && Character.isLetter(last)) {
	// if (first == last) {
	// String shorter = text.substring(1, length - 1);
	// return isPalindrome(shorter);
	// } else {
	// return false;
	// }
	// } else if (!Character.isLetter(last)) {
	// String shorter = text.substring(0, length - 1);
	// return isPalindrome(shorter);
	// } else {
	// String shorter = text.substring(1);
	// return isPalindrome(shorter);
	// }
	// }
	// }
	public static boolean isPalindrome(String text) {
		return isPalindrome(text, 0, text.length() - 1);
	}

	public static boolean isPalindrome(String text, int start, int end) {
		if (start >= end) {
			return true;
		} else {
			char first = Character.toLowerCase(text.charAt(start));
			char last = Character.toLowerCase(text.charAt(end));
			if (Character.isLetter(first) && Character.isLetter(last)) {
				if (first == last) {
					return isPalindrome(text, start + 1, end - 1);
				} else {
					return false;
				}
			} else if (!Character.isLetter(last)) {
				return isPalindrome(text, start, end - 1);
			} else {
				return isPalindrome(text, start + 1, end);
			}
		}
	}

}
