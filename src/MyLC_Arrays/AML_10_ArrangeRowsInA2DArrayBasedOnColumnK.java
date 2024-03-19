// LC - 2545

package MyLC_Arrays;

import java.util.Arrays;

public class AML_10_ArrangeRowsInA2DArrayBasedOnColumnK {

	static int[][] arrangeRowsBasedOnKthColumnDecreasing(int[][] arr, int k) {

		Arrays.sort(arr, (row1, row2) -> Integer.compare(row2[k], row1[k]));

		return arr;

	}

	static int[][] arrangeRowsBasedOnKthColumnIncreasing(int[][] arr, int k) {

		Arrays.sort(arr, (row1, row2) -> Integer.compare(row1[k], row2[k]));

		return arr;

	}

	static int[][] sortEachRowInIncreasingOrder(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr[i]);
		}

		return arr;

	}

	static int[][] sortEachRowInDecreasingOrder(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr[i]);
			reverseArray(arr[i]);
		}

		return arr;
	}

	static void reverseArray(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

	public static void main(String[] args) {

		int[][] arr = { { 10, 6, 9, 1 }, { 7, 5, 11, 2 }, { 4, 8, 3, 15 } };

		int k = 2; // k starts from 0

		System.out.println(Arrays.deepToString(arrangeRowsBasedOnKthColumnDecreasing(arr.clone(), k)));

		System.out.println(Arrays.deepToString(arrangeRowsBasedOnKthColumnIncreasing(arr.clone(), k)));

		System.out.println(Arrays.deepToString(sortEachRowInIncreasingOrder(arr.clone())));

		System.out.println(Arrays.deepToString(sortEachRowInDecreasingOrder(arr.clone())));

	}

}