package SDETSheet;

public class SDET_024_HexToDecimal {

	public static int convertHexToDecimal(String hex) {
		int decimal = 0;
		int base = 1; // 16^0 initially

		// Process each character from right to left
		for (int i = hex.length() - 1; i >= 0; i--) {

			char hexChar = hex.charAt(i);

			// Convert hex digit to decimal
			int value = 0;
			
			if (hexChar >= '0' && hexChar <= '9') {
				value = hexChar - '0';
			}

			else if (hexChar >= 'A' && hexChar <= 'F') {
				value = hexChar - 'A' + 10;
			}

			else if (hexChar >= 'a' && hexChar <= 'f') {
				value = hexChar - 'a' + 10;
			}

			// Multiply value by its positional weight and add to total
			decimal += value * base;

			// Update base (16^position)
			base *= 16;
		}

		return decimal;
	}
	
	public static void main(String[] args) {

		String hex = "2135";
		System.out.println(convertHexToDecimal(hex));

		hex = "1a";
		System.out.println(convertHexToDecimal(hex));

		hex = "ffffffff";
		System.out.println(convertHexToDecimal(hex));

	}
	
}