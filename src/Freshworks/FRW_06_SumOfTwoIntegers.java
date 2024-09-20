package Freshworks;

public class FRW_06_SumOfTwoIntegers {

	public static int getSum(int a, int b) {

		if (a == 0)
			return b;
		if (b == 0)
			return a;

		while (b != 0) {
			int carry = a & b;			// carry 	<- 	a & b
			a = a ^ b;					// a 		<- 	a ^ b
			b = carry << 1;				// b 		<- 	carry << 1
		}
		
		return a;

	}

	public static void main(String[] args) {

		int a = 1, b = 2;
		System.out.println(getSum(a, b));
		
		a = 567; b = 89;
		System.out.println(getSum(a, b));		

	}

}
