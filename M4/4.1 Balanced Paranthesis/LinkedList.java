public class LinkedList {

    Node first = null;
    class Node {
        char item;
        Node nextAddress;
    }
    public char top() {
        return first.item;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public void push(final char item) {

        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.nextAddress = oldfirst;
    }
    public char pop() {
        char item = first.item;
        first = first.nextAddress;
        return item;
    }
}
