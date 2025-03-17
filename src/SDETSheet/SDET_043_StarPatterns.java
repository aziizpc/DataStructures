package SDETSheet;

public class SDET_043_StarPatterns {

	public static void main(String[] args) {

		for (int i = 0; i <= 6; i++) {
			for (int j = 6; j >= 0; j--) {
				if (j <= i) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}

		System.out.println("-------------------------------------------");

		for (int i = 0; i <= 6; i++) {
			for (int j = 6; j >= 0; j--) {
				if (j >= i) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}

		System.out.println("-------------------------------------------");

		for (int i = 0; i <= 6; i++) {
			for (int j = 6; j >= 0; j--) {
				if (j <= i) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println(" ");
		}

		System.out.println("-------------------------------------------");

		int count = 6;								// NOTE
		for (int i = 0; i <= 6; i++) {
			for (int j = 6; j >= 0; j--) {
				if (j <= count) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println(" ");
			count--;
		}

		System.out.println("-------------------------------------------");

		for (int i = 0; i <= 6; i++) {
			for (int j = 6; j >= 0; j--) {
				if (j <= i) {
					System.out.print(" *");
				} else
					System.out.print(" ");
			}
			System.out.println(" ");
		}

	}

}