// Self :)

package Striver_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARR_32_MergeSort {

	public static void splitTheArray(int[] arr, int low, int high) {

		if (low == high)
			return;
		int mid = (low + high) / 2;
		splitTheArray(arr, low, mid);
		splitTheArray(arr, mid + 1, high);
		mergeAndSort(arr, low, mid, high);
	}

	public static void mergeAndSort(int[] arr, int low, int mid, int high) {

		int left = low;
		int right = mid + 1; // Think like --> The next element in the second section starts from mid + 1

		List<Integer> temp = new ArrayList<Integer>();

		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				right++;
			}
		}

		while (left <= mid) {
			temp.add(arr[left]);
			left++;
		}

		while (right <= high) {
			temp.add(arr[right]);
			right++;
		}

		for (int i = low; i <= high; i++) {
			arr[i] = temp.get(i - low);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 67, -20, 40, 1, 4, 0, 11, -1, 9, 8, 100, 3 };

		int low = 0;
		int high = arr.length - 1;

		splitTheArray(arr, low, high);
		
		System.out.println(Arrays.toString(arr));

	}

}