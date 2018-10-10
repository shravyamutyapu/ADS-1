import java.util.Scanner;
/**
 * Solution class.
 */
final class Solution {
	/**
	 * private default constructor.
	 */
	private Solution() { }
	/**
	 * main method .
	 * @param args [argument]
	 */
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] keys = sc.nextLine().split(" ");
		int size = keys.length;
		SearchTable st = new SearchTable(size);
		for (int i = 0; i < size; i++) {
			st.put(keys[i], i);
		}
		while (sc.hasNext()) {
			String[] functions = sc.nextLine().split(" ");
			switch (functions[0]) {
			case "floor":
				System.out.println(st.floor(functions[1]));
				break;
			case "max":
				System.out.println(st.max());
				break;
			case "contains":
				System.out.println(st.contains(functions[1]));
				break;
			case "get":
				System.out.println(st.get(functions[1]));
				break;
			case "keys":
				st.keys();
				break;
			case "rank":
				System.out.println(st.rank(functions[1]));
				break;
			case "deleteMin":
				st.deleteMin();
			default:
				break;
			}
		}
	}
}