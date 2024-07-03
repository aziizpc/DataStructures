package Striver_BitManipulation;

public class BIT_02_SetKthBitAs1 {
	
	public static int setOne(int n, int k) {
		
		int left = 1;
		left <<= k;
		
		int ans = n | left;					// OR operation
		
		return ans;		
		
	}

	public static void main(String[] args) {

		int num = 13;	// 1101
		
		int k = 1;
		
		System.out.println(setOne(num, k));

	}

}