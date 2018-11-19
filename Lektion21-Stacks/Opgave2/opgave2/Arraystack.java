package opgave2;


@SuppressWarnings("unchecked")
public class Arraystack<T> implements Stack<T> {

	private T[] array = (T[]) new Object[0];

	@Override
	public void push(T element) {
		T[] temp = (T[]) new Object[array.length + 1];
		if (!isEmpty()) {
			for (int i = 0; i < array.length; i++) {
				temp[i] = array[i];
			}
		}
		temp[temp.length - 1] = element;
		array = temp;
	}

	@Override
	public T pop() {
		if (!isEmpty()) {
			T t = array[array.length - 1];
			T[] temp = array;
			array = (T[]) new Object[temp.length - 1];
			for (int i = 0; i < array.length; i++) {
				array[i] = temp[i];
			}
			return t;
		}
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
		// TODO Auto-generated method stub
		if (array.length > 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return array.length;
	}

}
