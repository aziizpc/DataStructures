package Striver_Recursion;

public class REC_12_Fibonacci {
	
	public static int getFibonacci(int n) {
		if (n <= 1) {
			return n;		// NOTE !!! f(1) = 1; f(0) = 0. We want these
		}
		
		int last = getFibonacci(n - 1);
		int secondLast = getFibonacci(n - 2);
		return last + secondLast;
	}

	public static void main(String[] args) {
		int FibonacciPos = 10;
		System.out.println(getFibonacci(FibonacciPos));
	}

}