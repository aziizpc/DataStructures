// Pos Neg Pos Neg

package Striver_Array;

import java.util.Arrays;

public class ARR_19_RearrangeArrayElementsBySign {
	
	public static int[] rearrangeElements(int[] arr) {
		
		int n = arr.length;		
		int[] ans = new int[n];		
		int positivePosition = 0;		
		int negativePosition = 1;		
		int pos = 0;
		
		while (positivePosition < n || negativePosition < n) {
			if (arr[pos] >= 0) {
				ans[positivePosition] = arr[pos];
				positivePosition += 2;
			}
			else {
				ans[negativePosition] = arr[pos];
				negativePosition += 2;
			}
			pos++;			
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {3,1,-2,-5,2,-4};
		
		int[] ans = rearrangeElements(arr);
		
		System.out.println(Arrays.toString(ans));

	}

}