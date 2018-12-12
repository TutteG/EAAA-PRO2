package opgave2;

import java.util.List;

public class SearchableList<E extends Comparable<E>> extends SearchPattern<E> {
	private List<E> list;
	private int i;

	public SearchableList(List<E> list) {
		this.list = list;
	}
	// TODO: ???

	@Override
	protected void init() {
		// TODO Auto-generated method stub
		i = 0;
	}

	@Override
	protected boolean isEmpty() {
		// TODO Auto-generated method stub
		return i < list.size() ? false : true;
	}

	@Override
	protected E select() {
		// TODO Auto-generated method stub
		return list.get(i);

	}

	@Override
	protected void split(E m) {
		// TODO Auto-generated method stub
		i++;
	}
}