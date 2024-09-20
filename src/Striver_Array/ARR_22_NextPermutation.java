package Striver_Array;

import java.util.Arrays;

// Concept(s): Longer prefix match

public class ARR_22_NextPermutation {

	public static int[] getNextPerm(int[] arr) {

		int n = arr.length;							

		int breakPoint = 0;							// We need to find bp in array where arr[i] < arr[i + 1]

		for (int i = 0; i < n - 1; i++) {

			if (arr[i] < arr[i + 1])
				breakPoint = i;						// The point which has smaller value (i) is at bp

		}

		int nextSmallPoint = findTheNextSmallest(arr, breakPoint);	// Now, we need to find NEXT SMALLEST
																	// after the element at bp
																	// NEXT SMALLEST => Greater value in RHS
																	// but smallest of them
		
		int temp = arr[breakPoint];									// Swap value @ bp with value at 'point'
		arr[breakPoint] = arr[nextSmallPoint];
		arr[nextSmallPoint] = temp;

		Arrays.sort(arr, breakPoint + 1, n);						// Sort elements from (bp + 1) to last
		
		return arr;													// Return

	}

	public static int findTheNextSmallest(int[] arr, int breakPoint) {

		int k = arr[breakPoint];								// Value at bp is saved as k
		int min = Integer.MAX_VALUE;							// We need this as we need to find NEXT SMALLEST
		int point = breakPoint;									// To save the index of 'min'

		for (int i = breakPoint + 1; i < arr.length; i++) {		// Loop from the point (bp + 1) to end
			if (arr[i] > k) {									// If the current value > value at bp
				if (arr[i] < min) {								// If the value < current minimum
					min = arr[i];								// Save min as current value
					point = i;									// Save the index as 'point'
				}
			}
		}

		return point;											// Return the point
	}

	public static void main(String[] args) {

		int[] arr = { 2, 1, 5, 4, 3, 0, 0 };

		int[] ans = getNextPerm(arr);

		System.out.println(Arrays.toString(ans));

	}

}
