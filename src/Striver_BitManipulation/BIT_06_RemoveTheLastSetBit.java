package Striver_BitManipulation;

/*
 * NOTES (Understand the pattern):
 * 
 * Binary of 16:		10000		|		Binary of 15:		01111
 * Binary of 40: 		101000		|		Binary of 39:		100111
 * Binary of 84:		1010100		|		Binary of 83:		1010011
 * 
 */

public class BIT_06_RemoveTheLastSetBit {
	
	public static int removeTheLastSetBit(int num) {
		
		return (num & (num - 1));
		
		/*
		 * Explained:
		 * 
		 * 13: 		1101
		 * 13 - 1:	1100	(Following the above pattern)
		 * &:		1100
		 * 
		 * 40:		101000
		 * 40 - 1:	100111
		 * &:		100000		
		 * 
		 */
		
	}

	public static void main(String[] args) {

			int num = 13;									// 1101		(The last 1 to be removed)
			System.out.println(removeTheLastSetBit(num));	// 1100
			
			num = 16;										// 10000	(There is only one 1)
			System.out.println(removeTheLastSetBit(num));	// 00000
			
			num = 40;
			System.out.println(removeTheLastSetBit(num));				

	}

}