package Striver_Array;

import java.util.Arrays;

public class ARR_21_BestTimeToBuyAndSellStock {

	public static int[] getTheBestTime(int[] arr) {

		int min = arr[0];
		int profit = 0; // This is the minimum 'profit' that I'm okay with. Buy and sell on the same day.

		int buyPoint = 0;
		int sellPoint = 0;

		for (int i = 1; i < arr.length; i++) {	// One

			// profit = Math.max(profit, arr[i] - min);

			if (arr[i] - min > profit) {
				profit = arr[i] - min;
				sellPoint = i;
			}

			// min = Math.min(min, arr[i]);

			if (arr[i] < min) {
				min = arr[i];
				buyPoint = i;
			}

		}

		return new int[] { arr[buyPoint], arr[sellPoint] };

	}

	public static void main(String[] args) {
		int[] arr = { 7, 1, 5, 3, 6, 4 };

		int[] ans = getTheBestTime(arr);

		System.out.println(Arrays.toString(ans));

	}

}