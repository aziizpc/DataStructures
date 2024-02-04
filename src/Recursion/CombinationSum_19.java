// No duplicates allowed (No duplicate within each section)
// My own Q

package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_19 {
	
	public static void getCombinationWithoutDup(int index, int len, int[] arr, int targetSum, List<Integer> temp, List<List<Integer>> ans) {
		if (index == len) {	// We still move forward even if we get the answer :) (Check tree)
			if (targetSum == 0) {
				ans.add(new ArrayList<Integer> (temp));
			}
			return;
		}
		
		if (arr[index] <= targetSum) {
			while (index > 0 && arr[index] == arr[index - 1]) {	// NOTE
				index++;
			}
			temp.add(arr[index]);
			getCombinationWithoutDup(index + 1, len, arr, targetSum - arr[index], temp, ans);
			
			temp.remove(temp.size() - 1);
		}
		
		getCombinationWithoutDup(index + 1, len, arr, targetSum, temp, ans);
	}

	public static void main(String[] args) {
		int[] arr = {10, 1, 2, 7, 6, 1, 5};
		int index = 0;
		int len = arr.length;
		int targetSum = 8; 
		List<Integer> temp = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		
		Arrays.sort(arr);	// NOTE !!!!
		
		getCombinationWithoutDup(index, len, arr, targetSum, temp, ans);
		
		System.out.println(ans);

	}

}
