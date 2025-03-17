package SDETSheet;

public class SDET_042_Regex {

	public static void main(String[] args) {
		// Hardcoded examples
		String[] strings = { "abc123", "hello", "12345", "a1b2c3", "test@", "A1B2C3", "aziizpc@gmail.com",
				"aapc@eng.c" };
		String[] regexPatterns = { "[a-z]+[0-9]+", // Lowercase letters followed by digits
				"\\d+", // Only digits
				"[a-zA-Z0-9]+", // Alphanumeric characters
				"\\w+[@]", // Word characters ending with '@'
				"[A-Z]+\\d+", // Uppercase letters followed by digits
				"[a-zA-Z0-9.-]+(.[a-zA-Z]{2,})+" };

		// Loop through patterns and strings
		for (String regex : regexPatterns) {
			System.out.println("Regex Pattern: " + regex);
			for (String input : strings) {
				boolean isMatch = input.matches(regex);
				System.out.println("String: \"" + input + "\" matches? " + isMatch);
			}
			System.out.println(); // Add a blank line for clarity
		}

	}
}