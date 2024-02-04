package Misc;

public class Pattern_Digit5 {

	public static void main(String[] args) {

		int k = 1;
		
		// y axis reversed ==> i < j statement

		for (int i = 6; i >= 1; i--) {	// Changed
			for (int j = 6; j >= 1; j--) {	// Changed
				
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