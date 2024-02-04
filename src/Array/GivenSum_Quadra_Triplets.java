package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GivenSum_Quadra_Triplets {

	public static void quadraSum(int[] arr, int n, int target) {

		Arrays.sort(arr);

		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		for (int left = 0; left < n; left++) {

			if (left > 0 && arr[left] == arr[left - 1])
				continue;

			int mid = left + 1;
			int right = n - 1;
			while (mid < right) {
				int sum = arr[left] + arr[mid] + arr[right];
				if (sum == target) {
					List<Integer> myList = new ArrayList<Integer>();
					myList.add(arr[left]);
					myList.add(arr[mid]);
					myList.add(arr[right]);
					ans.add(myList);
					mid++;
					right--;
					while (mid < right && arr[mid] == arr[mid - 1]) {
						mid++;
					}
					while (mid < right && arr[right] == arr[right + 1]) {
						right--;
					}
				} else if (sum < target) {
					mid++;
				} else if (sum > target) {
					right--;
				}
			}

		}

		System.out.println(ans);

	}

	public static void main(String[] args) {
		int arr[] = { 2, 2, 2, 2, 0, 0, 0, -2, -2, -2 - 1, -1, -1 };
		int n = arr.length;
		int target = 0;
		quadraSum(arr, n, target);
	}

}
