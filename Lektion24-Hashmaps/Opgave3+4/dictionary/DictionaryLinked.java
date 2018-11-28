package dictionary;

public class DictionaryLinked<K, V> implements Dictionary<K, V> {
	private Node start;
	private int size;

	private class Node {
		Node next;
		K key;
		V value;

	}

	public DictionaryLinked() {
		// Sentinel (tomt listehoved, der ikke indeholder data)
		start = new Node();
		size = 0;
	}

	@Override
	public V get(K key) {
		// TODO
		if (key != null) {
			Node temp = start;
			while (temp.key != null) {
				if (temp.key.equals(key)) {
					return temp.value;
				}
				temp = temp.next;
			}
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	// TODO: Fix next keys...
	@Override
	public V put(K key, V value) {
		if (key != null && value != null) {
			V oldValue = null;
			if (start.key == null && start.key == null) {
				start.key = key;
				start.value = value;
				start.next = new Node();
				size++;
			} else {
				Node temp = start;
				boolean found = false;
				while (temp.next != null && !found) {
					if (temp.key.equals(key)) {
						oldValue = temp.value;
						temp.value = value;
						found = true;
					}
					temp = temp.next;
				}
				if (!found) {
					temp.key = key;
					temp.value = value;
					temp.next = new Node();
					size++;
				}
			}
			return oldValue;
		}
		return null;
	}

	@Override
	public V remove(K key) {
		// TODO
		if (key != null) {
			if (start.key != null) {
				V oldValue = null;
				if (start.key.equals(key)) {
					oldValue = start.value;
					start = start.next;
					size--;
				} else {
					Node temp = start;
					boolean found = false;
					while (!found && temp.next != null) {
						if (temp.next.key.equals(key)) {
							found = true;
						} else {
							temp = temp.next;
						}
					}
					if (found) {
						size--;
						Node temp2 = temp.next;
						oldValue = temp2.value;
						temp.next = temp2.next;
						temp2.next = null;
					}
				}
				return oldValue;
			}
		}
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String nodes = "";
		Node temp = start;
		while (temp != null) {
			nodes += temp.value + "\t";
			temp = temp.next;
		}
		return nodes;
	}
}
