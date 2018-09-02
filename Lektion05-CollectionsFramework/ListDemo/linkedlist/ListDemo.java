package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		LinkedList<String> staff = new LinkedList<>();
		staff.add("Diana");
		staff.add("Harry");
		staff.add("Romeo");
		staff.add("Tom");

		// | indicates position of iterator

		ListIterator<String> iter = staff.listIterator();
		// |DHRT
		iter.next();
		// D|HRT
		iter.next();
		// DH|RT

		// Add elements to list before iterator position

		iter.add("Juliet");
		// DHJ|RT
		iter.add("Nina");
		// DHJN|RT

		iter.next();
		// DHJNR|T

		// Remove last traversed object
		iter.remove();
		// DHJN|T

		// print list
		System.out.println(staff);
	}
}
