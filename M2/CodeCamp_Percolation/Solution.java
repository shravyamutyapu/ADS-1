import java.util.Scanner;
/**
 * class sescription.
 */
class Solution {
    /**
     * main method.
     * @param args [description]
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        Percolate obj = new Percolate(input);
        while (sc.hasNextLine()) {
            String[] input1 = sc.nextLine().split(" ");
            obj.open(Integer.parseInt(input1[0]) - 1, Integer.parseInt(input1[1]) - 1);
        }
        System.out.println(obj.isPercolate());
    }

}
/**
 * Percolate class.
 */
class Percolate {
    /**
     * .
     * @param size [description]
     */
    boolean[][] grid;
    WeightedQuickUnionUF obj;
    int size;
    Percolate(int size1) {
        this.size = size1;
        grid = new boolean[size1][size1];
        obj = new WeightedQuickUnionUF(size1 * size1 + 2);
    }
    public void open(final int row, final int column) {
        if (grid[row][column]) {
            return;
        }
        grid[row][column] = true;
        if (row == 0) {
            obj.union(convert(row, column), size * size);
        }
        if (row == size - 1) {
            obj.union(convert(row, column), size * size + 1);
        }
        if (row < size - 1 && grid[row + 1][column]) { //bottom element
            obj.union(convert(row, column), convert(row + 1, column));
        }
        if (row > 0 && grid[row - 1][column]) { //top element
            obj.union(convert(row, column), convert(row - 1, column));
        }
        if (column > 0 && grid[row][column - 1]) { //left element
            obj.union(convert(row, column), convert(row, column - 1));
        }
        if (column < size - 1 && grid[row][column + 1]) { //right element
            obj.union(convert(row, column), convert(row, column + 1));
        }


    }

    public boolean isPercolate() {
        return obj.connected(size * size, size * size + 1);
    }

    public int convert(final int i, final int j) {
        return i * size + j;
    }
}
