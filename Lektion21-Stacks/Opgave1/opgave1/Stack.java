package opgave1;

public interface Stack<T> {

	// Adds one element to the top of this stact
	public void push(T element);

	// Removes and returns the top element from this stack
	public T pop();

	// Returns without removing the top element of this stack
	public T peek();

	public boolean isEmpty();

	public int size();

	@Override
	public String toString();
}
