package opgave2;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Dequeue implements IDequeue {
	private LinkedList<Object> list = new LinkedList<Object>();

	@Override
	public void addFirst(Object e) {
		list.addFirst(e);
	}

	@Override
	public void addLast(Object e) {
		list.addLast(e);
	}

	@Override
	public Object removeFirst() {
		try {
			return list.removeFirst();
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	@Override
	public Object removeLast() {
		try {
			return list.removeLast();
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	@Override
	public Object getFirst() {
		try {
			return list.getFirst();
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	@Override
	public Object getLast() {
		try {
			return list.getLast();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return list.toString();
	}
}
