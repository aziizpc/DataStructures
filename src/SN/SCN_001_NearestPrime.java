package SN;

public class SCN_001_NearestPrime {

	public static int getNearestPrime(int m) {
		if (checkPrime(m))
			return m; // If m is prime, return it

		int lower = m - 1;
		int upper = m + 1;

		// Start symmetric search around m
		while (true) {
			if (lower > 1 && checkPrime(lower))
				return lower; // Check lower first
			if (checkPrime(upper))
				return upper; // Then check upper

			lower--;
			upper++;
		}
	}

	public static boolean checkPrime(int k) {
		if (k <= 1)
			return false; // Numbers <= 1 are not prime
		if (k == 2 || k == 3)
			return true; // 2 and 3 are prime
		if (k % 2 == 0)
			return false; // Skip even numbers

		for (int i = 3; i * i <= k; i += 2) {
			if (k % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(getNearestPrime(7668));
	}

}