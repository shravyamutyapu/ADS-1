import java.util.Scanner;
class Factorial{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//Factorial fact = new Factorial();
		System.out.println(factofnum(n));

	}
	static int factofnum(int n){
		if(n == 1){
			return 1;
		}
		return n*(factofnum(n-1));
	}
}