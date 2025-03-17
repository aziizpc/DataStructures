// LC - 724

package SDETSheet;

public class SDET_013_FindPivotIndex {

	public static int pivotIndex(int[] nums) {

		int totalSum = 0;
		int leftsum = 0;

		for (int ele : nums) {
			totalSum += ele;
		}

		for (int i = 0; i < nums.length; i++) {
			if (leftsum * 2 == totalSum - nums[i]) {
				return i;
			}
			leftsum += nums[i];
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 7, 3, 6, 5, 6 };
		System.out.println(pivotIndex(arr));

	}

}