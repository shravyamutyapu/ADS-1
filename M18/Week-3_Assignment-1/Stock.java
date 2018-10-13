import java.util.*;
class Stock implements Comparable<Stock>{
	private String stockName;
	private double percentageDiff;

	Stock(String name, double diff){
		this.stockName = name;
		this.percentageDiff = diff;
	}
	public String getName() {
		return stockName;
	}
	public double getpercentageDiff() {
		return percentageDiff;
	}
	public String toString(){
		return stockName+" "+percentageDiff;
	}
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