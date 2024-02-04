package Hackerrank;

import java.math.BigDecimal;

public class BigDecimal_Basics1 {

	public static void main(String[] args) {

		// create 2 BigDecimal objects
		BigDecimal bg1, bg2;

		bg1 = new BigDecimal("10");
		bg2 = new BigDecimal("20");

		// create int object
		int res;

		res = bg1.compareTo(bg2); // compare bg1 with bg2

		String str1 = "Both values are equal";
		String str2 = "First Value is greater";
		String str3 = "Second value is greater";

		if (res == 0) // Same
			System.out.println(str1);
		else if (res == 1) // First greater
			System.out.println(str2);
		else if (res == -1) // Second greater
			System.out.println(str3);
	}
}