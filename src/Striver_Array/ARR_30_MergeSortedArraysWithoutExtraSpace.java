package Striver_Array;

import java.util.Arrays;

public class ARR_30_MergeSortedArraysWithoutExtraSpace {

	public static void getSortedArrays(int[] arr1, int[] arr2) {

		int n1 = arr1.length - 1;
		int n2 = 0;

		while (n1 >= 0 && n2 <= arr2.length - 1) { // Here, we compare and swap the last digits in arr1 with that of the
													// first digits in arr2.

			if (arr1[n1] > arr2[n2]) {
				swapIntegers(arr1, arr2, n1, n2);
				n1--;
				n2++;

			} else { // The remaining elements will be in its position (As the arr1 & arr2 are given
						// sorted only. So BREAK!!.)
				break;
			}
		}

		Arrays.sort(arr1);	// Sort
		Arrays.sort(arr2);
	}

	public static int[][] swapIntegers(int[] arr1, int[] arr2, int n1, int n2) {
		int temp = arr1[n1];
		arr1[n1] = arr2[n2];
		arr2[n2] = temp;

		return new int[][] { arr1, arr2 };
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 0, 2, 6, 8, 9 };

		getSortedArrays(arr1, arr2);	// The action will be done in-place

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

}