package Striver_BitManipulation;

public class BIT_03_ClearTheIthBit {
	
	static int clearBit (int n, int k) {
		
		int left = 1;
		left <<= k;							// Left Shift of 1
		
		left = ~left;						// Negation
		
		int ans = n & left;					// AND operation
		
		return ans;	
		
	}	

	public static void main(String[] args) {
		
		int n = 11;	// 1011
		
		int k = 3;
		
		System.out.println(clearBit(n, k));

	}

}
