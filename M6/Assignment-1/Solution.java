import java.util.Scanner;
/**
 * classAddLargenumbers.
 */
final class AddLargeNumbers {
    /**
     * default private constructor.
     */

    private AddLargeNumbers() {
    }
    /**
     * @return linkedlist [description]
     */

    public static LinkedList numberToDigits(final String number) {
        LinkedList link = new LinkedList();
        for (int i = number.length() - 1; i >= 0; i--) {
            String str = "" + number.charAt(i);
            link.push(Integer.parseInt(str));
        }
        return link;
    }
    /**
     * @param list [description]
     * @return String [description]
     */

    public static String digitsToNumber(final LinkedList list) {
        return list.toString();
    }

}
/**
 * main class.
 */

public final class Solution {
    /**
     * default private constructor.
     */
    private Solution() {
    }
    /**
     * main method.
     * @param args [description]
     */

    public static void main(final String[] args) {
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
        // case "addLargeNumbers":
        //     pDigits = AddLargeNumbers.numberToDigits(p);
        //     qDigits = AddLargeNumbers.numberToDigits(q);
        // LinkedList result =
// AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
//     System.out.println(AddLargeNumbers.digitsToNumber(result));
        //     break;
        default:
            break;
        }
    }
}