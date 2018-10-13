import java.util.Scanner;
final class Solution {
    /**
     * private default consttructor..
     */
    private Solution() {
        //unused.
    }
    /**
     * main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        BinarySearchST<String, Integer> maxST =
        new  BinarySearchST<>();
        BinarySearchST<String, Integer> minST =
        new BinarySearchST<>();
        int numOfStacks = Integer.parseInt(scan.nextLine());
        final int six = 6;
        final int five = 5;
        for (int i = 0; i < six; i++) {
            int count = 0;
            MinPQ<Stock> min = new MinPQ<>();
            MaxPQ<Stock> max = new MaxPQ<>();
            while (count < numOfStacks) {
                String[] stockDetails =
                scan.nextLine().split(",");
                Stock stockobj = new Stock(stockDetails[0],
                    Double.parseDouble(stockDetails[1]));
                min.insert(stockobj);
                max.insert(stockobj);
                count++;
            }
            for (int j = 0; j < five; j++) {
                Stock best = max.delMax();
                if (maxST.contains(best.getName())) {
                    int value = maxST.get(
                        best.getName());
                    maxST.put(best.getName(),
                        ++value);
                } else {
                    maxST.put(best.getName(), 1);
                }
                System.out.println(best);
            }
            System.out.println();
            for (int k = 0; k < five; k++) {
                Stock worst = min.delMin();
                if (minST.contains(worst.getName())) {
                    int valuemin = minST.get(
                        worst.getName());
                    minST.put(worst.getName(),
                        ++valuemin);
                } else {
                    minST.put(worst.getName(), 1);
                }
                System.out.println(worst);
            }
            System.out.println();
        }
        int queryLength = Integer.parseInt(scan.nextLine());
        for (int l = 0; l < queryLength; l++) {
            String[] queryTokens = scan.nextLine().split(",");
            if (queryTokens[0].equals("get")) {
                if (queryTokens[1].equals("maxST")) {
                    if (!maxST.contains(queryTokens[2])) {
                        System.out.println("0");
                    } else {
                        System.out.println(
                            maxST.get(queryTokens[2]));
                    }
                } else {
                    if (!minST.contains(queryTokens[2])) {
                        System.out.println("0");
                    } else {
                        System.out.println(
                            minST.get(queryTokens[2]));
                    }
                }
            }
        }

    }
}