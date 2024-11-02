// Self -> This can be used to get sum of elements of a subset of array

package Array;

import java.util.Arrays;

public class PrefixSum {

	public static void main(String[] args) {
		
		int[] arr = {7, 1, 3, 2, 8, 6};
		
		int[] prefixSum = new int[arr.length];
		
		prefixSum[0] = arr[0];
		
		for (int i = 1 ; i < prefixSum.length ; i++) {
			
			prefixSum[i] = prefixSum[i - 1] + arr[i];
			
		}
		
		System.out.println(Arrays.toString(prefixSum));
		
		// Get sum of elements from 02 index to 04 index:
		
		int sum = prefixSum[4] - prefixSum[1];
		System.out.println("\nSum: " + sum);

	}

}