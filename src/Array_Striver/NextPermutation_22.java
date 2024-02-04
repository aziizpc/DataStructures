package Array_Striver;

import java.util.Arrays;

// Concept(s): Longer prefix match

public class NextPermutation_22 {

	public static int[] getNextPerm(int[] arr) {

		int n = arr.length;

		int breakPoint = 0;

		for (int i = 0; i < n - 1; i++) {

			if (arr[i] < arr[i + 1])
				breakPoint = i;

		}

		int nextSmallPoint = findTheNextSmallest(arr, breakPoint);

		int temp = arr[breakPoint];
		arr[breakPoint] = arr[nextSmallPoint];
		arr[nextSmallPoint] = temp;

		Arrays.sort(arr, breakPoint + 1, n);

		return arr;

	}

	public static int findTheNextSmallest(int[] arr, int breakPoint) {

		int k = arr[breakPoint];
		int min = Integer.MAX_VALUE;
		int point = breakPoint;

		for (int i = breakPoint + 1; i < arr.length; i++) {
			if (arr[i] > k) {
				if (arr[i] < min) {
					min = arr[i];
					point = i;
				}
			}
		}

		return point;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 1, 5, 4, 3, 0, 0 };

		int[] ans = getNextPerm(arr);

		System.out.println(Arrays.toString(ans));

	}

}
