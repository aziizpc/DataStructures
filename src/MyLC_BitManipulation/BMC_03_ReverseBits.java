// LC - 190

package MyLC_BitManipulation;

public class BMC_03_ReverseBits {
	
	static int reverseBits(int n) {				// Note: This function doesn't bother the sign bit
		
		int ans = 0;							// Set the ans as 0
		
		for (int i = 0 ; i < 32 ; i++) {		// For loop 32 (As the gives number is up to 32 bits)
			
			ans <<= 1;							// LEFT SHIFT 1
												// (Note: Initial ans is 0. LS doesn't make any difference)
			
			ans = ans | (n & 1);				// Perform OR on the ans and (n & 1).
												// Note: (n & 1) returns the same bit @ that position
												// That is, the incoming value keeps appending to ans
			
			n >>= 1;							// RIGHT SHIFT 1 as usual to get the 'previous bit'
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		
		int n = 43261596;						// 00000010100101000001111010011100
		
		System.out.println(reverseBits(n));		// 00111001011110000010100101000000

	}

}