// LC - 1780
/*
 * 	Convert the given integer n to base-3 representation
	Check if there are any "2" digits in this representation
	If there are no "2" digits, then we can represent the number as 
	a sum of distinct powers of three
 */

package SDETSheet;

public class SDET_048_CheckIfNumberIsASumOfPowersOfThree {

	public static boolean checkPowersOfThree(int n) {

		while (n != 0) {
			if (n % 3 == 2)
				return false;
			n /= 3;
		}

		return true;

	}

	public static void main(String[] args) {

		int n = 12;
		System.out.println(checkPowersOfThree(n));

		n = 91;
		System.out.println(checkPowersOfThree(n));

		n = 21;
		System.out.println(checkPowersOfThree(n));

	}

}