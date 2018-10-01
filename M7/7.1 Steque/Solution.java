import java.util.Scanner;
/**
 * Solution class contains main method.
 */
final class Solution {
    /**
     * default private constructor.
     */
    private Solution() { }
    /**
     * main method.
     * In this method we take the input from the user.
     * An object for LinkedList is created.
     * Then the items are pushed into the stack and
     * the required operations are made.
     * We use switch case in the main method to determine
     *  the input and the actions.
     *  For the push we call PushAtStart with the parameter item.
     *  For enqueue we call PushAtEnd with the parameter item.
     *  For pop we call popAt Start.
     *  For every action we call the displayAll method,
     *  So that the output is printed all the times.
     * @param args [description]
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            LinkedList obj = new LinkedList();
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                if (str.equals("")) {
                    System.out.println("");
                    break;
                } else {
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
                    // if(token[0].equals("")){
                    //     System.out.println();
                    //     break;
                    // }
                }

            }
        }
    }
}
