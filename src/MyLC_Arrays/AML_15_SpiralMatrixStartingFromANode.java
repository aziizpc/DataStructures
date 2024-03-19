// LC - 885
// Solution: https://www.youtube.com/watch?v=0qep3f9cqVs
// Tricky Q

package MyLC_Arrays;

import java.util.Arrays;

public class AML_15_SpiralMatrixStartingFromANode {
	
	static int[][] generateMatrix(int R, int C, int r0, int c0){
		
		int[][] ans = new int[R * C][2];	// This will be the result matrix. Note the size.
		
		int i = 0;							// Required for looping purpose
		
		ans[i++] = new int[] {r0, c0};		// Insert the first pair and then increment i (i = 1)
		
		int[] direction = {0, 1, 0, -1, 0};	// See comments
		
		int d = 0;							// It's needed for getting required val from direction
		
		int len = 0;						// The length gets increased when r0 = 0 (Study chart)
											// 'len' required to maintain current lengths
											// Currently, it's zero as we are yet to start moves
		
		while (i < R * C) {
			if (d == 0 || d == 2) {			// Values in direction at 0 & 2 is 0 (We inc len here)
				len++;
			}
			
			for (int k = 0 ; k < len ; k++) {
				r0 += direction[d];				// Sum based on 'direction' value @ dth index
				c0 += direction[ d + 1];		// Sum based on 'direction' value @ (d + 1)th index
				
				if (r0 >= 0 && r0 < R && c0 >=0 && c0 < C) {// We need values ONLY within boundary
					ans[i++] = new int[] {r0, c0};			// Add to 'ans' at ith index
				}
			}
			
			d++;
			d = d % 4;	// d value should not be 3 || So that we get pairs from direction correctly
						// Can also be combined and written as --> d = ++d % 4;
						// As per the above lines, if d becomes 4 --> It goes back to 0 :)
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		
		int R = 5;
		int C = 6;
		
		int r0 = 1;
		int c0 = 4;
		
		System.out.println(Arrays.deepToString(generateMatrix(R, C, r0, c0)));
		

	}

}


/*

This will be the nodes in E -> S -> W -> N moves: (Study how r and c incs and decs with an example)

	         (-1,0)
        (0,-1)(0,0)(0,1)	==> {0, 1, 0, -1, 0}
              (1,0)

*/