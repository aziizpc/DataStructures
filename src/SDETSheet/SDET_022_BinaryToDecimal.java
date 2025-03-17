package SDETSheet;

public class SDET_022_BinaryToDecimal {

	public static void main(String[] args) {

		String binary = "1010";
		System.out.println(convertBinaryToDecimal(binary));

		binary = "11111111";
		System.out.println(convertBinaryToDecimal(binary));

		binary = "100000";
		System.out.println(convertBinaryToDecimal(binary));

	}

	public static int convertBinaryToDecimal(String binary) {
		int decimal = 0;
		int base = 1; // 2^0 initially

		// Process each character from right to left
		for (int i = binary.length() - 1; i >= 0; i--) {

			char binaryChar = binary.charAt(i);

			// Convert binary digit to decimal (0 or 1)
			int value = binaryChar - '0';

			// Multiply value by its positional weight and add to total
			decimal += value * base;

			// Update base (2^position)
			base *= 2;
		}

		return decimal;
	}
}