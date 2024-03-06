package Striver_Recursion;

public class REC_2_Print1ToN {
	
	public static void print1ToN(int i, int n) {
		if (i > n) {
			return;
		}
		System.out.println(i);
		print1ToN(i + 1, n);
	}

	public static void main(String[] args) {
		int n = 10;
		print1ToN(1, n);
	}

}