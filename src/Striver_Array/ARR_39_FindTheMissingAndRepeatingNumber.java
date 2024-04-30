package Striver_Array;

import java.util.Arrays;

public class ARR_39_FindTheMissingAndRepeatingNumber {
	
	public static int[] getMissingAndRepeatingUsingMath(int[] arr) {

		int n = arr.length;

		int sumOfFirstNNumbers = ((n * (n + 1)) / 2);

		int sumOfSquaresOfFirstNNumbers = ((n * (n + 1) * ((2 * n) + 1)) / 6); // (n * (n + 1) * (2n + 1)) / 6

		int givenIntegersSum = 0;
		int givenIntegersSquareSum = 0;

		for (int i : arr) {
			givenIntegersSum += i;
			givenIntegersSquareSum += (i * i);
		}

		int sumDiff = sumOfFirstNNumbers - givenIntegersSum; // x - y = some number

		int squareDiff = sumOfSquaresOfFirstNNumbers - givenIntegersSquareSum; // x sqr - y sqr = some other

		// Note: (x sqr - y sqr) = (x + y)(x - y)
		int sumOfNumbers = squareDiff / sumDiff;

		// sumDiff = x - y ; sumOfNumbers = x + y

		int doubleOfMissing = sumDiff + sumOfNumbers;

		int missingNumber = doubleOfMissing / 2;

		int repeatedNumber = missingNumber - sumDiff;

		return new int[] { missingNumber, repeatedNumber };

	}

	public static int[] getMissingAndRepeatingUsingXor(int[] arr) {

		int n = arr.length;

		int xor = 0;

		for (int i = 1; i <= n; i++) { // xor all the arr elements. Also, with numbers 1 to n.
			xor ^= arr[i - 1];
			xor ^= i;
		}
		
		// System.out.println(xor); --> 4

		int bitPosition = 0;

		while (true) { // Find the position in XOR where bit is 1 (Important)
			if ((xor & (1 << bitPosition)) != 0) { // & --> Gives 1 only if both are 1.
				break;
			} else {
				bitPosition++;
			}
		}
		
		// System.out.println(bitPosition); --> 2

		int zeroTeam = 0;

		int oneTeam = 0;

		for (int i = 0; i < n; i++) { // On the array
			if ((arr[i] & (1 << bitPosition)) != 0) {
				oneTeam ^= arr[i];
			} else {
				zeroTeam ^= arr[i];
			}
		}

		for (int i = 1; i <= n; i++) { // On the numbers
			if ((i & (1 << bitPosition)) != 0) {
				oneTeam ^= i;
			} else {
				zeroTeam ^= i;
			}
		}

		int count = 0;
		int missingNumber = -1;
		int repeatedNumber = -1;

		for (int i = 0; i < n; i++) { // Let's find out
			if (arr[i] == zeroTeam) {
				count++;
			}
		}

		if (count == 2) {
			repeatedNumber = zeroTeam;
			missingNumber = oneTeam;
		} else {
			repeatedNumber = oneTeam;
			missingNumber = zeroTeam;
		}

		return new int[] { missingNumber, repeatedNumber };

	}

	public static void main(String[] args) {

		int[] arr = { 4, 3, 6, 2, 1, 1 }; // Array elements 'starting' from '1' (0 not there)

		int[] ans1 = getMissingAndRepeatingUsingMath(arr);

		int ans2[] = getMissingAndRepeatingUsingXor(arr);

		System.out.println(Arrays.toString(ans1));

		System.out.println(Arrays.toString(ans2));

	}

}