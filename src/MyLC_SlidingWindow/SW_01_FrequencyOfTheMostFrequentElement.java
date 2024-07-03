// LC - 1838
// Tricky - Lee's solution

package MyLC_SlidingWindow;

import java.util.Arrays;

public class SW_01_FrequencyOfTheMostFrequentElement {

	public static int maxFrequency(int[] nums, int k) {	// Sliding window solution!
		
		Arrays.sort(nums);								// Don't miss to sort the array
		
		int start = 0;									// 1st point
		int end = 0;									// 2nd point
		int sum = 0;									// Variable to calculate sum
		int ans = 1;									// Answer variable 
		
		for (end = 0 ; end < nums.length ; end++) {		// Navigate through the array and calculate sum
			sum += nums[end];							// 'end' is the one which is progressively navigated
			
			while ((sum + k) < (long) nums[end] * (end - start + 1)) {	// Think and understand (Read below)
				sum -= nums[start];										// Remove the first element from window
				start++;												// So we need to up the 'start'
			}
			
			ans = Math.max(ans, (end - start + 1));						// We need to find the max window size
		}
		
		return ans;
		
		/* This is the soul of the program: while ((sum + k) < (long) nums[end] * (end - start + 1))
		 * 
		 * It's obvious that ((sum + k) MUST BE SMALLER THAN nums[end] * (end - start + 1)) as per the program 
		 * That is, we are taking nums[end] as the benchmark for calculating frequency. (end - start + 1) is 
		 * the length of the sliding window (For all SW problems).
		 * 
		 * Note: (long) should be kept as: (long) value1 * value2    OR    value1 * (long) value2
		 * The program will fail if it's mentioned as   (long) (value1 * value2)
		 * The latter converts the value to long AFTER calculation using int which is of no use and may cause
		 * overflow exception; The former is the right way where we explicitly convert a value to long so that
		 * the calculated value also comes in long and no exception occurs. 
		 */
		
	}

	public static void main(String[] args) {

		int[] num = { 1, 4, 8, 13 };
		int k = 5;		
		System.out.println(maxFrequency(num, k));
		
		num = new int[] { 3,9,6};
		k = 2;		
		System.out.println(maxFrequency(num, k));

	}

}