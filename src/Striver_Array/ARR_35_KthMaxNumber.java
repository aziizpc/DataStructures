package Striver_Array;

public class ARR_35_KthMaxNumber {

	private static final int k = 3;

	public static int getMax(int[] nums) {
		int[] arr = new int[k];
		arr[0] = nums[0];
		int pos = 1;

		// O(N) time complexity. Even with the inner loop, it doesn't reach O(N^2)
		// unless K is very large.
		for (int num : nums) {
			if (pos == k && num <= arr[pos - 1]) 	// If maxNum size is k & the num is smaller than last
													// num in maxNum
				continue;

			boolean isDistinct = true;

			for (int j = 0; j < pos; j++) {
				if (num == arr[j]) { 				// If num is already in the maxNum
					isDistinct = false;
					break;
				}
				if (num > arr[j]) { 				// If num is greater than at least an element in maxNum
					int tmp = arr[j]; 				// swap so that we can add it to maxNum after the loop
					arr[j] = num;
					num = tmp;
				}
			}

			if (!isDistinct)	
				continue;							// Ignore and continue

			if (pos < k) {
				arr[pos++] = num;					// Insert at the end
			}
		}

		// System.out.println(Arrays.toString(maxNum));

		return pos == k ? arr[arr.length - 1] : arr[0];
	}

	public static void main(String[] args) {

		int[] nums = { 3, 2, 1, 8, 9, 5, 2, 0 }; 	// 0 1 2 2 3 5 8 9

		System.out.println(getMax(nums));

	}

}