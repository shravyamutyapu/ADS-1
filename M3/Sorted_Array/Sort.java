import java.util.*;

class Sort {
    public void sortarray(final int[] a1, final int[] a2,
        final int len1, final int len2) {
        int[] res = new int[len1 + len2];
        int i = 0, j = 0, k = 0;
        int p;
        while (i < len1 && j < len2) {
            if (a1[i] < a2[j]) {
                res[k++] = a1[i++];
            } else {
                res[k++] = a2[j++];
            }
        }
        while (i < len1) {
            res[k++] = a1[i++];
        }
        while (j < len2) {
            res[k++] = a2[j++];
        }
        while (len1 == 0) {
            for (p = 0; p < len1; p++) {
            System.out.print(a1[p] + ",");
        }
        System.out.print(a1[p]);
        }
        for (p = 0; p < k - 1; p++) {
            System.out.print(res[p] + ",");
        }
        System.out.print(res[p]);
        }
    }