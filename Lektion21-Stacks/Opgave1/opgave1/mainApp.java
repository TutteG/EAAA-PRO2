package opgave1;

public class mainApp {
	public static void main(String[] args) {
		Arraystack<Integer> stack = new Arraystack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println("Size: " + stack.size());
		stack.pop();
		System.out.println(stack.isEmpty());
		stack.pop();
		System.out.println(stack.isEmpty());
		System.out.println("Size: " + stack.size());
		System.out.println(stack.pop());

	}
}
