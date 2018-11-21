package opgave1;

import java.util.LinkedList;

import queues.Queue;

public class LinkedListQueue implements Queue {
	LinkedList<Object> list = new LinkedList<Object>();

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void enqueue(Object newElement) {
		list.add(newElement);
	}

	@Override
	public Object dequeue() {
		Object obj = list.get(0);
		list.remove(0);
		return obj;
	}

	@Override
	public Object getFront() {
		return list.get(0);
	}

	@Override
	public int size() {
		return list.size();
	}

}
