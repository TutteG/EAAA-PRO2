package opgave1;

import queues.Queue;

public class LinkedListQueue<T extends Comparable<T>> implements Queue<T> {
	LinkedList<T> list = new LinkedList<T>();

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void enqueue(T newElement) {
		list.addElement(newElement);
	}

	@Override
	public T dequeue() {
		T obj = getFront();
		if (obj != null) {
			list.removeElement(obj);
		}
		return obj;
	}

	@Override
	public T getFront() {
		return list.getFirst();
	}

	@Override
	public int size() {
		return list.size();
	}

}
