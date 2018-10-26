/**
 * importing scanner.
 */
 import java.util.Scanner;
 /**
  * Solution class.
  */
  final class Solution {
    /**
     * default private constructor.
     */
    private Solution() { }
    /**
     * Main function.
     * @param args String.
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearProbingHashST<String, Integer> hash =
        new LinearProbingHashST<String, Integer>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");
            switch (line[0]) {
                case "put":
                   hash.put(line[1], Integer.parseInt(line[2]));
                break;
                case "display":
                hash.display();
                break;
                case "get":
                  System.out.println(hash.get(line[1]));
                break;
                case "delete":
                hash.delete(line[1]);
                break;
                default:
                break;
            }
        }


    }
  }