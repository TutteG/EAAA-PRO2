package opgave2;

public class mainApp {
	public static void main(String[] args) {
		SortedDoublyLinkedList list = new SortedDoublyLinkedList();
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
