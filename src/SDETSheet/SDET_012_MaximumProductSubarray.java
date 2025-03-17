// LC - 152

package SDETSheet;

public class SDET_012_MaximumProductSubarray {	// Note subarray (Not subset / subsequence)

	public static int maxProduct(int[] nums) {

		int max = Integer.MIN_VALUE;

		int prefix = 1;
		int suffix = 1;

		for (int i = 0; i < nums.length; i++) {

			if (prefix == 0)
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

		int[] nums = { 2, 3, -2, 4 };
		System.out.println(maxProduct(nums));

		nums = new int[] { -2, 0, -1 };
		System.out.println(maxProduct(nums));

	}

}
