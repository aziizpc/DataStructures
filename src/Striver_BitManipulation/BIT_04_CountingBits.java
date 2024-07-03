// LC - 338

package Striver_BitManipulation;

import java.util.Arrays;

public class BIT_04_CountingBits {
	
	static int[] counter(int n) {
		int[] arr = new int[n + 1];		// (n + 1) because 0 to n
		for (int i = 1 ; i <= n ; i++) arr[i] = arr[i >> 1] + (i & 1);	// Remember this
		return arr;
	}	

	public static void main(String[] args) {
		
		int n = 10;		
		System.out.println(Arrays.toString(counter(n)));

	}

}