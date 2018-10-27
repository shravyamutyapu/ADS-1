import java.util.Scanner;
final class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinearProbingHashST<String, Student> hash =
      new LinearProbingHashST<String, Student>();
		int numOfRecords = Integer.parseInt(sc.nextLine());
		for(int i = 0;i<numOfRecords;i++){
			String[] record = sc.nextLine().split(",");
			hash.put(record[0],new Student(record[1],Double.parseDouble(record[2])));
		}
		int getting = Integer.parseInt(sc.nextLine());
		for(int j = 0;j<getting;j++){
			String[] get1 = sc.nextLine().split(" ");
			if(hash.contains(get1[0])) System.out.println(hash.get(get1[0]));
			else System.out.println("Student doesn't exists...");
		}
	}
}