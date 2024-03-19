package Striver_DP;

import java.util.Arrays;

public class DP_2_Fibonacci_Tabulation {

	public static void main(String[] args) {

		int n = 5;
		int dp[] = new int[n + 1];
		//Arrays.fill(dp, -1);
		
		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		System.out.println(dp[n]);

	}

}