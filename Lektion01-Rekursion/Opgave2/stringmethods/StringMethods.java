package stringmethods;

public class StringMethods {
	public static String reverseString(String string) {
		return reverseString(string, string.length());
	}

	public static String reverseString(String string, int length) {
		if (length == 1) {
			return string.substring(length - 1, length);
		} else if (length < 1) {
			return string;
		} else {
			return string.substring(length - 1, length) + reverseString(string, length - 1);
		}
	}
}
