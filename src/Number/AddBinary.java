package Number;

public class AddBinary {

	public static void main(String[] args) {

		String str = addBinary("11001011100110011100111100110", "010101010101010010101011101010101010001111001010");

		System.out.println(str);

	}

	public static String addBinary(String a, String b) {

		int l1 = a.length() - 1;
		int l2 = b.length() - 1;
		int carry = 0;

		StringBuilder sb = new StringBuilder();

		while (l1 >= 0 || l2 >= 0 || carry > 0) {

			int n1 = 0;		// The original program is for int addition. Hence like this :)
			int n2 = 0;

			if (l1 >= 0) {
				n1 = a.charAt(l1) - '0';
				l1--;
			}

			if (l2 >= 0) {
				n2 = b.charAt(l2) - '0';
				l2--;
			}

			int sum = (n1 + n2 + carry) % 2; // If you want to add two 'int', change 2 to 10
			carry = (n1 + n2 + carry) >= 2 ? 1 : 0; // If you want to add two 'int', change 2 to 10

			sb.append(String.valueOf(sum));

		}

		return sb.reverse().toString();

	}
}