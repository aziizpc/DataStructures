// LC - 1734

package MyLC_BitManipulation;

import java.util.Arrays;

public class BMC_09_DecodeXORedPermutation {
	
	/* This logic is applicable only if the given array is of EVEN LENGTH.
	 * The expected array is of EVEN LENGTH 
	 * 
	 * Logic:
	 * Idea is to find 'first' and apply the same logic in the previous program.
	 * If the given array is even, the 'first' will be:
	 * --> XOR of numbers from 1 to n & xor of numbers ^ xor of numbers @ odd indices of encoded.
	 * 
	 * n: Length of decoded (ans) array
	 * 
	 */
	
	public static int[] decode(int[] encoded) {	// Note: No FIRST given unlike previous problem
		
		int n = encoded.length + 1;
		
		int[] decoded = new int[n];				// The output array will be of encoded.length + 1 :)
		
		int first = 0;							// We need to find the first element
		
		for (int i = 1 ; i <= n ; i++) {		// [1.....n] both inclusive | Start from 0 => No difference 
			first ^= i;							// XOR the i itself
			if (i < n && (i % 2 == 1)) {		// i < n because encoded is 1 shorted; We need only ODD places
				first ^= encoded[i];			// XOR it
			}
		}
		
		decoded[0] = first;						// Now that we have 'first', set it as index 0
		
		for (int i = 1 ; i < n ; i++) {			// Check previous program
			decoded[i] = decoded[i - 1] ^ encoded[i - 1];
		}
		
		return decoded;
		
	}

	public static void main(String[] args) {
		
		int[] encoded = {3, 1};		
		System.out.println(Arrays.toString(decode(encoded)));

	}

}