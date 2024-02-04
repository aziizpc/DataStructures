// We select the smallest at each iteration and place at each index

package Array;

import java.util.Arrays;

public class Sort_Selection {

	public static void main(String[] args) {

		int[] arr = { 56, -9, 23, 23, -1, 900, -45, 0, 67, 33, 100, 0 };

		int n = arr.length;

		for (int i = 0; i <= n - 2; i++) {

			int minPos = i; // Assume that the minimum is at position i (The current position)

			for (int j = i + 1; j <= n - 1; j++) {

				if (arr[j] < arr[minPos])
					minPos = j;

			}

			int temp = arr[i];
			arr[i] = arr[minPos];
			arr[minPos] = temp;

		}

		System.out.println(Arrays.toString(arr));

	}

}