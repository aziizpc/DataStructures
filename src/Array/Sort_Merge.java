// 90% self

package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort_Merge {

	public static void main(String[] args) {
		int myArray[] = { 67, -20, 40, 1, 4, 0, 11, -1, 9, 8, 100 };
		int low = 0;
		int high = myArray.length - 1;
		split(myArray, low, high);
		System.out.println(Arrays.toString(myArray));
	}

	public static void split(int[] myArray, int low, int high) {
		while (low == high)
			return; // EXIT CONDITION (When only one element left)
		int mid = (low + high) / 2;
		split(myArray, low, mid);
		split(myArray, mid + 1, high);
		mergeAndSort(myArray, low, mid, high);
	}

	public static void mergeAndSort(int[] myArray, int low, int mid, int high) {
		int left = low, right = mid + 1; // Order: LEFT->low; RIGHT+1->mid; HIGH->high
		ArrayList<Integer> temp = new ArrayList<>(); // Temporary Array
		while (left <= mid && right <= high) {
			if (myArray[left] <= myArray[right]) {
				temp.add(myArray[left]);
				left++;
			} else {
				temp.add(myArray[right]);
				right++;
			}
		}

		while (left <= mid) {
			temp.add(myArray[left]);
			left++;
		}

		while (right <= high) {
			temp.add(myArray[right]);
			right++;
		}

		System.out.println("---------");

		for (int i = low; i <= high; i++) {
			System.out.println("i: " + i + " --- i-low: " + (i - low));
			myArray[i] = temp.get(i - low);
		}
	}

}