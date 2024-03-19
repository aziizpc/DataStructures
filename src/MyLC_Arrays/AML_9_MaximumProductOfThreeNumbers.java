// LC - 628

package MyLC_Arrays;

public class AML_9_MaximumProductOfThreeNumbers {

	static int maximumProduct(int[] nums) {

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		;

		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int n : nums) {
			if (n > max1) {
				max3 = max2;
				max2 = max1;
				max1 = n;
			} else if (n > max2) {
				max3 = max2;
				max2 = n;
			} else if (n > max3) {
				max3 = n;
			}

			if (n < min1) {
				min2 = min1;
				min1 = n;
			} else if (n < min2) {
				min2 = n;
			}
		}

		return Math.max(max1 * max2 * max3, max1 * min1 * min2); // NOTE!!
		// positive * positive * positive OR positive * negative * negative (If positives
		// and negatives are there, this method covers them all AND all other scenarios)

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };

		System.out.println(maximumProduct(arr));

	}

}