class LinkedList {
	private int length = 0;
    private Node first = null;
    private Node last = null;
    private class Node {
        private String item;
        private Node next;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public void push(final String item) {
        if (first == null) {
            first = new Node();
            first.item = item;
            first.next = null;
            last = first;
        } else {
            Node oldfirst = first;
            first = new Node();
            first.item = item;
            first.next = oldfirst;
        }
        length++;
    }
    public void pop() {
        if (first != null) {
            first = first.next;
            length--;
        }
    }
    public String top() {
        return first.item;
    }
    public int size() {
        return length;
    }
    public String displayAll() {
        if (length != 0) {
            String s = "";
            Node temp = first;
            while (temp != null) {
                s += temp.item;
                temp = temp.next;
            }
            return s;
        }
        return "";
    }
}