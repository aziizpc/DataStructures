package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Test {

	public static void getCombination(int index, int len, int[] arr, int targetSum, List<Integer> temp,
			List<List<Integer>> ans) {
		if (index == len) {
			if (targetSum == 0) {
				ans.add(new ArrayList<>(temp));
			}
			return;
		}

		// Include the current element
		if (arr[index] <= targetSum) {
			temp.add(arr[index]);
			getCombination(index, len, arr, targetSum - arr[index], temp, ans);
			temp.remove(temp.size() - 1); // Backtrack
		}

		// Exclude the current element
		getCombination(index + 1, len, arr, targetSum, temp, ans);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1 };
		int index = 0;
		int len = arr.length;
		int targetSum = 3;

		List<Integer> temp = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();

		//Arrays.sort(arr); // Ensure elements are considered in order

		getCombination(index, len, arr, targetSum, temp, ans);

		System.out.println(ans);
	}
}