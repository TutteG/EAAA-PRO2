package main;

import application.model.Palindrome;

public class PalindromeTester {
	public static void main(String[] args) {
		String text = "madam, i'm adam";
		String text2 = "niels";
		System.out.println("Palindrome test1: " + Palindrome.isPalindrome(text));
		System.out.println("Palindrome test2: " + Palindrome.isPalindrome(text2));
	}
}
