// LC - 1727
// https://www.youtube.com/watch?v=odAv92zWKqs
// Very easy and tricky

package MyLC_Arrays;

import java.util.Arrays;

public class AML_16_LargestSubmatrixWithRearrangements {
	
	static int largestSubmatrix(int[][] arr) {
		
		int m = arr.length;
		int n = arr[0].length;
		
		for (int i = 1 ; i < m ; i++) {				// NOTE: From i = 1 (That is ONLY required)
			for (int j = 0 ; j < n ; j++) {
				if (arr[i][j] == 1) {				// Only if current value is 1
					arr[i][j] += arr[i - 1][j];		// Get sum based on value from previous
				}				
			}
		}
		
		for (int i = 0 ; i < m ; i++) {				// Sort individual arrays
			Arrays.sort(arr[i]);
		}
		
		int height = 0;
		int width = 0;
		int ans = Integer.MIN_VALUE;
		
		for (int i = 0 ; i < m ; i++) {
			for (int j = 0 ; j < n ; j++) {
				height = arr[i][j];			// Current value
				width = n - j;				// NOTE --> width starts from n. (n, n-1, n-2, n-3,...)
				int temp = height * width;	// Product
				ans = Math.max(ans, temp);
			}
		}
		
		return ans;
		
	}	

	public static void main(String[] args) {
		
		int[][] arr = {{0,0,1},{1,1,1},{1,0,1}};
		
		System.out.println(largestSubmatrix(arr));

	}

}