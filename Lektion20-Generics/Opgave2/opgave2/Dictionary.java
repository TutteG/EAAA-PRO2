package opgave2;

import java.util.LinkedList;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Dictionary<K, V> implements IDictionary<K, V> {

	private LinkedList<Node> nodes;

	public Dictionary() {
		// TODO Auto-generated constructor stub
		this.nodes = new LinkedList<Node>();
	}

	@Override
	public V get(K key) {
		for (Node<?, ?> node : nodes) {
			if (node.key.equals(key)) {
				return (V) node.value;
			}
		}
		return null;

	};

	@Override
	public boolean isEmpty() {
		return nodes.isEmpty();
	}

	@Override
	public V put(K key, V value) {
		int i = 0;
		while (i < nodes.size()) {
			if (nodes.get(i).key.equals(key)) {
				V returnValue = (V) nodes.get(i).value;
				nodes.get(i).value = value;
				return returnValue;
			}
			i++;
		}
		Node<K, V> node = new Node<K, V>();
		node.key = key;
		node.value = value;
		nodes.add(node);
		return null;
	}

	@Override
	public V remove(K key) {
		int i = 0;
		while (i < nodes.size()) {
			if (nodes.get(i).key.equals(key)) {
				V returnValue = (V) nodes.get(i).value;
				nodes.remove(i);
				return returnValue;
			}
			i++;
		}
		return null;
	}

	@Override
	public int size() {
		return nodes.size();
	}
}

class Node<K, V> {
	K key;
	V value;
}