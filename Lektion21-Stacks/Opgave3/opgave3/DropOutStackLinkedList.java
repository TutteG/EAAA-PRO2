package opgave3;

import java.util.LinkedList;

import opgave1.Stack;

public class DropOutStackLinkedList<T> implements Stack<T> {
	private LinkedList<T> list;
	private int size;
	private boolean full = false;
	private int currentIndex = 0;

	public DropOutStackLinkedList(int size) {
		this.size = size;
		this.list = new LinkedList<T>();
	}

	@Override
	public void push(T element) {
		if (!full) {
			list.add(currentIndex, element);
			currentIndex++;
		} else {
			boolean done = false;
			for (int i = 0; i < list.size() && done != true; i++) {
				if (i + 1 != list.size()) {
					list.set(i, list.get(i + 1));
				} else {
					list.set(i, element);
					currentIndex = i;
					done = true;
				}
			}
		}
		if (list.size() == size) {
			full = true;
		} else {
			full = false;
		}
	}

	@Override
	public T pop() {
		if (!isEmpty()) {
			T t = null;
			boolean done = false;
			for (int i = list.size() - 1; i > 0 && done != true; i--) {
				if (list.get(i) != null) {
					t = list.get(i);
					list.remove(i);
					currentIndex = i;
					done = true;
				}
			}
			full = false;
			return t;
		}
		currentIndex = 0;
		return null;
	}

	@Override
	public T peek() {
		if (!isEmpty()) {
			return list.get(list.size() - 1);
		} else {
			return null;
		}
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String string = "";
		for (T t : list) {
			string += t.toString() + " ";
		}
		return string;
	}
}
