package Striver_BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class BIT_09_PowerSet {
	
	public static List<List<Integer>> getPowerSet(int[] arr){
		
		int n = arr.length;										// Array length
		
		int numberOfSubsets = 1 << n;							// This is a STANDARD EQUATION for # of Subsets
																// Faster than Math.pow(2, n)
		
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		
		for (int num = 0 ; num < numberOfSubsets ; num++) {		// If 3 in arr => 2 power 3 => 0 to 7
			
			List<Integer> temp = new ArrayList<Integer>();
			
			for (int i = 0 ; i < n ; i++) {						// Loop the entire array
				
				if ((num & (1 << i)) != 0) {					// Equation to CHECK IF ITH BIT IS SET IN NUM
					temp.add(arr[i]);							// If YES -> ADD (Check 10th program)
				}
				
			}
			
			ans.add(temp);
			
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3};		
		System.out.println(getPowerSet(arr));
		
		arr = new int[] {4, 9, 7, 3};		
		System.out.println(getPowerSet(arr));
		
	}
	
	/*
	 * HOW THE FOR LOOP WORKS:
	   N 000

		000
		001	= 0

		000
		010	= 0

		000
		100	= 0

		------------------------

		N 001

		001
		001	= 1	= 1

		001
		010	= 0

		001
		100	= 0

		------------------------

		N 010

		010
		001	= 0

		010
		010	= 1	= 2

		010
		100	= 0

		------------------------

		N 100

		100
		001	= 0

		100
		010	= 0

		100
		100	= 1	= 3

		------------------------

		N 101

		101	= 1	= 1
		001

		101
		010	= 0

		101
		100	= 1	= 3

		------------------------

		N 110

		110
		001	= 0

		110
		010	= 1	= 2

		110
		100	= 1	= 3

		------------------------

		N 111

		111
		001	= 1	= 1

		111
		010	= 1	= 2

		111
		100	= 1	= 3
	 */

}