package Striver_Recursion;

public class REC_6_SumOfNParam {
	
	public static void sumOfNParam(int n, int sum) {
		if (n < 1) {
			System.out.println(sum);	// NOTE: The param sum is printed (Within the base condition)
			return;
		}
		sumOfNParam(n - 1, sum + n);
	}

	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		sumOfNParam(n, sum);	// This function just PRINTS sum. Cannot return it.
	}

}