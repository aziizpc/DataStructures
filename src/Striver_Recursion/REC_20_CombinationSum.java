// Each element only once

package Striver_Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REC_20_CombinationSum {

	public static void getCombination(int index, int len, int[] arr, int targetSum, List<Integer> temp,
			List<List<Integer>> ans) {

		if (targetSum == 0) { // We STOP once we get the targetSum as 0. No need to go further (Unlike
								// CombinationSum1) as the
								// remaining elements are even bigger and the targetSum becomes negative if we
								// do so. Check Tree.
			ans.add(new ArrayList<Integer>(temp));
			return;
		}

		for (int i = index; i < arr.length; i++) {
			if (i > index && arr[i] == arr[i - 1]) // Why i > index => If it's not there, it won't consider scenarios
													// like (1,1) which is a correct one || Think like 'from the next element
													// onwards' :)
				continue;
			
			if (arr[i] <= targetSum) {
				temp.add(arr[i]);
				getCombination(i + 1, len, arr, targetSum - arr[i], temp, ans);
				temp.remove(temp.size() - 1); // We need to remove the currently considered element. Remaining process
												// is the same. Hence no separate 'getCombination' after this.
			}

			else
				break; // break when the targetSum goes below 0 (Optimization)

		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
		int index = 0;
		int len = arr.length;
		int targetSum = 8;
		List<Integer> temp = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		Arrays.sort(arr); // IMPORTANT (As we need answer in increasing order)

		getCombination(index, len, arr, targetSum, temp, ans);

		System.out.println(ans);

	}

}