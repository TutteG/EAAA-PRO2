package opgave2;

public class SortedDoublyLinkedList {

	private Node first;
	private Node last;

	public SortedDoublyLinkedList() {
		Node sentinelFirst = new Node();
		Node sentinelLast = new Node();
		sentinelFirst.previous = null;
		sentinelFirst.next = sentinelLast;
		sentinelLast.previous = sentinelFirst;
		sentinelLast.next = null;
		this.first = sentinelFirst;
		this.last = sentinelLast;
	}

	public void addElementJa(String element) {
		if (first.data == null) {
			Node node = new Node();
			node.data = element;
			first = node;
			System.out.println(element + " indsat init");
		} else if (first.data.compareTo(element) > 0) {
			Node node = new Node();
			node.data = element;
			Node temp = new Node();
			temp = first;
			first = node;
			first.next = temp;
			System.out.println(element + " indsat før");
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
				System.out.println(temp.data);
				Node newNode = new Node();
				newNode.data = element;
				newNode.next = temp2;
				temp.next = newNode;
				System.out.println(element + " indsat efter");
			}
		}
	}

	public void addElement(String element) {
		if (first == null) {
			first = new Node();
			first.data = element;
			first.next = null;
		} else if (first != null) {
			Node temp = first;
			Node temp3 = null;
			boolean found = false;
			while (!found) {
				if (temp != null && temp.data.compareTo(element) > 0) {
					found = true;
				} else if (temp.next == null) {
					found = true;
				} else {
					temp3 = temp;
					temp = temp.next;
				}
			}
			if (found) {
				if (temp.next == null && temp.data.compareTo(element) > 0) {
					if (temp.data.compareTo(element) > 0) {
						Node temp2 = new Node();
						temp2.data = element;
						temp.next = temp2;
						temp2.next = null;
					} else if (temp.data.compareTo(element) < 0) {
						Node temp2 = new Node();
						temp2.data = element;
						temp3.next = temp2;
						temp2.next = temp;

					}
				} else if (temp.data.compareTo(element) > 0) {
					Node temp2 = new Node();
					temp2.data = element;
					temp2.next = temp.next;
					temp.next = temp2;
				} else {
					Node temp2 = new Node();
					temp2.next = temp.next;
					temp.next = temp2;
					temp2.data = element;
				}
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
		// TODO Auto-generated method stub
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
		public Node previous;
	}
}
