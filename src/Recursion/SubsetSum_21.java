package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSum_21 {

	public static void getSubsetSum(int index, int len, int[] arr, int sum, List<Integer> temp, List<Integer> ans) {
		if (index == len) {
			ans.add(sum);
			return;
		}

		temp.add(arr[index]);
		sum += arr[index];
		getSubsetSum(index + 1, len, arr, sum, temp, ans);

		sum -= temp.get(temp.size() - 1);
		temp.remove(temp.size() - 1);
		getSubsetSum(index + 1, len, arr, sum, temp, ans);
		
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 1 };
		int index = 0;
		int len = arr.length;
		int sum = 0;
		List<Integer> temp = new ArrayList<Integer>();
		List<Integer> ans = new ArrayList<Integer>();
		
		getSubsetSum(index, len, arr, sum, temp, ans);
		
		Collections.sort(ans);
		
		System.out.println(ans);

	}

}