class LinkedList {

    private Node first = null;

    public class Node {

        Node() {
        }

        private int item;

        private Node next;

        Node(final int inputItem) {
            this.item = inputItem;
        }
    }

    public int top() {
        return first.item;
    }

    public void push(final int item) {
        Node nextAddress = new Node(item);
        nextAddress.next = first;
        first = nextAddress;
    }

    public int pop() {
        int output = first.item;
        first = first.next;
        return output;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public String toString() {
        Node head = first;
        String val = "";
        while (head != null) {
            val = val + head.item;
            head = head.next;
        }
        return val;
    }
}
