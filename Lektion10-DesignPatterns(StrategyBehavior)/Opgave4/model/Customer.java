package model;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {

	private int number;
	private String name;
	private Comparator<Customer> comp;

	public Customer(int number, String name, Comparator<Customer> comp) {
		this.number = number;
		this.name = name;
		this.comp = comp;
	}

	public void setComp(Comparator<Customer> comp) {
		this.comp = comp;
	}

	public Comparator<Customer> getComp() {
		return comp;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public int compareTo(Customer o) {
		return comp.compare(this, o);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + name + " Number: " + number + "]";
	}
}
