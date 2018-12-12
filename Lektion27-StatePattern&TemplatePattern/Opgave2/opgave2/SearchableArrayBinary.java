package opgave2;

public class SearchableArrayBinary<E extends Comparable<E>> extends SearchPattern<E> {
	private E[] list;
	private int left;
	private int right;
	private int middle;

	public SearchableArrayBinary(E[] list) {
		// TODO Auto-generated constructor stub
		this.list = list;
	}

	@Override
	protected void init() {
		// TODO Auto-generated method stub
		left = 0;
		right = list.length - 1;
	}

	@Override
	protected boolean isEmpty() {
		// TODO Auto-generated method stub
		return right >= left ? false : true;
	}

	@Override
	protected E select() {
		// TODO Auto-generated method stub
		middle = (left + right) / 2;
		return list[middle];
	}

	@Override
	protected void split(E m) {
		// TODO Auto-generated method stub
		if (select().compareTo(m) > 0) {
			right = middle - 1;
		} else {
			left = middle + 1;
		}
	}

}
