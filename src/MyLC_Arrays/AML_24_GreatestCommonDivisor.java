package MyLC_Arrays;

public class AML_24_GreatestCommonDivisor {

	public static int getGcd(int x, int y) {

		int gcd = 1;									// Let GCD be 1

		for (int i = 1; (i <= x) && (i <= y); i++) {	// Loop till the smaller number among x & y
			if ((x % i == 0) && (y % i == 0)) {			// If both gives 0 with % operator
				gcd = i;								// Set that number as GCD
			}
		}

		return gcd;										// Return GCD

	}

	public static void main(String[] args) {

		int x = 12;
		int y = 8;

		System.out.println(getGcd(x, y));

	}

}