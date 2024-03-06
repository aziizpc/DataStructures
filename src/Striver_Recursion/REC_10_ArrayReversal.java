package Striver_Recursion;

import java.util.Arrays;

public class REC_10_ArrayReversal {
	
	public static int[] arrayReversal(int[] arr, int index) {
		if (index >= (arr.length / 2)) {
			return arr;
		}
		int temp = arr[index];
		arr[index] = arr[arr.length - 1 - index];
		arr[arr.length - 1 - index] = temp;
		return arrayReversal(arr, index + 1);
	}

	public static void main(String[] args) {
		int[] arr = { 67, 1, 0, 5, 2, 0, 11, 23, 45, -90 };
		int index = 0;
		System.out.println(Arrays.toString(arrayReversal(arr, index)));
	}

}