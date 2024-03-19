package MyLC_Arrays;

public class AML_6_RomanToInteger {

	public static void main(String[] args) {

		int result = 0;

		int[] decimal = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 }; // Should be in THE SAME ORDER
		String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" }; // Should be in THE
																									// SAME ORDER

		// Test string, the number 895
		String test = "DCCCXCV";

		for (int i = 0; i < roman.length; i++) {
			while (test.indexOf(roman[i]) == 0) { // Get the substring from 'test' which is available in 'roman' and has
													// index 0
				result += decimal[i]; // Sum it
				test = test.substring(roman[i].length()); // Now get the substring discarding the roman[i]
			}	// Repeat
		}
		System.out.println(result);

	}

}