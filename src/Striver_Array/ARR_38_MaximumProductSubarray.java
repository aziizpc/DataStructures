package Striver_Array;

public class ARR_38_MaximumProductSubarray {

	public static int maxProduct(int[] nums) {

		int max = Integer.MIN_VALUE;	// NOTE!!!

		int prefix = 1;
		int suffix = 1;

		for (int i = 0; i < nums.length; i++) {

			if (prefix == 0)	// Should check these conditions @ the START ITSELF.
				prefix = 1;
			if (suffix == 0)
				suffix = 1;

			prefix *= nums[i];
			suffix *= nums[nums.length - i - 1];

			max = Math.max(max, Math.max(prefix, suffix));

		}

		return max;

	}

	public static void main(String[] args) {

		int[] arr1 = { 2, 3, -2, 4 };
		System.out.println(maxProduct(arr1));

		int[] arr2 = { -2, 0, -1 };
		System.out.println(maxProduct(arr2));

	}

}