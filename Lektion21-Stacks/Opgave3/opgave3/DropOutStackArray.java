package opgave3;

import opgave1.Stack;

@SuppressWarnings("unchecked")
public class DropOutStackArray<T> implements Stack<T> {
	private int MAXSIZE = 0;
	private int currentIndex = 0;
	private boolean full = false;

	T[] array;

	public DropOutStackArray(int MAXSIZE) {
		this.MAXSIZE = MAXSIZE;
		array = (T[]) new Object[MAXSIZE];
	}

	@Override
	public void push(T element) {
		if (!full) {
			array[currentIndex] = element;
			currentIndex++;
		} else {
			for (int i = 0; i < array.length; i++) {
				if (i + 1 != array.length) {
					array[i] = array[i + 1];
				} else {
					array[i] = element;
					currentIndex = i;
					break;
				}
			}

		}
		if (array[array.length - 1] == null) {
			full = false;
		} else {
			full = true;
		}
	}

	@Override
	public T pop() {
		if (!isEmpty()) {
			T t = null;
			for (int i = array.length - 1; i > 0; i--) {
				if (array[i] != null) {
					t = array[i];
					array[i] = null;
					currentIndex = i;
					break;
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
			return array[array.length - 1];
		} else {
			return null;
		}
	}

	@Override
	public boolean isEmpty() {
		if (array[0] == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int size() {
		return array.length;
	}

	@Override
	public String toString() {
		String string = "";
		for (int i = 0; i < array.length; i++) {
			string += array[i] + " ";
		}

		return string;
	}
}
