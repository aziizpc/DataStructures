package Recursion;

public class PrintNTo1Backtracking_5 {
	
	public static void printNTo1Backtracking(int i, int n) {
		if (i > n) {
			return;
		}
		printNTo1Backtracking(i + 1, n); 	// Plus here
		System.out.println(i);				// NOTE -> PRINT (OR TASK) AFTER THE FUNCTION CALL
	}

	public static void main(String[] args) {
		int n = 10;
		printNTo1Backtracking(1, n); // NOTE !!!
	}

}
