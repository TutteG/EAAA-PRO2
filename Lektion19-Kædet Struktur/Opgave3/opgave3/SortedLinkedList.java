package opgave3;

public class SortedLinkedList {

	private Node first;

	public SortedLinkedList() {
		first = null;
	}

	public void addAll(SortedLinkedList list) {
		Node node = list.first;
		while (node != null) {
			addElement(node.data);
			node = node.next;
		}
	}

	public void addElement(String element) {
		if (first == null) {
			Node node = new Node();
			node.data = element;
			first = node;

		} else if (first.data.compareTo(element) > 0) {
			Node node = new Node();
			node.data = element;
			Node temp = new Node();
			temp = first;
			first = node;
			first.next = temp;

		} else {
			boolean found = false;
			Node temp = first;
			Node temp2 = temp.next;
			while (!found) {
				if (temp2 == null || temp.data.compareTo(element) < 0 && temp2.data.compareTo(element) >= 0) {
					found = true;
				} else {
					temp = temp2;
					temp2 = temp2.next;
				}
			}
			if (found) {
				Node newNode = new Node();
				newNode.data = element;
				newNode.next = temp2;
				temp.next = newNode;
			}
		}
	}

	public boolean removeElement(String element) {
		boolean found = false;
		if (first != null) {
			if (first.data.equals(element)) {
				first = first.next;
			} else {
				Node temp = first;
				while (!found && temp.next != null) {
					if (temp.next.data.equals(element)) {
						found = true;
					} else {
						temp = temp.next;
					}
				}
				if (found) {
					Node temp2 = temp.next;
					temp.next = temp2.next;
					temp2.next = null;
				}
			}
		}
		return found;
	}

	public int countElement() {
		int count = 0;
		if (first != null) {
			count++;
			Node temp = first;
			while (temp.next != null) {
				count++;
				temp = temp.next;
			}
		}
		return count;
	}

	@Override
	public String toString() {
		String str = "[";
		if (first != null) {
			Node node = first;
			while (node != null) {
				str = str + " " + node.data + " ";
				node = node.next;
			}
		}
		str = str + "]";
		return str;
	}

	class Node {
		public String data;
		public Node next;
	}
}
