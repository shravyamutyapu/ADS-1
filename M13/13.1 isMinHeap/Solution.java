import java.util.Scanner;
/**.
 * Class for heap.
 *
 * @param      <E>   { generic type }.
 */
class Heap<E extends Comparable<E>> {
    /**
     * minimum heap.
     * time complexity : O(n)
     * @param arr   The arr
     *
     * @return True if it is minimum heap.
     */
    public boolean isMinHeap(final E[] arr) {
        int index = arr.length - 1;
        while (index > 1) {
            if (arr[index].compareTo(arr[index / 2]) >= 0) {
                index = index - 1;
            } else {
                return false;
            }
        }
        return true;
    }
}
/**
 * Class for solution.
 */
final class Solution {
    /**
     * private default constructor.
     */
    private Solution() { }
    /**.
     * main function .
     * @param args The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        int testcases = Integer.parseInt(sc.nextLine());
        switch (type) {
            case "String":
            Heap<String> heap = new Heap<String>();
            for (int i = 0; i < testcases; i++) {
                String[] arr = sc.nextLine().split(",");
                String[] a = new String[arr.length + 1];
                int temp = 1;
                for (int j = 0; j < arr.length; j++) {
                    a[temp++] = arr[j];
                }
                System.out.println(heap.isMinHeap(a));
            }
            break;
            case "Float":
            Heap<Float> floatobj = new Heap<Float>();
            for (int i = 0; i < testcases; i++) {
                try {
                    String[] arr = sc.nextLine().split(",");
                    Float[] a = new Float[arr.length + 1];
                    int temp = 1;
                    for (int j = 0; j < arr.length; j++) {
                        a[temp++] = Float.parseFloat(arr[j]);
                    }
                    System.out.println(floatobj.isMinHeap(a));
                } catch (Exception e) {
                    System.out.println("false");
                }
            }
            break;
            case "Integer":
            Heap<Integer> intobj = new Heap<Integer>();
            for (int i = 0; i < testcases; i++) {
                String[] arr = sc.nextLine().split(",");
                Integer[] a = new Integer[arr.length + 1];
                int temp = 1;
                for (int j = 0; j < arr.length; j++) {
                    a[temp++] = Integer.parseInt(arr[j]);
                }
                System.out.println(intobj.isMinHeap(a));
            }
            break;
            case "Double":
            Heap<Double> doubleobj = new Heap<Double>();
            for (int i = 0; i < testcases; i++) {
                String[] arr = sc.nextLine().split(",");
                Double[] a = new Double[arr.length + 1];
                int temp = 1;
                for (int j = 0; j < arr.length; j++) {
                    a[temp++] = Double.parseDouble(arr[j]);
                }
                System.out.println(doubleobj.isMinHeap(a));
            }
            break;
            default:
            break;
        }
    }
}
