/**
 * Binary Search Tree class .
 */
class BinarySearchTree<Key extends Comparable<Key>, Value> {
	Node head;
	int size;
	/**
	 * Binary Search Tree method.
	 */
	BinarySearchTree() { }
	/**
	 *
	 * @param N [description]
	 * @param v [description]
	 */
	private class Node {
		private BookDetails key;
		private Value value;
		private Node left;
		private Node right;
	}
	// time complexity is O (log N)
	/**
	 * @brief [brief description]
	 * @details [long description]
	 *
	 * @param bk [description]
	 * @param val [description]
	 */
	public void put(BookDetails bk, Value val) {
		if (bk == null) {
			System.out.println("key is null");
		}

		head = put(head, bk, val);
	}
	// time complexity is O (log N)
	public Node put(Node head, BookDetails bk, Value val) {
		if (head == null) {
			Node n = new Node();
			n.key = bk;
			n.value = val;
			n.left = null;
			n.right = null;
			head = n;
			size++;
		}
		int index = bk.compareTo(head.key);
		if (index < 0) {
			head.left = put(head.left, bk, val);
		} else if (index > 0) {
			head.right = put(head.right, bk, val);
		} else {
			head.value = val;
		}
		return head;
	}
	// time complexity is O (log N)
	public Value get(BookDetails bk) {
		return get(head, bk);
	}
	// time complexity is O (log N)
	public Value get(Node head, BookDetails bk) {
		if (bk == null) {
			System.out.println("key is null");
		}
		if (head == null) {
			return null;
		}
		int index = bk.compareTo(head.key);
		if (index < 0) {
			return get(head.left, bk);
		} else if (index > 0) {
			return get(head.right, bk);
		} else {
			return head.value;
		}
	}
}