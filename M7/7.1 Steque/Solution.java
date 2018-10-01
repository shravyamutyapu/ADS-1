import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList obj = new LinkedList();
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {

			while (sc.hasNextLine()){
				String str = sc.nextLine();
				if (str ==" "){
					return;
				} else {
					String[] token = str.split(" ");
					switch (token[0]) {
					case "push":
						obj.pushAtStart(Integer.parseInt(token[1]));
						System.out.println(obj.displayAll());
						break;
					case "pop":
						obj.popAtStart();
						System.out.println(obj.displayAll());
						break;
					case "enqueue":
						obj.pushAtEnd(Integer.parseInt(token[1]));
						System.out.println(obj.displayAll());
						break;
					}
				}
		}
	}
}
}