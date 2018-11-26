package opgave4;

import queues.Queue;

public class StackQueue<T> implements Queue<T> {
	Arraystack<T> stack = new Arraystack<T>();

	@Override
	public void enqueue(T newElement) {
		if (isEmpty()) {
			stack.push(newElement);
		} else {
			Arraystack<T> tempArraystack = new Arraystack<T>();
			int size = size();
			for (int i = 0; i < size; i++) {
				T element = stack.pop();
				tempArraystack.push(element);
			}
			stack = new Arraystack<T>();
			stack.push(newElement);
			for (int i = 0; i < size; i++) {
				T element = tempArraystack.pop();
				stack.push(element);
			}
		}
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public T dequeue() {
		if (!isEmpty()) {
			return stack.pop();
		}
		return null;
	}

	@Override
	public T getFront() {
		if (!isEmpty()) {
			return stack.peek();
		}
		return null;
	}

	@Override
	public int size() {
		return stack.size();
	}

}
