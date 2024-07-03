// Self

package Striver_BitManipulation;

public class BIT_05_ToggleIthBit {
	
	public static int toggleTheBit(int num, int k) {
		
		int shift = 1;								
		shift <<= k;								// Shift 1 (k positions to the LEFT)
		
		num^= shift;
		
		return num;
		
	}

	public static void main(String[] args) {
		
		int num = 13;								// 1101
		int k = 2;									
		System.out.println(toggleTheBit(num, k));	// 1001
		
		num = 13;									// 1101
		k = 1;									
		System.out.println(toggleTheBit(num, k));	// 1111

	}

}
