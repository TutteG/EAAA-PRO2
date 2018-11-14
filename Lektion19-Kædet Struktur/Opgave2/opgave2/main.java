package opgave2;

import src.SortedLinkedList;

public class main {
	public static void main(String[] args) {
		SortedLinkedList list = new SortedLinkedList();
		list.addElement("D");
		list.addElement("Å");
		list.addElement("Q");
		list.addElement("B");
		list.addElement("C");
		list.addElement("A");
		list.addElement("C");
		list.addElement("C");
		list.addElement("Q");
		list.addElement("B");
		list.addElement("C");
		System.out.println(list.toString());
	}
}
