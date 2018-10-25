import java.util.Scanner;
/**
 * solution class.
 */
public final class Solution {
    /**
     * private default constructor.
     */
    private Solution() { }
    /**
     *
     * @param  args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        SeparateChainingHashST<String, Integer> chaining = new
        SeparateChainingHashST<String, Integer>();
        String tokens = scan.nextLine();
        String[] magazineText = scan.nextLine().split(" ");
        for (int i = 0; i < magazineText.length; i++) {
            if (chaining.contains(magazineText[i])) {
                chaining.put(magazineText[i], chaining.get(magazineText[i]) + 1);
            } else {
                chaining.put(magazineText[i], 1);
            }
        }
        String[] ransomeNote = scan.nextLine().split(" ");
        for (int i = 0; i < ransomeNote.length; i++) {
            if (chaining.contains(ransomeNote[i])) {
            if (chaining.get(ransomeNote[i]) == 0) {
                    System.out.print("No");
                    return;
                } else {
                	chaining.put(ransomeNote[i], chaining.get(ransomeNote[i]) - 1);
                }
            } else {
                System.out.print("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
