// LC - 693

package MyLC_BitManipulation;

public class BMC_06_BinaryNumberWithAlternatingBits {

	public static boolean checkBinaryNumberStatus(int num) {
		
		num ^= (num >> 1);										// XOR with num's RS											
		return ((num & (num + 1)) == 0);						// Calculate num AND (num + 1). 0 => true
		
		/*
		 * num: 101
		 * num >> 1: 010
		 * 
		 *      101
		 *      010
		 *      ---
		 * XOR: 111
		 * 
		 * num + 1: 1000
		 * 
		 *      0111
		 *      1000
		 *      ----
		 * AND: 0000 :)
		 * 
		 */
		
	}

	public static void main(String[] args) {

		int num = 5;										// 101
		System.out.println(checkBinaryNumberStatus(num));
		
		num = 10;											// 1010
		System.out.println(checkBinaryNumberStatus(num));

		num = 6;											// 110
		System.out.println(checkBinaryNumberStatus(num));					
		
	}

}