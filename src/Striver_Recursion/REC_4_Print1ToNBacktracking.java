package Striver_Recursion;

public class REC_4_Print1ToNBacktracking {

	public static void print1ToNBacktracking(int i, int n) {
		if (i < 1) {
			return;
		}
		print1ToNBacktracking(i - 1, n);	// Minus here
		System.out.println(i); 				// NOTE -> PRINT (OR TASK) AFTER THE FUNCTION CALL
	}

	public static void main(String[] args) {
		int n = 10;
		print1ToNBacktracking(n, n); // NOTE !!!
	}

}