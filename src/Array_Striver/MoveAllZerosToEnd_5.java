package Array_Striver;

import java.util.Arrays;

public class MoveAllZerosToEnd_5 {

	public static int[] moveZeros(int[] arr) {

		int j = -2000; // Some -ve number

		for (int i = 0; i < arr.length; i++) { // Find the first zero and assign its pos to j
			if (arr[i] == 0) {
				j = i;
				break;
			}
		}

		for (int i = j + 1; i < arr.length; i++) {
			if (arr[i] != 0) {
				swapNumbers(arr, i, j);
				j++; // Think with eg ({5 6 9 0 0 3 8 9})
			}
		}
		return arr;
	}

	public static void swapNumbers(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 7, 0, 1, 2, 0, 3, 3, 0, 0, 1, 11, 2 };
		moveZeros(arr);
		System.out.println(Arrays.toString(arr));
	}

}
