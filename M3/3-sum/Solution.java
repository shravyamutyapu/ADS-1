import java.util.Scanner;
import java.util.Arrays;
class Solution {
	// int size;
	// int[] arr;
	// // Solution(int[] arr,int size1){
	// 	arr = new int[size];
	// 	size = 0;
	// }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		long[] arr = new long[size];
		for (int i = 0; i < size; i++) {
			arr[i] = Long.parseLong(sc.nextLine());

		}
		long count = 0;
		for(int i = 0;i<size;i++){
			for(int j =i+1;j<size;j++){
				for(int k = j+1;k<size;k++ ){
				if(arr[i]+arr[j]+arr[k] == 0) {
					count++;
				}

			}
		}
		//System.out.println(Arrays.toString(arr));
	}
	System.out.println(count);
}
	// public String toString() {
 //    // Replace the code below
 //    if (size == 0) {
 //      return "[]";
 //    }
 //    String str = "[";
 //    int i = 0;
 //    for (i = 0; i < size - 1; i++) {
 //      str = str + list[i] + ",";
 //    }
 //    str = str + list[i] + "]";
 //    return str;

	// }
}
 //    String toString(){
	// 	int[] arr = "[";
	// 	for(int i=0;i<size;i++){
	// 		arr[i] = i +" ";

	// 	}
	// 	arr[size-1] = "]";
	// }
	// }
