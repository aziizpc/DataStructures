package Misc;

public class AndOrXorShiftNot {

	public static void main(String[] args) {

		int a = 13;
		int b = 7;
		
		System.out.println(a & b);						// 1 only if both the bits are 1, else 0
		
		System.out.println(a | b);						// 1 only if at least one of the bit is 1, else 0
		
		System.out.println(a ^ b);						// If 1s are ODD => 1 ; 1s are EVEN => 0
														// All are 0s => There are zero 1s (0 is even) => 0
		
		System.out.println(a << b);						// Left shift (See other program)
		
		System.out.println(a >> b);						// Right shift
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.pow(2, 31) - 1);		// -1 for sign
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Math.pow(-2, 31));
		
		// Positive number: Stored as it is
		// Negative number: Stored as 2's compliment (That is FLIP + 1) That is, 1's compliment + 1
		
		System.out.println(~5);
		System.out.println(~(-6));
		
		/*
		 * HOW NOT is calculated:
		 * 
		 * Step 1: 	GET the binary number how the number is stored. Remember that negative numbers are stored as
		 * 			2's compliment.
		 * Step 2: FLIP all the bits (Or we can say 1's compliment)
		 * Step 3: Check the SIGN BIT (31st bit):
		 * 			If YES -> Calculate 2's compliment
		 * 			If NO  -> STOP and return
		 * 
		 */
		

	}

}