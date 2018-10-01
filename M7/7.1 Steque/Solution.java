import java.util.Scanner;
/**
 * Solution class contains main method.
 */
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
        LinkedList obj = new LinkedList();
            while (sc.hasNextLine()){
                String str = sc.nextLine();
                // if (str.equals("")){
                //     System.out.println(" ");
                //     break;
                // } else {
                    String[] token = str.split(" ");
                    switch (token[0]) {
                    case "push":
                        obj.pushAtStart(Integer.parseInt(token[1]));
                        obj.displayAll();
                        //System.out.println(obj.displayAll());
                        break;
                    case "pop":
                        obj.popAtStart();
                        obj.displayAll();
                        //System.out.println(obj.displayAll());
                        break;
                    case "enqueue":
                        obj.pushAtEnd(Integer.parseInt(token[1]));
                        obj.displayAll();
                        //System.out.println(obj.displayAll());
                        break;
                    default:
                    break;
                    }
                    if(token[0].equals("")){
                        System.out.println();
                        break;
                    }
                }

        }
    }
}
//}