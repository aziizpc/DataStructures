package Striver_DP;

public class DP_3_Fibonacci_SpaceOptimization {

	public static void main(String[] args) {
		int n = 5;

		int prev2 = 0;
		int prev1 = 1;

		for (int i = 2; i <= n; i++) {	// No Array used
			int cur_i = prev2 + prev1;
			prev2 = prev1;
			prev1 = cur_i;
		}
		
		System.out.println(prev1);

	}

}