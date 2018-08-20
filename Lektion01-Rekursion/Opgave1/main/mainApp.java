package main;

import java.util.ArrayList;

import rectangle.Rectangle;

public class mainApp {
	public static void main(String[] args) {

		// Rectangle
		int width = 10;
		int height = 10;
		Rectangle rectangle = new Rectangle(10, 10);
		System.out
				.println("Rectangle test\nWidth: " + width + "\nHeight: " + height + "\nArea: " + rectangle.getArea());
		// Rectangle end

		ArrayList<Integer> integers = new ArrayList<Integer>();
		integers.add(5);
		integers.add(4);
		integers.add(8);
		integers.add(1);
		integers.add(7);
		integers.add(3);
		integers.add(51);
		integers.add(3);
		integers.add(13);
		integers.add(1);
		integers.add(7);
		integers.add(1);
		integers.add(8);
		System.out.println(SearchElement.searchBiggestInt(integers));
		System.out.println(SearchElement.sumOfAllInt(integers));
	}
}
