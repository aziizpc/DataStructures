// Kadane's Algorithm

package Striver_Array;

public class ARR_17_MaximumSubArraySum {

	public static int getMaximumSubArraySum(int[] arr) {

		int max = Integer.MIN_VALUE;					// max set to MIN value
		int sum = 0;									// sum = 0

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];								// Calculate sum

			max = Math.max(max, sum);					// Calculate max

			if (sum < 0)								// sum < 0 => set sum as 0 => Start again
				sum = 0;

		}

		return max;

	}

	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 }; // ans is 7: {4, -1, -2, 1, 5}
		int ans = getMaximumSubArraySum(arr);
		System.out.println(ans);
		
		arr = new int[] { -2, -3, 4, -1, 1, -1, -5, -3 };
		ans = getMaximumSubArraySum(arr);
		System.out.println(ans);

	}

}