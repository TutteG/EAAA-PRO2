package opgave1;

public class LinkedList<T extends Comparable<T>> {
	private Node first;
	private int size = 0;

	public LinkedList() {
		first = null;
	}

	public void addElement(T element) {
		Node node = new Node();
		node.data = element;
		if (first == null) {
			first = node;
			size++;
		} else {
			boolean found = false;
			Node temp = first;
			while (!found) {
				if (temp.next == null) {
					temp.next = node;
					size++;
					found = true;
				} else {
					temp = temp.next;
				}
			}
		}
	}

	public T getFirst() {
		if (first != null) {
			return first.data;
		} else {
			return null;
		}
	}

	public boolean removeElement(T element) {
		boolean found = false;
		if (first != null) {
			Node temp = first;
			if (first.data.equals(element)) {
				first = first.next;
				size--;
			} else {
				while (!found && temp.next != null) {
					if (temp.next.data.equals(element)) {
						found = true;
					} else {
						temp = temp.next;
					}
				}
				if (found) {
					size--;
					Node temp2 = temp.next;
					temp.next = temp2.next;
					temp2.next = null;
				}
			}
		}
		return found;
	}

	public int size() {
		return size;
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

	public boolean isEmpty() {
		if (first == null) {
			return true;
		} else {
			return false;
		}
	}

	class Node {
		public T data;
		public Node next;
	}
}
