import java.util.Scanner;
/**
 * class Cubesum.
 */
class CubeSum implements Comparable<CubeSum> {
    /**
     * sum method.
     */
    long sum;
    /**
     * int i.
     */
    int i;
    /**
     int j.
     */
    int j;
/**
 * this methods is used to cube the digits.
 * @param i int.
 * @param j int.
 *
 * @return [description]
 */
    public CubeSum(int i, int j) {
        this.sum = i * i * i + j * j * j;
        this.i = i;
        this.j = j;
    }
/**
 it is used to compare the elements.
 * @param that Cubesum.
 * @return int.
 */
    public int compareTo(CubeSum that) {
        if (this.sum < that.sum) return -1;
        if (this.sum > that.sum) return +1;
        return 0;
    }
/**
 * String to string method is used to print the elements
 * @return sum.
 */
    public String toString() {
        return sum + "";
    }

}
/**
 * class Solution.
 */
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int n = 1000;

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
                if (pair == M) {
                    nth++;
                }
                if (N == nth) {
                    System.out.println(current);
                    break;
                }
            } else {
                pair = 1;
            }

            previous = current;
            if (current.j < n)
                pq.insert(new CubeSum(current.i, current.j + 1));
        }
    }

}