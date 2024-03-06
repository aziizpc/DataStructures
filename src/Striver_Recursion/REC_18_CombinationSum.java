// You can use any number any number of times

package Striver_Recursion;

import java.util.ArrayList;
import java.util.List;

public class REC_18_CombinationSum {

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
			getCombination(index, len, arr, targetSum - arr[index], temp, ans);	// NOTE: No +1

			temp.remove(temp.size() - 1);	// No subtraction from targetSum

		}

		getCombination(index + 1, len, arr, targetSum, temp, ans); // WHY OUTSIDE? ARR[INDEX] HAS NOTHING TO DO WITH
																	// THIS. +1 :)
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 7 };
		//int[] arr = { 1, 2 };
		int index = 0;
		int len = arr.length;
		int targetSum = 7;

		List<Integer> temp = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		getCombination(index, len, arr, targetSum, temp, ans);

		System.out.println(ans);

	}

}