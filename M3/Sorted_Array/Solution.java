import java.util.Scanner;

public  class Solution {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        Sort s = new Sort();
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        sc.nextLine();
        int[] intarr1 = new int[size1];
        int[] intarr2 = new int[size2];
        String[] arr1 = sc.nextLine().split(",");
        String[] arr2 = sc.nextLine().split(",");
        for (int i = 0; i < size1; i++) {
            intarr1[i] = Integer.parseInt(arr1[i]);
        }
        for (int j = 0; j < size2; j++) {
            intarr2[j] = Integer.parseInt(arr2[j]);
        }
        if (size1 == 0) {
            int value;
            for (value = 0; value < size2 - 1; value++) {
                System.out.print(intarr2[value] + ",");
            }
            System.out.print(intarr2[value]);

        } else {
        s.sortarray(intarr1, intarr2, size1, size2);
        }
    }
}
