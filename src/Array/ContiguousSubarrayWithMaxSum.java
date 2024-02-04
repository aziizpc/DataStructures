package Array;

public class ContiguousSubarrayWithMaxSum {

	static void SubarrayWithMaxSum(int[] nums) {

		int endIndex = 0, currMax = nums[0];
		int globalMax = nums[0];

		for (int i = 1; i < nums.length; i++) {

			currMax = Math.max(nums[i], nums[i] + currMax);

			if (currMax > globalMax) {
				globalMax = currMax;
				endIndex = i;
			}
		}

		int startIndex = endIndex;

		// Traverse in left direction to
		// find start Index of subarray
		while (startIndex >= 0) {
			globalMax = globalMax - nums[startIndex];

			if (globalMax == 0)
				break;

			// Decrement the start index
			startIndex--;
		}

		// Printing the elements of
		// subarray with max sum
		for (int i = startIndex; i <= endIndex; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { -2, -5, 6, -2, -3, 1, 5, -6 };
		SubarrayWithMaxSum(arr);
	}
}