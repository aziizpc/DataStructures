package Recursion;

public class PrintNTo1_3 {

	public static void printNTo1(int i, int n) {
		if (i < 1) {
			return;
		}
		System.out.println(i);
		printNTo1(i - 1, n);
	}

	public static void main(String[] args) {
		int n = 10;
		printNTo1(n, n); // NOTE
	}

}