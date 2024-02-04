package Array_Striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum_12 {

	public static List<List<Integer>> getSumIndices(int[] arr, int sum) {

		List<Integer> myList = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		Arrays.sort(arr);

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			if (arr[left] + arr[right] == sum) {
				myList.add(arr[left]);
				myList.add(arr[right]);
				ans.add(new ArrayList<Integer>(myList));
				left++;
				right--;
			}

			else if (arr[left] + arr[right] < sum) {
				left++;
			}

			else
				right--;
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 6, 5, 8, 11 };
		int sum = 14;

		List<List<Integer>> ans = getSumIndices(arr, sum);

		System.out.println(ans);

	}

}