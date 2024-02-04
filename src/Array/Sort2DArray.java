package Array;

import java.util.Arrays;
import java.util.Comparator;

public class Sort2DArray {

	public static void main(String[] args) {
		int[][] arr1 = { { 3, 2, 1 }, { 6, 0, 4 }, { 9, 8, 7 } };
		Arrays.sort(arr1, Comparator.comparingInt(a -> a[1]));
		System.out.println(Arrays.deepToString(arr1));
		
		// NOTE:

		int[][] arr2 = { { 3, 2, 1 }, { 0, 8, 4 }, { 0, 5, 7 } };
		Arrays.sort(arr2, Comparator.comparingInt((int[] a) -> a[0]).thenComparingInt(a -> a[1]));
		System.out.println(Arrays.deepToString(arr2));
	}

}