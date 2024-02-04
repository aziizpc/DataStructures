package Array_Striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubArrayWithSumK {

	public static int[] getLongestSubarray(int[] a, int k) {
		int n = a.length; // size of the array.

		Map<Integer, Integer> preSumMap = new HashMap<>();
		int sum = 0;
		int maxLen = 0;

		int start = 0;
		int end = 0;

		for (int i = 0; i < n; i++) {
			// calculate the prefix sum till index i:
			sum += a[i];

			// if the sum = k, update the maxLen:
			if (sum == k) {
				if (Math.max(maxLen, i + 1) == maxLen) {
					maxLen = i + 1;
					start = 0;
					end = i;
				}
			}

			// calculate the sum of remaining part i.e. x-k:
			int rem = sum - k;

			// Calculate the length and update maxLen:
			if (preSumMap.containsKey(rem)) {
				int len = i - preSumMap.get(rem); // Think (We are calculating the difference)
				if (Math.max(maxLen, len) == len) {
					maxLen = len;
					start = preSumMap.get(rem) + 1; // + 1 is required here
					end = i;
				}
			}

			// Finally, update the map checking the conditions:
			if (!preSumMap.containsKey(sum)) { // We will update only if the 'sum' is NOT there already
				preSumMap.put(sum, i);
			}
		}

		List<Integer> ans = new ArrayList<Integer>();

		for (int i = start; i <= end; i++) {
			ans.add(a[i]);
		}

		return ans.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 1, 1, 0, 1, 1, 4, 2, 3, 0, 0, -1, 1, 1, 0, 1, 0, 1, 0 };
		int k = 3;
		int[] ans = getLongestSubarray(a, k);
		System.out.println(Arrays.toString(ans));
	}
}