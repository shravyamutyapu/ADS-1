import java.util.Scanner;
/**
 * linkedlist class.
 */
class LinkedStackOfStrings {
    /**
     * node.
     */
    private Node first = null;
    /**
     * inner class.
     */
    private class Node {
        char item;
        Node nextAddress;
    }
    /**
     * returns top of the stack.
     */
    public char top() {
        return first.item;
    }
    /**
     * checks if it is empty.
     * @return boolean value.[description]
     */
    public boolean isEmpty() {
        return first == null;
    }
    /**
     * push method.
     * @param item [description]
     */
    public void push(char item) {

        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.nextAddress = oldfirst;
    }
    /**
     * pop method that returns char.
     */
    public char pop() {
        char item = first.item;
        first = first.nextAddress;
        return item;
    }
}
/**
 * Solution class.
 */
public class Solution {
    /**
     * main method.
     * @param args [description]
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size; i++) {
            String line = sc.next();
            if (checkParanthesis(line)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
    public static boolean checkParanthesis(String s) {
        LinkedStackOfStrings obj = new LinkedStackOfStrings();
        int sLength = s.length();
        for (int i = 0; i < sLength; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                obj.push(ch);
            } else {
                if (obj.isEmpty()) return false;
                if (ch == ')' && obj.top() == '(') {
                    obj.pop();
                } else if (ch == '}' && obj.top() == '{') {
                    obj.pop();
                } else if (ch == ']' && obj.top() == '[') {
                    obj.pop();
                } else {
                    return false;
                }
            }

        }
        return obj.isEmpty();
    }
}