import java.util.Scanner;
/**
 * Solution class.
 */
public final class Solution {
    /**
     * private default constructor.
     */
    private Solution() { }
    /**
     * @param args .
     */
    // time complexity for the main method is N
    // while loop iterates n times.
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        while (sc.hasNext()) {
            String input = sc.nextLine();
            String[] tokens = input.split(",");
            // System.out.println(Arrays.toString(tokens));
            switch (tokens[0]) {
                case"put":
                    bst.put(new BookDetails(tokens[1], tokens[2],
                     Float.parseFloat(tokens[2 + 1])),
                      Integer.parseInt(tokens[2 + 2]));
                    break;
                case"get":
                    System.out.println(bst.get(new BookDetails(tokens[1], tokens[2],
                     Float.parseFloat(tokens[2 + 1]))));
                    break;
                default:
                break;
            }
        }
    }
}