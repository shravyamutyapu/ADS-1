import java.util.Scanner;
/**
 * Solution class.
 */
class Solution {
    /**
     * default constructor.
     */
    private Solution() { }
    /**
     * main method.
     * @param args [description]
     */
    public static void main(final String[] args) {
        Team[] teams = new Team[10];
        int size = 0;
        Scanner scan = new Scanner(System.in);
        Table t = new Table();
        while (scan.hasNext()) {
            String[] line = scan.nextLine().split(",");
            teams[size++] = new Team(line[0], Integer.parseInt(line[1]),
                                     Integer.parseInt(line[2]), Integer.parseInt(line[3]));
        }
        System.out.println(t.leaderboard(teams, size));
    }
}