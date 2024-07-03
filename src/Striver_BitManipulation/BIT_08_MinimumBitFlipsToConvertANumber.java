package Striver_BitManipulation;

public class BIT_08_MinimumBitFlipsToConvertANumber {
	
	static int minimumFlips(int start, int end) {
		
		int differentBits = start ^ end;			// Get the different bits (Those will be set to 1 after XOR)
		
		int count = 0;								// Counter for bits
		
		while (differentBits != 1) {				// Loop that counts number of set bits
			if ((differentBits & 1) == 1) count++;
			differentBits >>= 1;
		}
		
		return count + 1;							// +1 for incorporating 1
		
	}

	public static void main(String[] args) {
		
		int start = 10;		// 1010
		int end = 7;		// 0111
		
		System.out.println(minimumFlips(start, end));

	}

}