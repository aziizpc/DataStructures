package Striver_Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class REC_22_SubsetSum {

	public static void getSubsetWithoutDup(int index, int len, int[] arr, List<Integer> temp, List<List<Integer>> ans) {
		// We don't follow add - no add logic here. We use for loop.

		ans.add(new ArrayList<Integer>(temp)); // We will just add. No base condition THINK :)

		for (int i = index; i < len; i++) {
			if (i > index && arr[i] == arr[i - 1])
				continue;
			temp.add(arr[i]);
			getSubsetWithoutDup(i + 1, len, arr, temp, ans);
			temp.remove(temp.size() - 1);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3 };
		int index = 0;
		int len = arr.length;
		List<Integer> temp = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		Arrays.sort(arr);
		getSubsetWithoutDup(index, len, arr, temp, ans);

		System.out.println(ans);

	}

}
