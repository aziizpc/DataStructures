// You can use any number any number of times

package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_18 {

	public static void getCombination(int index, int len, int[] arr, int targetSum, List<Integer> temp,
			List<List<Integer>> ans) {
		if (index == len) {
			if (targetSum == 0) {
				ans.add(new ArrayList<Integer>(temp));
			}
			return;
		}

		if (arr[index] <= targetSum) { // NOTE THIS
			temp.add(arr[index]);
			getCombination(index, len, arr, targetSum - arr[index], temp, ans);

			temp.remove(temp.size() - 1);

		}

		getCombination(index + 1, len, arr, targetSum, temp, ans); // WHY OUTSIDE? ARR[INDEX] HAS NOTHING TO DO WITH
																	// THIS.
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 7 };
		int index = 0;
		int len = arr.length;
		int targetSum = 7;

		List<Integer> temp = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		getCombination(index, len, arr, targetSum, temp, ans);

		System.out.println(ans);

	}

}