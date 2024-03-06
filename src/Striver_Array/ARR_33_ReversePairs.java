// left > 2 * right

package Striver_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARR_33_ReversePairs {

	public static int splitTheArray(int[] arr, int low, int high) {

		int count = 0;

		if (low == high)
			return count;

		int mid = (low + high) / 2;
		count += splitTheArray(arr, low, mid);
		count += splitTheArray(arr, mid + 1, high);
		count += countPairs(arr, low, mid, high);
		mergeAndSort(arr, low, mid, high);
		
		return count;
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

	public static int countPairs(int[] arr, int low, int mid, int high) {

		// [left block] .... [right block] --> for loop left block and check against the
		// right block

		int count = 0;

		int right = mid + 1;

		for (int i = low; i <= mid; i++) {
			while (right <= high && arr[i] > (2 * arr[right])) {
				right++;
			}
			count += (right - (mid + 1)); // Take count of all elements in right upto the current one
		}

		return count;
	}

	public static void main(String[] args) {

		int[] arr = { 12, 19, 25, 40, 2, 6, 9 };

		int low = 0;
		int high = arr.length - 1;

		int count = splitTheArray(arr, low, high);

		System.out.println(Arrays.toString(arr));

		System.out.println(count);

	}

}