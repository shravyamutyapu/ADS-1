import java.util.Scanner;
import java.util.Arrays;
class Solution {
    private Solution() { }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count = 1, sum = 0;
        int[] arr;
        num = Integer.parseInt(sc.nextLine());
        arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(arr);
        for (int i = 1; i < num; i++) {
            if (arr[i] == arr[i - 1]) {
                count += 1;
            } else {
                sum = sum + count * (count - 1) / 2;
                count = 1;
            }
        }
        sum = sum + count * (count - 1) / 2;
        System.out.println(sum);
    }
}