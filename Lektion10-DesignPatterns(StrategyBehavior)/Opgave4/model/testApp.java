package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class testApp {
	public static void main(String[] args) {
		Comparator<Customer> compName = new CompareName();
		Comparator<Customer> compNumber = new CompareNumber();
		Customer customer1 = new Customer(1, "Daniel", compName);
		Customer customer2 = new Customer(-1, "Daniella", compName);
		Customer customer3 = new Customer(6, "Torben", compName);
		Customer customer4 = new Customer(3, "Rasmus", compName);
		Customer customer5 = new Customer(8, "Peter", compName);
		Customer customer6 = new Customer(2, "Pedro", compName);
		Customer customer7 = new Customer(3, "Niels", compName);
		Customer customer8 = new Customer(9, "Michael", compName);
		System.out.println(customer1.compareTo(customer2));

		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		customers.add(customer6);
		customers.add(customer7);
		customers.add(customer8);
		System.out.println("Mega usorteret liste:");
		System.out.println(customers);

		System.out.println();
		System.out.println("Collections.sort med compName");
		Collections.sort(customers);
		System.out.println(customers);

		System.out.println();
		System.out.println("Collections.sort med compNumber");
		customer1.setComp(compNumber);
		customer2.setComp(compNumber);
		customer3.setComp(compNumber);
		customer4.setComp(compNumber);
		customer5.setComp(compNumber);
		customer6.setComp(compNumber);
		customer7.setComp(compNumber);
		customer8.setComp(compNumber);

		Collections.sort(customers);
		System.out.println(customers);

		System.out.println();
		System.out.println("kald af sort direkte på listen med compName");
		customers.sort(compName);
		System.out.println(customers);
		System.out.println();
		System.out.println("kald af sort direkte på listen med compNumber");
		customers.sort(compNumber);
		System.out.println(customers);
	}

}
