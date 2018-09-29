import java.util.Scanner;
import java.util.LinkedList;
class LinkedList {

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

class AddLargeNumbers {

	public static LinkedList numberToDigits(String number) {
		String num1;
		LinkedList res = new LinkedList();
		for (int i =0;i<num1.length();i++) {
			res.push(number.charAt(i));
		}
		return res;
	}



// }

public static String digitsToNumber(LinkedList list) {
    LinkedList l1 ;
    Iterator<String> l1 = items.iterator();
}

public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
	// LinkedList list1 = null;
	// LinkedList list2 = null;

	// numberToDigits(num1);
	// numberToDigits(num2);

	return null;
}
}

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String p = sc.nextLine();
		String q = sc.nextLine();
		switch (input) {
		case "numberToDigits":
			LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
			LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
			System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
			System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
			break;

		case "addLargeNumbers":
			pDigits = AddLargeNumbers.numberToDigits(p);
			qDigits = AddLargeNumbers.numberToDigits(q);
			LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
			System.out.println(AddLargeNumbers.digitsToNumber(result));
			break;
		}
	}

}
