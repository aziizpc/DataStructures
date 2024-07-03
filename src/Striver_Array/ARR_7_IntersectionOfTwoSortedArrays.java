// Self

package Striver_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARR_7_IntersectionOfTwoSortedArrays {

	public static int[] getIntersection(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;

		List<Integer> myList = new ArrayList<Integer>();

		while (i < arr1.length && j < arr2.length) {	// while with & condition
			if (arr1[i] < arr2[j]) {					// First is small => Increment i
				i++;
			} else if (arr1[i] > arr2[j]) {				// Second is small => Increment j
				j++;
			} else {									// Else, it means both are equal => Add to list
				myList.add(arr1[i]);					// Increment both
				i++;
				j++;
			}
		}

		return myList.stream().mapToInt(e -> e).toArray();
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 2, 3, 3, 4, 5, 6 };
		int[] arr2 = { 2, 3, 3, 5, 6, 6, 7 }; // OP: {2,3,3,5,6}

		int[] arr = getIntersection(arr1, arr2);

		System.out.println(Arrays.toString(arr));

	}

}