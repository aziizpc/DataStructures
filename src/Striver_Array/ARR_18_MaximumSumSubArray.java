// Problem 16 with array returned

package Striver_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARR_18_MaximumSumSubArray {

	public static int[] getMaximumSubArraySum(int[] arr) {

		int max = Integer.MIN_VALUE;
		int sum = 0;

		int ansStart = -1;			// Two additional variables here
		int ansEnd = -1;

		for (int i = 0; i < arr.length; i++) {

			if (sum == 0)
				ansStart = i; 		// start will be where the sum = 0 (Think)

			sum += arr[i];

			if (sum > max) {
				max = sum;
				ansEnd = i;			// This is where 'end' would be at
			}

			if (sum < 0)
				sum = 0;

		}

		List<Integer> ans = new ArrayList<Integer>();

		for (int i = ansStart; i <= ansEnd; i++) {
			ans.add(arr[i]);
		}

		return ans.stream().mapToInt(i -> i).toArray();

	}

	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 }; // ans is 7: {4, -1, -2, 1, 5}

		int[] ans = getMaximumSubArraySum(arr);

		System.out.println(Arrays.toString(ans));

	}

}