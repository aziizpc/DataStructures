package Array_Striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubsets_16 {

	static void getSubArrays(int[] arr, int start, int end, List<List<Integer>> ans) {
		// Stop if we have reached the end of the array
		if (end == arr.length)
			return;

		// Increment the end point and start from 0
		else if (start > end)
			getSubArrays(arr, 0, end + 1, ans);

		// Print the sub-array and increment the starting point
		else {
			List<Integer> temp = new ArrayList<Integer>();
			for (int i = start; i <= end; i++) {
				temp.add(arr[i]);
			}
			ans.add(new ArrayList<Integer>(temp));
			getSubArrays(arr, start + 1, end, ans);
		}
		return;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		
		int start = 0;
		int end = 0;
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		getSubArrays(arr, start, end, ans);

		System.out.println(ans);

	}

}