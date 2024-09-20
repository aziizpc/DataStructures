package Freshworks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FRW_01_TwoSum {

	public static int[] getTwoSum(int[] nums, int target) {

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int val = nums[i];

			if (hm.containsKey(target - val)) {
				return new int[] { hm.get(target - val), i };
			}

			hm.put(val, i);

		}

		return new int[] { 1, 1 };

	}

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(Arrays.toString(getTwoSum(nums, target)));

	}

}