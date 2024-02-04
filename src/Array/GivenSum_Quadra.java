package Array;

import java.util.Arrays;

import java.util.*;

class GivenSum_Quadra {

	public static void getNumbers(int[] array, int sum) {

		Arrays.sort(array);

		for (int i = 0; i < array.length - 1; i++) {

			int x = array[i];
			int y = array[i + 1];
			int l = i + 2;
			int r = array.length - 1;

			while (l < r) {

				if (x + y + array[l] + array[r] == sum) {
					System.out.println(x + " " + y + " " + array[l] + " " + array[r]);
					l++;
					r--;
					System.out.println("\n");
				} else if (x + y + array[l] + array[r] < sum) {
					l++;
				} else {
					r--;
				}

			}

		}

	}

	public static void main(String[] args) {
		int[] arr = { 7, 8, 1, 0, 6, 2 }; // 0 1 2 6 7 8
		int sum = 16;
		getNumbers(arr, sum);
	}
}