package src;

import opgave2.SortedDoublyLinkedList;

public class main {
	public static void main(String[] args) {
		SortedDoublyLinkedList list = new SortedDoublyLinkedList();
		list.addElementJa("D");
		list.addElementJa("Å");
		list.addElementJa("Q");
		list.addElementJa("B");
		list.addElementJa("C");
		list.addElementJa("A");
		list.addElementJa("C");
		list.addElementJa("C");
		list.addElementJa("Q");
		list.addElementJa("B");
		list.addElementJa("C");
		System.out.println(list.toString() + " Elementer: " + list.countElement());

		System.out.println();
		list.removeElement("Q");
		list.removeElement("Q");
		list.removeElement("A");
		System.out.println(list.toString() + " Elementer: " + list.countElement());
	}
}
