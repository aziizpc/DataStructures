package Recursion;

public class PrintNameFiveTimes_1 {
	
	public static void printName(int i, int n) {
		if (i > n) {
			return;
		}
		System.out.println("aapc");
		printName(i + 1, n);
	}

	public static void main(String[] args) {
		int n = 5;	
		printName(1, n);
	}

}