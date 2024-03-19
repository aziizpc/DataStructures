// LC-1790

package MyLC_String;

import java.util.Arrays;

public class STR_12_CheckIfOneSwapCanMakeStringsEqual {

	public static boolean areAlmostEqual(String s1, String s2) {

		char[] s1CharArray = s1.toCharArray(), s2CharArray = s2.toCharArray();
		
		if (Arrays.equals(s1CharArray, s2CharArray))
			return true;	// Arrays are already same

		int s1len = s1CharArray.length, s2len = s2CharArray.length;
		if (s1len != s2len)
			return false;	// False if array lengths are different

		int[] s1Array = new int[26], s2Array = new int[26];

		int count = 0;

		for (int i = 0; i < s1len; i++) {

			char a = s1CharArray[i];
			char b = s2CharArray[i];

			if (a != b)
				count++;

			if (count > 2)
				return false;

			s1Array[a - 'a']++;
			s2Array[b - 'a']++;

		}

		return Arrays.equals(s1Array, s2Array);

	}

	public static void main(String[] args) {
		
		String s1 = "bank";
		String s2 = "kanb";
		
		System.out.println(areAlmostEqual(s1, s2));

	}

}