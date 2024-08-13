package Striver_String;

import java.util.HashMap;
import java.util.Map;

public class STR_02B_RomanToInteger {

	public static void main(String[] args) {

		int result = 0;

		int[] decimal = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 }; // Should be in THE SAME ORDER
		String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" }; // Should be in THE
																									// SAME ORDER

		// Test string, the number 895
		String s = "DCCCXCV";

		for (int i = 0; i < roman.length; i++) {	// Loop the 'roman' array (NOT String)
			while (s.indexOf(roman[i]) == 0) { 		// Eg: String s = "abcdefg"; Sysout(s.indexOf("abcde")); => 0 
				result += decimal[i]; 				// Get the corresponding decimal and sum it
				s = s.substring(roman[i].length(), s.length()); // Now get the substring discarding the roman[i]
			}
		}
		System.out.println(result);

	}

}