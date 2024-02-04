package String;

public class GenerateRendomString {

	// function to generate a random string of length n
	static String getAlphaNumericString(int n) {

		// chose a Character random from this String
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz" + "~!@#$%^&*()[]{}:;',./<>?|";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(n);

		// for (int i = 0; i < n; i++) {
		while (sb.length() < n) {

			// Generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());
			System.out.println("Index: " + index);

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
			
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		// Get the size n
		int n = 20;

		// Get and display the alphanumeric string
		System.out.println(GenerateRendomString.getAlphaNumericString(n));
	}

}