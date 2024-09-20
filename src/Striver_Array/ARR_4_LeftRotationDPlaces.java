package Striver_Array;

import java.util.Arrays;

public class ARR_4_LeftRotationDPlaces {

	public static int[] leftRotateOptimal(int[] arr, int n) { 		// Optimal solution
		n = n % arr.length;
		
		// Note: if right rotation, n = nums.length - 1 - n;	(After above step)
		
		arrayReversal(arr, 0, n);							// Reverse from 0 to n
		arrayReversal(arr, n + 1, arr.length - 1);			// Reverse from (n+1) to end
		arrayReversal(arr, 0, arr.length - 1);				// Reverse fully

		return arr;
	}

	public static int[] arrayReversal(int[] arr, int start, int end) {

		while (start <= end) {								// Lesser than Or Equal to (Equal for ODD)
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