package Striver_Array;

import java.util.Arrays;

public class ARR_14_SortArrayOf3s4s5s {

	public static int[] sortTheArray(int[] arr) {

		int low = 0;
		int mid = 0;
		int high = arr.length - 1;

		while (mid <= high) {
			if (arr[mid] == 3) {
				int temp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = temp;
				low++;
				mid++;
			}

			else if (arr[mid] == 4) {
				mid++;
			}

			else if (arr[mid] == 5) {
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--; // No mid-- here as we are not sure which number came after swapping
			}
		}

		return arr;

	}

	public static void main(String[] args) {
		// int[] arr = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

		int[] arr = { 3, 4, 5, 3, 4, 5, 4, 5, 3, 3, 3, 4 };

		int[] ans = sortTheArray(arr);

		System.out.println(Arrays.toString(ans));

	}

}