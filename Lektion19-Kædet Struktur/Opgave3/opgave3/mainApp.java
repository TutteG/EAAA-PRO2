package opgave3;

public class mainApp {
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
		System.out.println(list.toString() + " Elementer: " + list.countElement());

		System.out.println();
		list.removeElement("Q");
		list.removeElement("Q");
		list.removeElement("A");

		System.out.println(list.toString() + " Elementer: " + list.countElement());

		SortedLinkedList list2 = new SortedLinkedList();
		list2.addElement("Jens");
		list2.addElement("Adam");
		list2.addElement("Torben");
		list2.addElement("Rasmus");
		list2.addElement("Peter");
		list2.addElement("Michael");
		System.out.println(list2.toString() + " Elementer: " + list2.countElement());

		list2.addAll(list);
		System.out.println(list2.toString() + " Elementer: " + list2.countElement());

	}
}
