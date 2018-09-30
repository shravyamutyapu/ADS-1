import java.util.Scanner;
/**
* Solution class.
 */
final class Solution {
	/**
	 * default constructor.
	 */
	private Solution() { }
	/**
	 * main method.
	 * @param args [description]
	 */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < num; i++) {
            Operations obj = new Operations();
            String line = scan.nextLine();
            String[] values = line.split(" ");
            int value = Integer.parseInt(values[0]);
            int step = Integer.parseInt(values[1]);
            for (int j = 0; j < value; j++) {
                obj.insertAtTail(j);
            }
            int[] josephus = obj.josephus(step, value);
            for (int j = 0; j < josephus.length - 1; j++) {
                System.out.print(josephus[j] + " ");
            }
            System.out.println(josephus[josephus.length - 1]);
        }
    }
}
