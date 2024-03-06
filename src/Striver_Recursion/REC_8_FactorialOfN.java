// Function method (Similar to 7)

package Striver_Recursion;

public class REC_8_FactorialOfN {

	public static int factorial(int n) { // returns int
		if (n < 1) {
			return 1;
		}
		return n * factorial(n - 1); // NOTE
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(factorial(n)); // PRINTED
	}

}