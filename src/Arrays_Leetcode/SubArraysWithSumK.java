package Arrays_Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubArraysWithSumK { // Or Subsets

	public static void getSubArraysWithSumK(int[] arr, int start, int end, int expectedSum, List<List<Integer>> ans) {

		if (end == arr.length) {
			return;
		}

		else if (start > end) {
			getSubArraysWithSumK(arr, 0, end + 1, expectedSum, ans);
		}

		else {
			List<Integer> temp = new ArrayList<Integer>();
			int curSum = 0;
			for (int i = start; i <= end; i++) {
				curSum += arr[i];
				temp.add(arr[i]);
			}
			if (curSum == expectedSum)
				ans.add(temp);
			getSubArraysWithSumK(arr, start + 1, end, expectedSum, ans);
		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };

		int start = 0;
		int end = 0;
		int expectedSum = 3;

		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		getSubArraysWithSumK(arr, start, end, expectedSum, ans);

		System.out.println(ans);

	}

}