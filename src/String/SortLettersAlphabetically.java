package String;

import java.util.Arrays;

public class SortLettersAlphabetically {

	public static void main(String[] args) {

		String s = "rdgf kjk lkia ii kyuu han qlkzo";

		String tempString = "";
		String sortedString = "";
		String finalString = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {
				tempString = c + tempString;
				char[] chars = tempString.toCharArray();
				Arrays.sort(chars);
				sortedString = new String(chars);	// NOTE !!!
			} else {
				finalString = finalString + " " + sortedString;
				tempString = "";
				sortedString = "";
			}
		}

		System.out.println(finalString + " " + sortedString);
	}
}