package Recursion;

import java.util.Arrays;

public class ArrayReversal_9 {
	
	public static int[] arrayReversal(int[] arr, int left, int right) {
		if (left >= right) {
			return arr;
		}
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		return arrayReversal(arr, left + 1, right - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 67, 1, 0, 5, 2, 0, 11, 23, 45, -90 };
		int left = 0;
		int right = arr.length - 1;
		System.out.println(Arrays.toString(arrayReversal(arr, left, right)));
	}

}