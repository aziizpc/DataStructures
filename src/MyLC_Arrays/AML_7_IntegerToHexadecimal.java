package MyLC_Arrays;

public class AML_7_IntegerToHexadecimal {

	public static String intToHex(int num) {
		
		StringBuilder hex = new StringBuilder();
		
		if (num == 0) {
			return "0";
		}

		while (num != 0) {
			int remainder = num & 0xF; // Extract last 4 bits using bitwise AND
			char hexDigit = (remainder < 10) ? (char) (remainder + '0') : (char) (remainder - 10 + 'A');
			hex.insert(0, hexDigit); // Prepend digit to the string
			num >>>= 4; // Efficiently shift right by 4 bits (Three > because we are considering sign)
		}

		return hex.toString();
	}

	public static void main(String[] args) {
		int number = 255;
		String hexString = intToHex(number);
		System.out.println("Hexadecimal representation: " + hexString);
	}

}