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