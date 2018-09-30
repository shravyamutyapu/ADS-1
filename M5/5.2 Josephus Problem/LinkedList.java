import java.util.Arrays;
/**
 * node class.
 */
class Node {
    int item;
    Node next;
    Node(int data) {
        item = data;
        next = null;
    }
    public Node getAddress() {
        return next;
    }
    public void setAddress(Node address) {
        next = address;
    }

    public void setitem(int item1) {
        item = item1;
    }
}

class Operations {
    Node head;
    Node tail;
    int size;
    public void insertAtHead(int item) {
        Node start = new Node(item);
        size++;
        if (head == null) {
            head = start;
            tail = start;
            return;
        }
        start.setAddress(head);
        head = start;
        return;
    }

    public void insertAfterElement(int item, int element) {
        Node ins = new Node(element);
        Node temp1 = head;
        int flag = 0;
        while (temp1.item != item) {
            temp1 = temp1.getAddress();
            if (temp1.item == item) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            Node temp2 = temp1.getAddress();
            temp1.setAddress(ins);
            ins.setAddress(temp2);
            size++;
        }
    }

    public void insertAtTail(int item) {
        Node end = new Node(item);
        size++;
        if (head == null) {
            head = end;
            tail = end;
            return;
        }
        tail.next = end;
        tail = end;
        return;
    }

    public void popAtHead() {
        if (size == 0) {
            System.out.println("Deck is empty");
            return;
        }
        Node temp = head;
        head = head.getAddress();
        temp = null;
        size--;
    }

    public void popAtTail() {
        if (size == 0) {
            System.out.println("Deck is empty");
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.getAddress();
        }
        tail = temp;
        temp.next = null;
        size--;
    }
    public void deleteAfterElement(int item) {
        Node temp = head;
        while (temp.item != item) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    public String printList() {
        Node temp = head;
        String str = "[";
        if (size > 0) {
            while (temp.next != null) {
                str += temp.item + ", ";
                temp = temp.getAddress();
            }
            str += temp.item;
        }
        str += "]";
        return str;
    }
    public int size() {
        return size;
    }

    public int[] josephus(int m, int size) {
        int[] arr = new int[size];
        Node temp = head;
        int counter = 1;
        int i = 0;
        while (temp.next != null) {
            while (counter != m) {
                insertAtTail(temp.item);
                temp = temp.next;
                popAtHead();
                counter++;
            }
        arr[i++] = temp.item;
        temp = temp.next;
        counter = 1;
        popAtHead();
        }
        arr[i++] = temp.item;
        return arr;
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Operations op = new Operations();
    }
}
