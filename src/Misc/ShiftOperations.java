package Misc;

public class ShiftOperations {

	public static void main(String[] args) {
		
		int a = 4;
		
		int b = 8;
		
		System.out.println(a << 2);
		/*
		 * This means a is shifted left 2 times:
		 * 
		 * 4: 00100
		 * --------
		 * SL:01000
		 * SL:10000 = 16 
		 * 
		 * NOTE: THERE IS AN EQUATION TO CALCULATE: (x * (2 raise to k)) --> x is a here; k is 2
		 * 
		 */
		
		System.out.println(b >> 3);
		/*
		 * This means b is shifted right 3 times:
		 * 
		 * 8: 1000
		 * --------
		 * SR: 0100
		 * SR: 0010
		 * SR: 0001 = 1 
		 * 
		 * NOTE: THERE IS AN EQUATION TO CALCULATE: (x / (2 raise to k)) --> x is b here; k is 3
		 * 
		 */

	}

}
