package SDETSheet;

import java.util.Arrays;

public class SDET_032_MoveOddEven {

	public static int[] moveOddEven(int[] arr) {	// Best solution
		int left = 0, right = arr.length - 1;

		while (left < right) {
			// Increment left if it's already odd
			while (left < right && arr[left] % 2 == 1) {
				left++;
			}

			// Decrement right if it's already even
			while (left < right && arr[right] % 2 == 0) {
				right--;
			}

			// Swap if left is even and right is odd
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}

		return arr;
	}

	public static int[] oddEven(int[] arr) {		// Using DNF

		int n = arr.length;
		int low = 0;
		int mid = 0;
		int high = (n - 1);

		while (mid <= high) {

			if (arr[mid] == 0) {
				mid++;
			}

			else if ((arr[mid] & 1) == 1) {
				swapFunction(arr, mid, low);
				mid++;
				low++;
			}

			else if ((arr[mid] & 1) == 0) {
				swapFunction(arr, mid, high);
				high--;
			}
		}

		return arr;

	}

	public static void swapFunction(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		moveOddEven(arr);
		System.out.println(Arrays.toString(arr)); // Output: [1, 7, 3, 5, 4, 6, 8, 2]

		arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		oddEven(arr);
		System.out.println(Arrays.toString(arr)); // Output: [1, 7, 3, 5, 6, 4, 8, 2]
	}

}