package Striver_Array;

import java.util.Arrays;

public class ARR_2_RemoveDuplicatesInPlaceFromSortedArray {

	public static int[] removeDuplicate(int[] arr) {
		int i = 0;										// First point (i) at 0 (Means 0th element is correct)
		for (int j = 1; j < arr.length; j++) {			// Loop j from 1 to end
			if (arr[j] != arr[i]) {						// If an element other than that @ i is encountered
				arr[i + 1] = arr[j];					// Set that element as (i+1)th element
				i++;									// Now increment i
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 2, 3, 3 };
		removeDuplicate(arr);
		System.out.println(Arrays.toString(arr));
	}

}