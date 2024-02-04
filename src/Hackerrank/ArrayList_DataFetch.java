package Hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_DataFetch {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();	// Number of Lines
		int d, q, x, y;

		ArrayList[] set = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			d = in.nextInt();	// First integer (Size)
			set[i] = new ArrayList();
			for (int j = 0; j < d; j++) {
				set[i].add(in.nextInt());
			}
		}
		q = in.nextInt(); // Query count
		for (int i = 0; i < q; i++) {
			x = in.nextInt();	// Line number
			y = in.nextInt();	// Data number
			try {
				System.out.println(set[x - 1].get(y - 1));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
		}
	}
}

/* https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
 * 
 * 	5
	5 41 77 74 22 44
	1 12
	4 37 34 36 52
	0
	3 20 22 33
	5
	1 3
	3 4
	3 1
	4 3
	5 5
 * 
 * *
 */