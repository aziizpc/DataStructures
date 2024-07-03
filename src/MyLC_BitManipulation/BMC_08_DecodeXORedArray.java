// LC - 1720

package MyLC_BitManipulation;

import java.util.Arrays;

public class BMC_08_DecodeXORedArray {
	
	/* IDEA: We are given the encoded array and the first element
	 * That is:
	 * encoded[i] = decoded[i] ^ decoded[i+1]
	 * 
	 * XORing 'encoded[i] ^ decoded[i+1]' on both sides:
	 * encoded[i] ^ encoded[i] ^ decoded[i+1] = decoded[i] ^ decoded[i+1] ^ encoded[i] ^ decoded[i+1]
	 * 
	 * XOR of two same numbers = 0. Therefore:
	 * decoded[i+1] = decoded[i] ^ encoded[i]
	 * 
	 */
	
	public static int[] decode(int[] encoded, int first) {
		
		int n = encoded.length;
		int[] decoded = new int[n + 1];
		
		decoded[0] = first;
		
		for (int i = 1 ; i < decoded.length ; i++) {
			decoded[i] = decoded[i - 1] ^ encoded[i - 1];
		}
		
		return decoded;
		
    }

	public static void main(String[] args) {
		
		int[] encoded = {1,2,3};
		int first = 1;		
		System.out.println(Arrays.toString(decode(encoded, first)));
		
		encoded = new int[] {6, 2, 7, 3};
		first = 4;
		System.out.println(Arrays.toString(decode(encoded, first)));

	}

}
