import java.util.Scanner;
/**
 * Solution class.
 */
public final class Solution {
    private static final int ten = 10;
    private static final int three = 3;
    /**
     * default constructor.
     */
    private Solution() { }
    /**
     * main method.
     * @param args [description]
     */
    public static void main(final String[] args) {
        Team[] teams = new Team[ten];
        int size = 0;
        Scanner scan = new Scanner(System.in);
        Table t = new Table();
        while (scan.hasNext()) {
            String[] line = scan.nextLine().split(",");
            teams[size++] = new Team(line[0], Integer.parseInt(line[1]),
                Integer.parseInt(line[2]), Integer.parseInt(line[three]));
        }
        System.out.println(t.leaderboard(teams, size));
    }
}
