package opgave3;

/**
 * A binary tree in which each node has two children.
 */
public class BinaryTree<E> {
	private Node root;

	/**
	 * Constructs an empty tree.
	 */
	public BinaryTree() {
		root = null;
	}

	/**
	 * Constructs a tree with one node and no children.
	 *
	 * @param rootData the data for the root
	 */
	public BinaryTree(E rootData) {
		root = new Node();
		root.data = rootData;
		root.left = null;
		root.right = null;
	}

	/**
	 * Constructs a binary tree.
	 *
	 * @param rootData the data for the root
	 * @param left     the left subtree
	 * @param right    the right subtree
	 */
	public BinaryTree(E rootData, BinaryTree<E> left, BinaryTree<E> right) {
		root = new Node();
		root.data = rootData;
		if (left != null) {
			root.left = left.root;
		}
		if (right != null) {
			root.right = right.root;
		}
	}

	/**
	 * Checks whether this tree is empty.
	 *
	 * @return true if this tree is empty
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * Gets the data at the root of this tree.
	 *
	 * @return the root data
	 */
	public E data() {
		return root.data;
	}

	/**
	 * Gets the left subtree of this tree.
	 *
	 * @return the left child of the root
	 */
	public BinaryTree<E> left() {
		BinaryTree<E> result = new BinaryTree<E>();
		result.root = root.left;
		return result;
	}

	/**
	 * Gets the right subtree of this tree.
	 *
	 * @return the right child of the root
	 */
	public BinaryTree<E> right() {
		// TODO exercise 1
		BinaryTree<E> result = new BinaryTree<E>();
		result.root = root.right;
		return result;
	}

	/**
	 *
	 * @param rootData the new data for the root
	 * @return the data previous in the root
	 */
	public E replace(E rootData) {
		// TODO exercise 1
		E data = root.data;
		root.data = rootData;
		return data;
	}

	/**
	 * The size of the tree
	 *
	 * @return the number of nodes in the tree
	 */
	public int size() {
		return size(root);
	}

	// Private recursive helper method
	private int size(Node n) {
		// TODO exercise 1
		if (n == null) {
			return 0;
		} else {
			return 1 + size(n.left) + size(n.right);
		}
	}

	public int height() {
		return height(root);
	}

	private int height(Node n) {
		if (n == null) {
			return 0;
		} else {
			return 1 + Math.max(height(n.left), height(n.right));
		}
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node n) {
		if (n != null) {
			inOrder(n.left);
			System.out.println(n.data);
			inOrder(n.right);
		}
	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node n) {
		if (n != null) {
			System.out.println(n.data);
			preOrder(n.left);
			preOrder(n.right);
		}
	}

	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(Node n) {
		if (n != null) {
			postOrder(n.left);
			postOrder(n.right);
			System.out.println(n.data);
		}
	}

	public int sum() {
		return sum(root);
	}

	private int sum(Node n) {
		if (n != null && n.data instanceof Integer) {
			return (int) n.data + sum(n.left) + sum(n.right);
		} else {
			return 0;
		}
	}

	public double avg() {
		return 1.0 * sum() / size();
	}

	private class Node {
		public E data;
		public Node left;
		public Node right;
	}
}
