package Misc;

public class Pattern_Star3 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) { // 0 1 2 3 4
			for (int j = 4; j >= 0; j--) { // 4 3 2 1 0
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print(" *"); // Put a space before * (This similar to StarPattern_2)
				}
			}
			System.out.println("");
		}

		System.out.println("-----------------------------------");

		for (int i = 0; i < 5; i++) { 		// 0 1 2 3 4
			for (int j = 0; j < 5; j++) { 	// 0 1 2 3 4
				if (i <= j) {
					System.out.print(" *"); // Put a space before * (This similar to StarPattern_2)
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}