package binarytree;

public class Main {
	public static void main(String[] args) {
		BinaryTree<String> two = new BinaryTree<String>("2");
		BinaryTree<String> four = new BinaryTree<String>("4");

		BinaryTree<String> plus = new BinaryTree<String>("+", two, four);
		BinaryTree<String> seven = new BinaryTree<String>("7");
		BinaryTree<String> three = new BinaryTree<String>("3");
		BinaryTree<String> eight = new BinaryTree<String>("8");

		BinaryTree<String> rootRight = new BinaryTree<String>("+", three, eight);
		BinaryTree<String> rootLeft = new BinaryTree<String>("*", plus, seven);
		BinaryTree<String> root = new BinaryTree<String>("+", rootLeft, rootRight);

		System.out.println(root.countElements("+"));
		root.inOrder();
		System.out.println("= " + root.value());
	}
}
