import java.util.Scanner;
/**
Solution class.
 **/
final class Solution {
    /**
     Default constructor.
     **/
    private Solution() {

    }
    /**
     * main function.
     * This method handles the input cases.
     * @param args String type.
     **/
    public static void main(final String[] args) {
        Mergesort merge = new Mergesort();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] lines = line.split(",");
            merge.sort(lines);
            System.out.println(merge.display(lines));
            System.out.println();
        }
    }
 }
