import java.util.Scanner;
final class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinearProbingHashST<String, Student> hash =
      new LinearProbingHashST<String, Student>();
		int numOfRecords = Integer.parseInt(sc.nextLine());
		while(numOfRecords>0){
			String[] record = sc.nextLine().split(",");
			hash.put(record[0],new Student(record[1],Double.parseDouble(record[2])));
			numOfRecords= numOfRecords - 1 ;
		}
		int getting = Integer.parseInt(sc.nextLine());
          while (getting > 0) {
              String[] get1 = sc.nextLine().split(" ");
              if (get1[2].equals("2")) {
                  if (hash.contains(get1[1])) {
                      System.out.println(hash.get(get1[1]));
                  }
                  else {
                      System.out.println("Student doesn't exists...");
                  }
              } else if (get1[2].equals("1")) {
                  if (hash.contains(get1[1])) {
                      System.out.println(hash.get(get1[1]));
                  } else {
                      System.out.println("Student doesn't exists...");
                  }
              }
              getting--;
          }
	}
}