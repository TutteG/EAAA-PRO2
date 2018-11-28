package opgave1;

import java.util.HashSet;

public class mainApp {
	public static void main(String[] args) {
		HashSet<Car> cars = new HashSet<Car>();

		Car car1 = new Car("qwerty", "Mercedes", "AMG", Colour.MAGENTA);
		Car car2 = new Car("qwerty", "Mercedes", "Hurtigbil", Colour.SILVER);
		Car car3 = new Car("TORBEN", "Mercedes", "AMG", Colour.SILVER);
		Car car4 = new Car("MICHAEL", "Mercedes", "AMG", Colour.SILVER);
		Car car5 = new Car("qwerty", "Mercedes", "AMG", Colour.SILVER);

		System.out.println(car1.equals(car2));
		System.out.println(car1.equals(car3));

		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		System.out.println(cars);
	}
}
