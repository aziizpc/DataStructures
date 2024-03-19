package MyLC_Arrays;

public class AML_8_HexadecimalToInteger {

	public static int hexToInteger(String hexString) {
		
		hexString = hexString.toUpperCase(); // Ensure consistent case

		int value = 0;
		int power = 0;

		for (char c : hexString.toCharArray()) {
			int digit = getHexDigitValue(c);
			if (digit == -1) {
				throw new IllegalArgumentException("Invalid hexadecimal character: " + c);
			}
			value += digit * Math.pow(16, power);
			power++;
		}

		return value;
	}

	private static int getHexDigitValue(char c) {
		if (c >= '0' && c <= '9') {
			return c - '0';
		} else if (c >= 'A' && c <= 'F') {
			return 10 + c - 'A';
		} else {
			return -1; // Invalid character
		}
	}

	public static void main(String[] args) {
		String hexString = "FF";
		int integerValue = hexToInteger(hexString);
		System.out.println("Integer equivalent: " + integerValue);
	}

}