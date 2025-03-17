package SDETSheet;

public class SDET_021_DecimalToBinary {

	public static void main(String[] args) {

		int n = 10;

		String ans = "";

		while (n != 0) {
			String v = String.valueOf(n % 2);
			ans = v + ans;
			n = n / 2;
		}

		System.out.println(ans);
	}

}