// Function method (Similar to 7)

package Recursion;

public class FactorialOfN_8 {

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