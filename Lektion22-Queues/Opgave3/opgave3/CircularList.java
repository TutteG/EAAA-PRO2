package opgave3;

import java.util.LinkedList;
import java.util.NoSuchElementException;

import queues.Queue;
import queues.Rand;

public class CircularList implements Queue {
	private LinkedList<Object> list = new LinkedList<Object>();
	int head = 0;
	int tail = 0;

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void enqueue(Object newElement) {
		list.add(newElement);
		tail++;
	}

	@Override
	public Object dequeue() {
		try {
			tail--;
			return list.removeFirst();
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	public Object pickRandom(int count) {
		Rand rand = new Rand(tail, 0);
		head = rand.randomInRange();
		try {
			Object obj = null;
			for (int i = 0; i < count; i++) {
				if (head == tail) {
					head = 0;
				}
				obj = list.get(head);
				head++;
			}
			tail--;
			list.remove(obj);
			return obj;
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	@Override
	public Object getFront() {
		return list.getFirst();
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return list.toString();
	}
}
