// Self

package Array_Striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfTwoSortedArrays_6 {

	public static int[] getUnion(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;

		List<Integer> myList = new ArrayList<Integer>();

		if (arr1[0] <= arr2[0]) {
			myList.add(arr1[0]);
			i++;
		} else {
			myList.add(arr2[0]);
			j++;
		}

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j] && myList.get(myList.size() - 1) != arr1[i]) {
				myList.add(arr1[i]);
				i++;
			} else if (arr2[j] < arr1[i] && myList.get(myList.size() - 1) != arr2[j]) {
				myList.add(arr2[j]);
				j++;
			} else {
				i++;
				j++;
			}
		}

		while (i < arr1.length) {
			if (myList.get(myList.size() - 1) != arr1[i]) {
				myList.add(arr1[i]);
				i++;
			} else
				i++;
		}

		while (j < arr2.length) {
			if (myList.get(myList.size() - 1) != arr2[j]) {
				myList.add(arr2[j]);
				j++;
			} else
				j++;
		}

		return myList.stream().mapToInt(e -> e).toArray();
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 2, 3, 4, 5 };
		int[] arr2 = { 2, 3, 4, 4, 5, 6 };

		int[] arr = getUnion(arr1, arr2);

		System.out.println(Arrays.toString(arr));

	}

}