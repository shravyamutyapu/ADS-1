/**
 * stock class.
 */
class Stock implements Comparable<Stock> {
	/**
	 * Stock Name.
	 */
	private String stockName;
	/**
	 * percentage difference.
	 */
	private double percentageDiff;
    /**
     * constructor.
     * @param name [stock name]
     * @param diff [stock diff]
     */
	Stock(String name, double diff) {
		this.stockName = name;
		this.percentageDiff = diff;
	}
	/**
	 * to get stock name.
	 * @return stockName
	 */
	public String getName() {
		return stockName;
	}
	/**
	 * to get percentage Difference.
	 * @return percentageDiff
	 */
	public double getpercentageDiff() {
		return percentageDiff;
	}
	/**
	 * toString() for stock.
	 * @return [String]
	 */
	public String toString() {
		return stockName + " " + percentageDiff;
	}
	/**
	 * compareTo method(overidden).
	 * @param that [stock Type]
	 * @return [int value]
	 */
	public int compareTo(final Stock that) {
		if (this.percentageDiff > that.getpercentageDiff()) {
			return 1;
		}
		if (this.percentageDiff < that.getpercentageDiff()) {
			return -1;
		}
		if (this.stockName.compareTo(that.getName()) > 0) {
			return 1;
		}
		if (this.stockName.compareTo(that.getName()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}