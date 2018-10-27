import java.util.Scanner;
final class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinearProbingHashST<String, String> hash =
      new LinearProbingHashST<String, String>();
		int numOfRecords = Integer.parseInt(sc.nextLine());
		for(int i = 0;i<numOfRecords;i++){
			String[] record = sc.nextLine().split(",");
			hash.put(record[0],record[1]);
		}
		int getting = Integer.parseInt(sc.nextLine());
		for(int j =0;j<getting;j++){
			String[] get1 = sc.nextLine().split(" ");
			System.out.println(hash.get(get1[0]));
		}
	}
}