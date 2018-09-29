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
     * @param number [description]
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

//     public static LinkedList addLargeNumbers(final LinkedList list1,
//         final LinkedList list2) {
//         Stack s1 = new Stack();
//         Stack s2 = new Stack();
//         int carry = 0;
//         String sum = "";
//         int num = 0;
//
//         while (!s1.isEmpty() || !s2.isEmpty()) {
//             num = s1.pop() + s2.pop() + carry;
//             carry = num / 10;
//             if (s1.size == 0) {
//                 sum += (num % 10);
//                 if (num / 10 != 0) {
//                     sum += (num / 10);
//                 }
//             }
//         }
//         String res = "";
//         for (int i = sum.length() - 1; i >= 0; i--) {
//             res += sum.charAt(i);
//         }
//         LinkedList result = numberToDigits(res);
//         return result;
//     }
// }

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
