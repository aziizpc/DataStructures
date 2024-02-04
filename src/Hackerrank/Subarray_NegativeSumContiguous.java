// Self

package Hackerrank;

import java.io.*;
import java.util.*;

public class Subarray_NegativeSumContiguous {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] num = new int[n];

		int counter = 0;
		for (int i = 0; i <= n - 1; i++) {
			num[i] = sc.nextInt();
			if (num[i] < 0) {
				counter++;
			}
		}

		int sum = 0;

		for (int i = 0; i <= n - 2; i++) {	// NOTE
			sum = num[i];
			// System.out.println("num[i]: --> " + num[i]);
			for (int j = i + 1; j <= n - 1; j++) {	// NOTE
				// System.out.println("sum: --> " + sum);
				// System.out.println("num[j]: --> " + num[j]);
				// System.out.println(sum + " + " + num[j]);
				sum = sum + num[j];
				// System.out.println("new sum: --> " + sum);
				if (sum < 0) {
					counter++;
					// System.out.println("counter: --> " + counter);
				}
				// System.out.println("");
			}
			sum = 0;
		}
		System.out.println(counter);
	}
}

/*
 * 	5
	1 -2 4 -5 1
 * 
 */