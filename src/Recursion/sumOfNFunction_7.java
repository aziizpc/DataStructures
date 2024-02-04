package Recursion;

public class sumOfNFunction_7 {
	
	public static int sumOfNFunction(int n) { // returns int
		if (n < 0) {
			return 0;
		}
		return n + sumOfNFunction(n - 1);	// NOTE
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(sumOfNFunction(n));	// PRINTED
	}

}
