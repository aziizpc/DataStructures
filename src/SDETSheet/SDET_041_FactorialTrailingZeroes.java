package SDETSheet;

public class SDET_041_FactorialTrailingZeroes {

	public static int trailingZeroes(int n) {
		int ans = 0;
		while (n > 0) {
			n /= 5;
			ans += n;
		}
		return ans;
	}

	public static void main(String[] args) {

		int n = 4;
		System.out.println(trailingZeroes(n));	// 24

		n = 5;
		System.out.println(trailingZeroes(n));	// 12 0

		n = 20;
		System.out.println(trailingZeroes(n));	// 243290200817664 0 0 0 0

		n = 25;
		System.out.println(trailingZeroes(n));	// 15511210043330985984 0 0 0 0 0 0
		
		n = 30;
		System.out.println(trailingZeroes(n));	// 26525285981219105863630848 0 0 0 0 0 0 0

	}

}