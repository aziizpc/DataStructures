package Array_Striver;

import java.util.Arrays;

public class LeftRotationDPlaces_4 {

	public static int[] leftRotateOptimal(int[] arr, int n) { // Optimal solution
		n = n % arr.length;
		arrayReversal(arr, 0, n);
		arrayReversal(arr, n + 1, arr.length - 1);
		arrayReversal(arr, 0, arr.length - 1);

		return arr;
	}

	public static int[] arrayReversal(int[] arr, int start, int end) {

		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 7, 0, 1, -5, 9, 3, 0, 5, 3 };
		int n = 103;
		leftRotateOptimal(arr, n);
		System.out.println(Arrays.toString(arr));
	}

}