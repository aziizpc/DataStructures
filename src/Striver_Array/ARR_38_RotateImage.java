// LC - 48

package Striver_Array;

/*
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 
 * 1 4 7
 * 2 5 8
 * 3 6 9
 * 
 * 7 4 1
 * 8 5 2
 * 9 6 3
 * 
 */

import java.util.Arrays;

public class ARR_38_RotateImage {

	public static int[][] rotatetheArray(int[][] arr) {
		return getReverse(getTranspose(arr)); 	// Get transpose and then reverse it
	}

	public static int[][] getTranspose(int[][] arr) {
		for (int i = 1; i < arr.length; i++) { 	// We start from the element (1,0) and swap from the other part
												// of the diagonal. The loop goes till the last ROW and column j < i.
			for (int j = 0; j < i; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		return arr;
	}

	public static int[][] getReverse(int[][] arr) {	// Check picture
		for (int i = 0; i < arr.length; i++) {		// For loop all the rows
			int left = 0;							// Get left column (start) as 0
			int right = arr[i].length - 1;			// Get right column (end) as the last COLUMN
			while (left < right) {					// Swap
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = temp;
				left++;
				right--;
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println(Arrays.deepToString(rotatetheArray(arr)));
	}

}
