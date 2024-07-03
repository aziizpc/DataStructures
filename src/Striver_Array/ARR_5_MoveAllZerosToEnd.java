package Striver_Array;

import java.util.Arrays;

public class ARR_5_MoveAllZerosToEnd {

	public static int[] moveZeros(int[] arr) {

		int j = -2000; // Some -ve number

		for (int i = 0; i < arr.length; i++) { 		// Find the first zero and assign its pos to j and break
			if (arr[i] == 0) {
				j = i;
				break;
			}
		}

		for (int i = j + 1; i < arr.length; i++) {	// Continue from (j+1) and every time you get non zero, SWAP
			if (arr[i] != 0) {						// Thus, 0 moves FORWARD and finally towards the end
				swapNumbers(arr, i, j);
				j++; // Think with eg ({5 6 9 0 0 3 8 9})	// Increment j so that the loop covers this
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
	
/*
	 
5 6 9 0 0 3 8 9

j: 3
i: 4 -> 5
swap numbers: 0, 3
5 6 9 3 0 0 8 9

j: 4
i: 5 -> 6
swap numbers: 0, 8
5 6 9 3 8 0 0 9

j: 5
i: 6 -> 7
swap numbers: 0, 9
5 6 9 3 8 9 0 0

------------------------------


5 6 9 0 3 8 9

j: 3
i: 4
swap numbers: 0, 3
5 6 9 3 0 8 9

j: 4
i: 5
swap numbers: 0, 8
5 6 9 3 8 0 9

j: 5
j: 6
swap numbers: 0, 9
5 6 9 3 8 9 0

*/
	 

}