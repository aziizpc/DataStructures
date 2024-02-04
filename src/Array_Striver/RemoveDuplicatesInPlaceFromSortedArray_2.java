package Array_Striver;

import java.util.Arrays;

public class RemoveDuplicatesInPlaceFromSortedArray_2 {

	public static int[] removeDuplicate(int[] arr) {
		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] != arr[i]) {
				arr[i + 1] = arr[j];
				i++;
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