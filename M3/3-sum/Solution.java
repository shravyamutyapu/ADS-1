import java.util.Scanner;
import java.util.Arrays;

final class Solution {

private Solution() {
}

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum sum = new Sum();
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        sum.countMethod(arr);
    }
}

class Sum {

    public void countMethod(final int[] arr1) {
        int count = 0;
        Arrays.sort(arr1);
        int size = arr1.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                int temp = -(arr1[i] + arr1[j]);
                    if (binarySearch(arr1, temp, j + 1) != -1) {
                        count++;
                    }
            }
        }
        System.out.println(count);
    }

public static int binarySearch(final int[] a, final int key, final int low1) {
        int hi = a.length - 1;
        int lo = low1;
         while (lo <= hi) {
         int mid = lo + (hi - lo) / 2;
         if (key < a[mid]) {
            hi = mid - 1;
         } else if (key > a[mid]) {
            lo = mid + 1;
        } else {
        return mid;
        }
    }
    return -1;
    }
}




