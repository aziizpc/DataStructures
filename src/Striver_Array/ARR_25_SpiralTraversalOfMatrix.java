package Striver_Array;

public class ARR_25_SpiralTraversalOfMatrix {

	public static void printSpiral(int[][] arr) {

		int top = 0;
		int right = arr[0].length - 1; // NOTE (Column)
		int bottom = arr.length - 1; // NOTE (Row)
		int left = 0;

		while (top <= bottom && left <= right) {

			for (int i = left; i <= right; i++) {
				System.out.print(arr[top][i] + " ");
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				System.out.print(arr[i][right] + " ");
			}
			right--;

			if (top <= bottom) { // This is optional (To cover for single row matrix scenario)
				for (int i = right; i >= left; i--) {
					System.out.print(arr[bottom][i] + " ");
				}
				bottom--;
			}

			if (left <= right) { // Ditto
				for (int i = bottom; i >= top; i--) {
					System.out.print(arr[i][left] + " ");
				}
				left++;
			}

		}

	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 0 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
				{ 21, 22, 23, 24, 25 }, { 26, 27, 28, 29, 30 } };

		printSpiral(arr);

	}

}