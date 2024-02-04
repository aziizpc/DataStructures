// Similar to 31

package Array_Striver;

import java.util.ArrayList;
import java.util.List;

public class CountInversionsInArray_32 {

	public static int splitTheArray(int[] arr, int low, int high) {

		int count = 0;

		if (low == high) {
			return count;
		}

		int mid = (low + high) / 2;
		count += splitTheArray(arr, low, mid);
		count += splitTheArray(arr, mid + 1, high);
		count += mergeAndSort_Compare(arr, low, mid, high);

		return count;
	}

	public static int mergeAndSort_Compare(int[] arr, int low, int mid, int high) {

		int count = 0;

		int left = low;
		int right = mid + 1;

		List<Integer> temp = new ArrayList<Integer>();

		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;

			} else {
				temp.add(arr[right]);
				right++;
				count += (mid - left + 1);	// NOTE
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

		return count;

	}

	public static void main(String[] args) {

		int[] arr = { 5, 3, 2, 1, 4 };
		int low = 0;
		int high = arr.length - 1;
		int count = splitTheArray(arr, low, high);

		System.out.println(count);

	}

}