package main;

import application.model.Triangle;

public class TriangleTester {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(10);
		System.out.println(triangle.getArea());
	}
}
