class BinarySearchTree<Key extends Comparable<Key>, Value> {
	Node head;
	int size;
	BinarySearchTree() {

	}
	private class Node {
		private BookDetails key;
		private Value value;
		private Node left;
		private Node right;
	}
	// time complexity is O (log N)
	public void put(BookDetails k, Value v) {
		if (k == null) {
			System.out.println("key is null");
		}

		head = put(head, k, v);
	}
	// time complexity is O (log N)
	public Node put(Node head, BookDetails k, Value v) {
		if (head == null) {
			Node n = new Node();
			n.key = k;
			n.value = v;
			n.left = null;
			n.right = null;
			head = n;
			size++;
		}
		int index = k.compareTo(head.key);
		if (index < 0) {
			head.left = put(head.left, k, v);
		} else if (index > 0) {
			head.right = put(head.right, k, v);
		} else {
			head.value = v;
		}
		return head;
	}
	// time complexity is O (log N)
	public Value get(BookDetails k) {
		return get(head, k);
	}
	// time complexity is O (log N)
	public Value get(Node head, BookDetails k) {
		if (k == null) {
			System.out.println("key is null");
		}
		if (head == null) {
			return null;
		}
		int index = k.compareTo(head.key);
		if (index < 0) {
			return get(head.left, k);
		} else if (index > 0) {
			return get(head.right, k);
		} else {
			return head.value;
		}
	}
}