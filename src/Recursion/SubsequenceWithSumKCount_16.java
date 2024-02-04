package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceWithSumKCount_16 {

	public static int getSubsequence(int index, int len, int[] arr, int sum, int currentSum, List<Integer> myList) {
		if (index == len) {
			if (currentSum == sum) {
				return 1;	// CHECK
			}
			return 0;
		}
		myList.add(arr[index]);
		currentSum += arr[index];
		int l = getSubsequence(index + 1, len, arr, sum, currentSum, myList); // NOTE

		currentSum -= myList.get(myList.size() - 1); // NOTE THIS: GET currentSum before REMOVE(). Else Exception.
														// THINK!!
		myList.remove(myList.size() - 1);
		int r = getSubsequence(index + 1, len, arr, sum, currentSum, myList);	// NOTE

		return l + r;	// NOTE THIS
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1 };
		int index = 0;
		int len = arr.length;
		int sum = 2;
		int currentSum = 0;
		List<Integer> myList = new ArrayList<Integer>();
		int answer = getSubsequence(index, len, arr, sum, currentSum, myList);
		System.out.println(answer);
	}

}