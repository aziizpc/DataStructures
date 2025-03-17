// LC - 873

package SDETSheet;

import java.util.HashSet;
import java.util.Set;

public class SDET_046_LengthOfLongestFibonacciSubsequence {

	public static int lenLongestFibSubseq(int[] arr) {

		Set<Integer> hs = new HashSet<>();

		for (int i : arr) {					// Add arr elements to HashSet
			hs.add(i);
		}

		int maxLen = 2;

		for (int i = 0; i < arr.length - 1; i++) {	// Logic similar to largest sequence
			for (int j = (i + 1); j < arr.length; j++) {
				int a = arr[i], b = arr[j], len = 2;
				while (hs.contains(a + b)) {
					int temp = b;
					b = (a + b);
					a = temp;
					len++;
				}
				maxLen = Math.max(maxLen, len);
			}
		}

		return maxLen > 2 ? maxLen : 0;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(lenLongestFibSubseq(arr));

		arr = new int[] { 1, 3, 7, 11, 12, 14, 18 };
		System.out.println(lenLongestFibSubseq(arr));

	}

}