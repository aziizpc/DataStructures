// LC - 153

package Freshworks;

public class FRW_10_FindMinimumInRotatedSortedArray {

	public static int findMin(int[] nums) {

		int l = 0;
		int r = nums.length - 1;

		while (l < r) {
			int m = (l + r) / 2;
			if (nums[m] < nums[r])				// If MID < LAST ELEMENT
				r = m;							// We now have the new LAST ELEMENT which is m
			else
				l = m + 1;						// Move l to (MID + 1)
		}

		return nums[l];							// lth element is the answer

	}

	public static void main(String[] args) {

		int[] arr = { 3, 4, 5, 1, 2 };

		System.out.println(findMin(arr));

	}

}