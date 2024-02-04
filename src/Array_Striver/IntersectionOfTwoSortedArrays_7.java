// Self

package Array_Striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoSortedArrays_7 {

	public static int[] getIntersection(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;

		List<Integer> myList = new ArrayList<Integer>();

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				myList.add(arr1[i]);
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