/**
 * for scanner function.
 */
import java.util.Scanner;
/**
 * solution class.
 */
final class Solution{
	/**
	 * default private constructor.
	 */
	private Solution() {
		//unused.
	}
	/**
	 * main method.
	 * @param args [description]
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinearProbingHashST<String, Student> hash =
      new LinearProbingHashST<String, Student>();
		int numOfRecords = Integer.parseInt(sc.nextLine());
		while(numOfRecords>0){
			String[] record = sc.nextLine().split(",");
			hash.put(record[0],new Student(record[1],
				Double.parseDouble(record[2])));
			numOfRecords = numOfRecords - 1 ;
		}
		/**
		 * The following is the code for performing queries.
		 */
		int getting = Integer.parseInt(sc.nextLine());
          while (getting > 0) {
              String[] line = sc.nextLine().split(" ");
              if (line[2].equals("2")) {
              	//checks for key in hash table.
                  if (hash.contains(line[1])) {
                      System.out.println(hash.get(line[1]).getMarks());
                  }
                  else {
                      System.out.println("Student doesn't exists...");
                  }
              } else if (line[2].equals("1")) {
                  if (hash.contains(line[1])) {
                      System.out.println(hash.get(line[1]).getName());
                  } else {
                      System.out.println("Student doesn't exists...");
                  }
              }
              getting--;
          }
	}
}