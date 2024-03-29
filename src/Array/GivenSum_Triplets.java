package Array;

import java.util.Arrays;

public class GivenSum_Triplets {

	// function to print
	// triplets with given sum
	static void findTriplets(int[] arr, int n, int sum) {
		// sort array elements
		Arrays.sort(arr);

		for (int i = 0; i < n - 1; i++) {

			int x = arr[i];

			int l = i + 1; // i + 1

			int r = n - 1;

			while (l < r) {
				if (x + arr[l] + arr[r] == sum) {

					System.out.println(x + " " + arr[l] + " " + arr[r]);
					l++;
					r--;
				}

				else if (x + arr[l] + arr[r] < sum)
					l++;

				else
					r--;
			}
			System.out.println("-----------------------");
		}
	}

	// Driver code
	public static void main(String args[]) {
		int[] arr = new int[] { 0, -1, 2, -3, 1 };
		int sum = -2;
		int n = arr.length;
		findTriplets(arr, n, sum);
	}
}