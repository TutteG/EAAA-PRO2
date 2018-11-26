package opgave3;

import java.util.LinkedList;
import java.util.NoSuchElementException;

import queues.Queue;
import queues.Rand;

public class CircularList<T> implements Queue<T> {
	private LinkedList<T> list = new LinkedList<T>();
	private int head = 0;
	private int tail = 0;

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void enqueue(T newElement) {
		list.add(newElement);
		tail++;
	}

	@Override
	public T dequeue() {
		try {
			tail--;
			return list.removeFirst();
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	public T pickRandom(int count) {
		Rand rand = new Rand(tail, 0);
		head = rand.randomInRange();
		try {
			T obj = null;
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

	public T pickRandom(int head, int count) {
		try {
			head = head - 1;
			T obj = null;
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
	public T getFront() {
		return list.getFirst();
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public String toString() {
		return list.toString();
	}
}
