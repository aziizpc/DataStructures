// LC - 1749
// https://www.notion.so/Leetcode-1749-56f6c5e455104d4f85975d1fce12e539

package SDETSheet;

public class SDET_045_MaximumAbsoluteSumOfAnySubarray {

	public static int maxAbsoluteSum(int[] nums) {

		int pre = 0, min = 0, max = 0;

		for (int num : nums) {
			pre += num;
			min = Math.min(min, pre);
			max = Math.max(max, pre);
		}

		return max - min;

	}

	public static void main(String[] args) {

		int[] arr = { 1, -3, 2, 3, -4 };
		System.out.println(maxAbsoluteSum(arr));

		arr = new int[] { 2, -5, 1, -4, 3, -2 };
		System.out.println(maxAbsoluteSum(arr));

	}

}
