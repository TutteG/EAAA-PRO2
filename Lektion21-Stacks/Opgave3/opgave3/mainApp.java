package opgave3;

public class mainApp {
	public static void main(String[] args) {
//		DropOutStackArray<Integer> stack = new DropOutStackArray<Integer>(7);
//		stack.push(5);
//		stack.push(5);
//		stack.push(5);
//		stack.push(5);
//		System.out.println(stack);
//		stack.push(5);
//		stack.push(10);
//		System.out.println(stack);
//		stack.push(10);
//		System.out.println(stack);
//
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//
//		System.out.println(stack);
//		stack.push(10);
//		System.out.println(stack);
//		stack.push(15);
//		stack.push(15);
//		stack.push(15);
//
//		System.out.println(stack);

		DropOutStackLinkedList<Integer> stack = new DropOutStackLinkedList<Integer>(5);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		System.out.println(stack);

		stack.push(10);
		System.out.println(stack);

		System.out.println(stack.pop());
		System.out.println(stack);

		stack.push(11);
		System.out.println(stack);
		stack.push(11);
		System.out.println(stack);
	}
}
