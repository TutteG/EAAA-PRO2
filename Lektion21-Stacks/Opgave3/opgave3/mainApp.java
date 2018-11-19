package opgave3;

public class mainApp {
	public static void main(String[] args) {
		DropOutStackArray<Integer> stack = new DropOutStackArray<Integer>(5);
		stack.push(5);
		stack.push(5);
		stack.push(5);
		stack.push(5);
		System.out.println(stack);
		stack.push(5);
		stack.push(10);
		System.out.println(stack);
		stack.push(10);
		System.out.println(stack);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println(stack);
		stack.push(10);
		System.out.println(stack);
		stack.push(15);
		stack.push(15);
		stack.push(15);

		System.out.println(stack);

	}
}
