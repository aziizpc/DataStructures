// Worst & Avg case --> O(nsquare)
// Best --> O(n)  (The inner while loop will not be executed.)

package Array;

import java.util.Arrays;

public class Sort_Insertion {

	public static void main(String[] args) {

		int[] arr = { 56, -9, 23, 23, -1, 900, -45, 0, 67, 33, 100, 0 };

		int n = arr.length;

		for (int i = 0; i < n; i++) { // Full

			int j = i;

			while (j > 0 && arr[j] < arr[j - 1]) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
				j--;
			}

		}

		System.out.println(Arrays.toString(arr));

	}
}