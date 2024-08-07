package Striver_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARR_11_ThreeElementsSum {

	public static List<List<Integer>> getThreeElementsSum(int[] arr, int target) {

		Arrays.sort(arr);

		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		for (int i = 0; i <= arr.length - 3; i++) {		// NOTE

			if (i > 0 && arr[i] == arr[i - 1]) 			// Ignoring the duplicate elements @ 1st positions
				continue;

			int left = i + 1;
			int right = arr.length - 1;

			while (left < right) {

				if (arr[i] + arr[left] + arr[right] == target) {
					List<Integer> temp = new ArrayList<Integer>();
					temp.add(arr[i]);
					temp.add(arr[left]);
					temp.add(arr[right]);
					ans.add(new ArrayList<Integer>(temp));
					left++; 							// Increment once and then while loop
					right--; 							// Decrement first and then while loop
					while (arr[left] == arr[left - 1])	// Ignoring the duplicate elements @ 2nd positions
						left++;
					while (arr[right] == arr[right + 1])// Ignoring the duplicate elements @ 3rd positions
						right--;
				}

				else if (arr[i] + arr[left] + arr[right] < target) {
					left++;
					while (arr[left] == arr[left - 1])	// Ignoring the duplicate elements @ 2nd positions
						left++;
				}

				else {
					right--;
					while (arr[right] == arr[right + 1])// Ignoring the duplicate elements @ 3rd positions
						right--;
				}
			}
		}

		return ans;

	}

	public static void main(String[] args) {
		// int[] arr = { -1, 0, 1, 2, -1, -4 };
		int[] arr = { 2, 2, 2, 0, 2, -2, -2, 0, -2, -1, 0, -1, -1 };

		int target = 0;

		List<List<Integer>> ans = getThreeElementsSum(arr, target);

		System.out.println(ans);

	}

}