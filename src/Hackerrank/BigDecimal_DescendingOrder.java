package Hackerrank;

import java.util.*;
import java.math.BigDecimal;

class BigDecimal_DescendingOrder {

	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2]; // Array size is n + 2

		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}

		sc.close();

		// Write your code here
		for (int i = 1; i <= n - 1; i++) { // ------>
			for (int j = i; j >= 1; j--) { // <- <-- <--- <---- <-----
				// System.out.println(s[j] + " $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ " +
				// s[j - 1]);
				if (new BigDecimal(s[j]).compareTo(new BigDecimal(s[j - 1])) > 0) {	// When s[j] is greater than s[j - 1] (Note: Descending order)  
					String temp = s[j];
					s[j] = s[j - 1];
					s[j - 1] = temp;
				} else {	// Ignore all other cases (Important)
					break;
				}
			}
		}

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}

/**
 * 	9
	-100
	50
	0
	56.6
	90
	0.12
	.12
	02.34
	000.000
 * 
 */