import java.util.Scanner;
/**
 * Solution class.
 * @param args [description]
 */
final class Solution{
	/**
	 * private default constructor.
	 */
	private Solution() { }
	/**
	 * main method.
	 * @param args [description]
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numOfStocks = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < 6; i++) {
            int count = 0;
            MinPQ<Stock> min = new MinPQ<>();
            MaxPQ<Stock> max = new MaxPQ<>();
            while (count < numOfStocks) {
                String[] tokens = sc.nextLine().split(",");
                Stock stocks = new Stock(tokens[0],
                    Double.parseDouble(tokens[1]));
                min.insert(stocks);
                max.insert(stocks);
                count++;
            }
            BinarySearchST<String, Double> best = new  BinarySearchST<>();
            BinarySearchST<String, Double> worst = new BinarySearchST<>();
            for (int j = 0; j < 5; j++) {
                Stock maxbest = max.delMax();
                System.out.println(maxbest);
                best.put(maxbest.getName(), maxbest.getpercentageDiff());
            }
            System.out.println();
            for (int k = 0; k < 5; k++) {
                Stock minworst = min.delMin();
                System.out.println(minworst);
                worst.put(minworst.getName(), minworst.getpercentageDiff());
            }
            System.out.println();
        }
    }
}



