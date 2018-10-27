/**
 * importing scanner;
 */
import java.util.Scanner;
/**
 * solution class.
 */
final class Solution {
	/**
	 * main method
	 * @param args [description]
	 */
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		LinearProbingHashST<Student, String> hash =
		    new LinearProbingHashST<Student, String>();
		int recordCount = Integer.parseInt(sc.nextLine());
		while (recordCount > 0) {
			String[] rec = sc.nextLine().split(",");

			hash.put(new Student (rec[1], Double.parseDouble(rec[2])), rec[0]);
			recordCount--;
		}
		int queries = Integer.parseInt(sc.nextLine());
		while (queries > 0) {
			String[] line = sc.nextLine().split(" ");
			//checks for the requirement.
			if (line[0].equals("BE")) {
				double less = Double.parseDouble(line[1]);
				double great = Double.parseDouble(line[2]);
				for (Student each : hash.keys()) {
					if (each.getMarks() >= less && each.getMarks() <= great) {
						System.out.println(each.getName());
					}
				}
			} else if (line[0].equals("LE")) {
				double value = Double.parseDouble(line[1]);
				for (Student each : hash.keys()) {
					if (each.getMarks() <= value) {
						System.out.println(each.getName());
					}
				}
			} else if (line[0].equals("GE")) {
				double value = Double.parseDouble(line[1]);
				for (Student each : hash.keys()) {
					if (each.getMarks() >= value) {
						System.out.println(each.getName());
					}
				}
			}
			queries--;
		}
	}
}