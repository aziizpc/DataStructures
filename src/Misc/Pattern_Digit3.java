package Misc;

public class Pattern_Digit3 {

	public static void main(String[] args) {

		int k = 1;
		
		// y axis reversed ==> i < j statement

		for (int i = 0; i < 5; i++) { // Row untouched as we still need 5 rows with element count upped in the subsequent rows
			for (int j = 5; j >= 0; j--) { // Reversed and '0'd

				if (i < j) {
					System.out.print("\t");
				} else {
					System.out.print(k + "\t");
					k++;
				}
			}
			System.out.println("");

		}

	}
}