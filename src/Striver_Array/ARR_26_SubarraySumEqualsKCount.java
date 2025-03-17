package Striver_Array;

import java.util.HashMap;
import java.util.Map;

public class ARR_26_SubarraySumEqualsKCount {

	public static int getSubArrayCount(int[] nums, int k) {

		int count = 0;
		int n = nums.length;
		int sum = 0;

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

		hm.put(0, 1);

		for (int i = 0; i < n; i++) {
			int val = nums[i];
			sum += val;

			if (hm.containsKey(sum - k)) {
				count += hm.get(sum - k);
			}

			hm.put(sum, hm.getOrDefault(sum, 0) + 1);
		}

		return count;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
		int k = 3;

		System.out.println(getSubArrayCount(arr, k));

	}

}