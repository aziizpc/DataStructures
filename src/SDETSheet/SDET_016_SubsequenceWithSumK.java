package SDETSheet;

import java.util.ArrayList;
import java.util.List;

public class SDET_016_SubsequenceWithSumK {

	public static void getSubsequence(int index, int len, int[] arr, int sum, int currentSum, List<Integer> myList,
			List<List<Integer>> ans) {
		if (index == len) {
			if (currentSum == sum) {
				ans.add(new ArrayList<Integer>(myList));
			}
			return;
		}
		myList.add(arr[index]);
		currentSum += arr[index];
		getSubsequence(index + 1, len, arr, sum, currentSum, myList, ans);

		currentSum -= myList.get(myList.size() - 1); // NOTE THIS: GET currentSum before REMOVE(). Else Exception.
														// THINK!!
		myList.remove(myList.size() - 1);
		getSubsequence(index + 1, len, arr, sum, currentSum, myList, ans);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
		int index = 0;
		int len = arr.length;
		int sum = 8;
		int currentSum = 0;
		List<Integer> myList = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		getSubsequence(index, len, arr, sum, currentSum, myList, ans);
		System.out.println(ans);
	}

}