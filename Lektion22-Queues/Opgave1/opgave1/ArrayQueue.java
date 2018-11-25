package opgave1;

import queues.Queue;

/**
 * An implementation of a queue using an array
 */
@SuppressWarnings("unchecked")
public class ArrayQueue<T> implements Queue<T> {

	T[] array;
	int index = 0;

	/**
	 * Constructs an empty queue.
	 */
	public ArrayQueue() {
		array = (T[]) new Object[10];
	}

	/**
	 * Checks whether this queue is empty.
	 *
	 * @return true if this queue is empty
	 */
	@Override
	public boolean isEmpty() {
		// TODO
		return size() == 0;
	}

	/**
	 * Adds an element to the tail of this queue.
	 *
	 * @param newElement the element to add
	 */
	@Override
	public void enqueue(T newElement) {
		// TODO
		if (size() == array.length) {
			T[] temp = array;
			array = (T[]) new Object[temp.length * 2];
			for (int i = 0; i < temp.length; i++) {
				array[i] = temp[i];
			}
		}
		array[index] = newElement;
		index++;
	}

	/**
	 * Removes an element from the head of this queue.
	 *
	 * @return the removed element
	 */
	@Override
	public T dequeue() {
		if (!isEmpty()) {
			T temp = array[0];
			index--;
			boolean done = false;
			for (int i = 0; i < array.length - 1 && done != true; i++) {
				if (array[i + 1] != null) {
					array[i] = array[i + 1];
				} else {
					array[i] = null;
					done = true;
				}
			}
			return temp;
		}
		return null;
	}

	/**
	 * Returns the head of this queue. The queue is unchanged.
	 *
	 * @return the head element
	 */
	@Override
	public T getFront() {
		// TODO
		if (!isEmpty()) {
			return array[0];
		}
		return null;
	}

	/**
	 * The number of elements on the queue.
	 *
	 * @return the number of elements in the queue
	 */
	@Override
	public int size() {
		// TODO
		int size = 0;
		boolean done = false;
		for (int i = 0; i < array.length && done != true; i++) {
			if (array[i] == null) {
				done = true;
			} else {
				size++;
			}
		}
		return size;
	}
}
