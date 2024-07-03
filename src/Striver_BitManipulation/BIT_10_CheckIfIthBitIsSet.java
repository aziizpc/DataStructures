package Striver_BitManipulation;

public class BIT_10_CheckIfIthBitIsSet {
	
	static boolean checkIfSet(int num, int k) {
		
		if ((num & (1 << k)) != 0) return true;				// Standard Equation (Remember)
															// Note != 0 --> Should be THIS (Results in decimal)
		return false;
		
		/*
		 * HOW?
		 * 
		 * 10:		1010 THIS
		 * 1 << 3:	0001
		 * 			0010
		 * 			0100
		 * 			1000 THIS
		 * 
		 * &		1010 & 1000
		 * =		1000 TRUE
		 * 
		 */
		
	}

	public static void main(String[] args) {

		int num = 10;		// 1010		
		int k = 1;		
		System.out.println(checkIfSet(num, k));
		
		k = 2;
		System.out.println(checkIfSet(num, k));
		
		k = 3;
		System.out.println(checkIfSet(num, k));

	}

}