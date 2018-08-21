package main;

import java.util.Scanner;

import arithmetic.ArithmeticExpression;

public class app {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Calculate expression: ");
		String input = in.nextLine();
		ArithmeticExpression e = new ArithmeticExpression(input);
		System.out.println("Result: " + e.getExpressionValue());
		in.close();
	}
}
