package opgave2;

public class SearchableArray<E extends Comparable<E>> extends SearchPattern<E> {
	private E[] list;
	private int i;

	public SearchableArray(E[] list) {
		// TODO Auto-generated constructor stub
		this.list = list;
	}

	@Override
	protected void init() {
		// TODO Auto-generated method stub
		i = 0;
	}

	@Override
	protected boolean isEmpty() {
		// TODO Auto-generated method stub
		return i < list.length ? false : true;
	}

	@Override
	protected E select() {
		// TODO Auto-generated method stub
		return list[i];
	}

	@Override
	protected void split(E m) {
		// TODO Auto-generated method stub
		i++;
	}

}
