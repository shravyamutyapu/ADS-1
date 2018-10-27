import java.util.Scanner;
final class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinearProbingHashST<String, Student> hash =
		    new LinearProbingHashST<String, Student>();
		int recordCount = Integer.parseInt(sc.nextLine());
		while (recordCount > 0) {
			String[] rec = sc.nextLine().split(",");
			hash.put(rec[0], new Student (rec[1], Double.parseDouble(rec[2])));
			recordCount--;
		}
		int queries = Integer.parseInt(sc.nextLine());
		while (queries > 0) {
			String[] line = sc.nextLine().split(" ");
			if(line[0].equals("BE")) {
				if(hash.get(line[1]).getMarks()<=Double.parseDouble(line[1]) && hash.get(line[1]).getMarks()>=Double.parseDouble(line[2]))
				System.out.println(hash.get(line[1]).getName());
			}
			else
				if(line[1].equals("LE")) {
				System.out.println(hash.get(line[1]).getName());

			}
			else if(line[1].equals("GE")){
				System.out.println(hash.get(line[1]).getName());

			}
		}

		}
}