package opgave2;

public interface IDequeue {
	public void addFirst(Object e);

	public void addLast(Object e);

	public Object removeFirst();

	public Object removeLast();

	public Object getFirst();

	public Object getLast();

	public int size();

	public boolean isEmpty();
}
