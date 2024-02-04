package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Array_LongestSubarray_KSum {

	public static void main(String[] args) {

		int[] arr = { 56, -1, 0, -3, 2, 0, 0, 2, -78, 100, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
		int k = 0; // Sum that we want
		longestSubarray(arr, k);

	}

	public static int longestSubarray(int[] arr, int k) {

		int sum = 0;
		int maxLen = 0;
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];

			if (sum == k) {
				int len = i + 1;
				maxLen = Math.max(maxLen, len);
			}

			else {
				if (myMap.containsKey(sum - k)) { // myMap.containsKey(sum - 0)
					int len = i - myMap.get(sum - k);
					maxLen = Math.max(maxLen, len);
				}

				else {
					myMap.put(sum, i);
				}

			}

		}

		System.out.println(maxLen);

		return maxLen;

	}

}
