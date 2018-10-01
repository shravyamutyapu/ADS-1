class LinkedList {
    private int length = 0;

    private Node first = null;

    private Node last = null;

    private class Node {

        private int item;

        private Node next;
    }
    public boolean isEmpty() {
        return first == null;
    }
    /**
     * complexity 1.
     * @param item int.
     **/
    public void pushAtStart(final int item) {
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
     /**
     * complexity 1.
     * @param item int.
     **/
    public void pushAtEnd(final int item) {
        if (last == null || first == null) {
        //     last = new Node();
        //     last.item = item;
        //     last.next = null;
        //     first = last;
            pushAtStart(item);
        }   else {
            Node temp = last;
            last = new Node();
            last.item = item;
            last.next = null;
            temp.next = last;
        }
        length++;
    }
     /**
     * complexity 1.
     * @param item int.
     **/
    public void popAtStart() {
        if (first != null) {
            first = first.next;
            length--;
        }
    }
    public void popAtEnd() {
        if (last != null) {
            Node temp = first;
            while (temp.next.next != null) {

                temp = temp.next;
            }
            temp.next = null;
            last = temp;
            length--;
        }
    }

    public int top() {
        return first.item;
    }
    public int size() {
        return length;
    }
     /**
     * complexity N .
     * @param item int.
     **/
    public void displayAll() {
        if (length != 0) {
            String s = "";
            Node temp = first;
            while (temp != null) {
                s += temp.item + ", ";
                temp = temp.next;
            }
            // if(length == 1){
            //     System.out.println(s);
            // }
            System.out.println(s.substring(0, s.length() - 2));
        }
        else{
        System.out.println("Steque is empty.");
    }
    }
}