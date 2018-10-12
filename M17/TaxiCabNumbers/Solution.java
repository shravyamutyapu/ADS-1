import java.util.Scanner;
/**
 * class Solution.
 */
final class Solution {
    /**
     * default private constructor.
     */
    private Solution() { }
    /**
     * main method.
     * @param args [description]
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int m = sc.nextInt();
        final int th = 1000;
        int n = th;


        // initialize priority queue
        MinPQ<CubeSum> pq = new MinPQ<CubeSum>();
        for (int i = 1; i <= n; i++) {
            pq.insert(new CubeSum(i, i));
        }

        int pair = 1;
        int nth = 0;

        CubeSum previous = new CubeSum(0, 0);

        // find smallest sum, print it out, and update
        while (!pq.isEmpty()) {
            CubeSum current = pq.delMin();
            if (current.sum == previous.sum) {
                pair++;
                if (pair == m) {
                    nth++;
                }
                if (n1 == nth) {
                    System.out.println(current);
                    break;
                }
            } else {
                pair = 1;
            }

            previous = current;
            if (current.j < n) {
                pq.insert(new CubeSum(current.i, current.j + 1));
            }
        }
    }
}