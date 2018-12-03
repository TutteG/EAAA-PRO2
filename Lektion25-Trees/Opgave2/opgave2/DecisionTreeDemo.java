package opgave2;

public class DecisionTreeDemo {
	public static void main(String[] args) {
		BinaryTree<Integer> bottom1 = new BinaryTree<Integer>(11, null, new BinaryTree<Integer>(15));
		BinaryTree<Integer> bottom2 = new BinaryTree<Integer>(30,
				new BinaryTree<Integer>(25, null, new BinaryTree<Integer>(77)), null);
		BinaryTree<Integer> bottom3 = new BinaryTree<Integer>(90, new BinaryTree<Integer>(88), null);

		BinaryTree<Integer> mid1 = new BinaryTree<Integer>(22, bottom1, bottom2);
		BinaryTree<Integer> mid2 = new BinaryTree<Integer>(90, null, bottom3);

		BinaryTree<Integer> root = new BinaryTree<Integer>(45, mid1, mid2);
		System.out.println(root.height());

		root.inOrder();
		root.preOrder();
		root.postOrder();
	}
}
