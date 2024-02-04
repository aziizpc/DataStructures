// LC 16

package Arrays_Leetcode;

import java.util.Arrays;

public class ThreeElementsSumClosest_1 {

	public static int getClosestSum(int arr[], int k) {

		Arrays.sort(arr);
		int ans = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length - 2; i++) {

			int left = i + 1;
			int right = arr.length - 1;

			while (left < right) {

				int sum = arr[i] + arr[left] + arr[right];

				if (Math.abs(k - sum) < Math.abs(k - ans)) { // No == or --
					ans = sum;
				}

				else if (sum < k) { // <
					left++;
				}

				else { // NOTE --> This condition covers both > and =
					right--;
				}
			}
		}

		return ans;
	}

	public int threeSumClosest(int[] nums, int target) {

		int ans = getClosestSum(nums, target);

		return ans;

	}

	public static void main(String[] args) {

	}

}