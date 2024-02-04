package Recursion;

public class StringPalindrome_11 {
	
	public static boolean checkPalindrome(String s, int index) {
		if (index >= (s.length() / 2)) {
			return true;
		}
		if (s.charAt(index) != s.charAt(s.length() - 1 - index)) {
			return false;
		}
		return checkPalindrome(s, index + 1);
	}

	public static void main(String[] args) {
		String s1 = "malayalam";
		String s2 = "apple";
		
		int startIndex = 0;
		
		System.out.println(checkPalindrome(s1, startIndex));
		System.out.println(checkPalindrome(s2, startIndex));		

	}

}