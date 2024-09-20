package Striver_Array;

import java.util.Arrays;

public class ARR_21_BestTimeToBuyAndSellStock {
	
	public static int maxProfit(int[] prices) {				// My own solution

        int min = prices[0];								// Save min as 0th value

        int ans = 0;										// Let ans = 0

        for (int i = 1 ; i < prices.length ; i++){			// Loop from index = 1
            int val = prices[i];							// Get current value as val
            if (val < min) min = val;						// If val is less than min, assign val as min
            else if (val > min) {							// If greater (Equal not considered)
                ans = Math.max(ans, val - min);				// Identify which is greater
            }
        }

        return ans;											// Return ans
        
    }
	
	public static int[] buyAndSellToMaximizeProfit(int[] prices) {	// My own solution updated to get min & max

        int min = prices[0];

        int ans = 0;
        
        int buy = 0;
        int sell = 0;

        for (int i = 1 ; i < prices.length ; i++){
            int val = prices[i];
            if (val < min) {
            	min = val;
            	buy = val;
            }
            else if (val > min) {
            	int temp = val - min;
            	if (temp > ans) {
            		ans = temp;
            		sell = val;
            	}
            }
        }

        return new int[] {buy, sell};
        
    }

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
		
		ans = buyAndSellToMaximizeProfit(arr);
		System.out.println(Arrays.toString(ans));

	}

}