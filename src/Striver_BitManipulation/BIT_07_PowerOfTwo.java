// There is another solution in MyLC

package Striver_BitManipulation;

public class BIT_07_PowerOfTwo {
	
	public static boolean isPowerOfTwo(int num) {
		
		if ((num & (num - 1)) == 0) return true;
		
		else return false;
		
		/*
		 * EXPLAINED:
		 * 
		 * 16:		10000
		 * 16 - 1:	01111
		 * &:		00000	(true)
		 * 
		 * 14:		1110
		 * 14 - 1:	1101
		 * &:		1100	(false)
		 */
		
	}
	
	

	public static void main(String[] args) {
		
		int num = 16;
		System.out.println(isPowerOfTwo(num));
		
		num = 14;
		System.out.println(isPowerOfTwo(num));

	}

}
