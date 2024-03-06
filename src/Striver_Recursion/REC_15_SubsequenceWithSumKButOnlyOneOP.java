package Striver_Recursion;

import java.util.ArrayList;
import java.util.List;

public class REC_15_SubsequenceWithSumKButOnlyOneOP {

	public static boolean getSubsequence(int index, int len, int[] arr, int sum, int currentSum, List<Integer> myList,
			List<List<Integer>> ans) { // BOOLEAN FUNCTION
		if (index == len) {
			if (currentSum == sum) {
				ans.add(new ArrayList<Integer>(myList));
				return true;
			}
			return false;
		}
		
		myList.add(arr[index]);
		currentSum += arr[index];
		if (getSubsequence(index + 1, len, arr, sum, currentSum, myList, ans) == true) // CHECK (If we get an op, just
																						// return as we don't want to
																						// continue anymore.)
			return true;

		currentSum -= myList.get(myList.size() - 1);

		myList.remove(myList.size() - 1);
		if (getSubsequence(index + 1, len, arr, sum, currentSum, myList, ans) == true) // CHECK (If we get an op, just
																						// return as we don't want to
																						// continue anymore.)
			return true;

		return false; // THIS IS IMPORTANT. If both above DON'T RETURN TRUE, RETURN FALSE;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1 };
		int index = 0;
		int len = arr.length;
		int sum = 2;
		int currentSum = 0;
		List<Integer> myList = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		getSubsequence(index, len, arr, sum, currentSum, myList, ans);
		System.out.println(ans);
	}

}