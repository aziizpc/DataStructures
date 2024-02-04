package Misc;

public class Pattern_Digit4 {

	public static void main(String[] args) {
		
		int k = 1;

		for (int i = 6; i >= 0; i--) {	// Reversed as row structure reversed
			for (int j = 0; j <= i; j++) {	// Untouched
				
				System.out.print(k + "\t");	// REST ALL SAME
				k ++;
			}
			System.out.println("");
		}

	}

}