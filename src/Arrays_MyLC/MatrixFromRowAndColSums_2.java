// LC 1605

package Arrays_MyLC;

import java.util.Arrays;

public class MatrixFromRowAndColSums_2 {

	public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {

		int i = 0, j = 0;
		int m = rowSum.length, n = colSum.length;

		int[][] ans = new int[m][n];

		while (i < m && j < n) {
			int minValue = Math.min(rowSum[i], colSum[j]);

			ans[i][j] = minValue;

			rowSum[i] -= minValue;
			colSum[j] -= minValue;

			if (rowSum[i] == 0)
				i++;
			if (colSum[j] == 0)
				j++;

		}

		return ans;

	}

	public static void main(String[] args) {

		int[] rowSum = { 5, 7, 10 };
		int[] colSum = { 8, 6, 8 };

		System.out.print(Arrays.deepToString(restoreMatrix(rowSum, colSum)));

	}

}

/**
 * 
 * rowSum = [5,7,10], colSum = [8,6,8]
 * 
 * (0,0)
 * 
 * Min = 5
 * 
 * 5
 * 
 * --------------
 * 
 * rowSum = [0,7,10], colSum = [3,6,8]
 * 
 * (1,0)
 * 
 * Min (7, 3) = 3
 * 
 * 5
 * 3
 * 
 * ------------------
 * 
 * rowSum = [0,4,10], colSum = [0,6,8]
 * 
 * (1,1)
 * 
 * Min (4,6) = 4
 * 
 * 5
 * 3 4
 * 
 * ------------------
 * 
 * rowSum = [0,0,10], colSum = [0,2,8]
 * 
 * (2,1)
 * 
 * Min (10,2) = 2
 * 
 * 5
 * 3 4
 * 0 2
 * 
 * ------------------
 * 
 * rowSum = [0,0,8], colSum = [0,0,8]
 * 
 * (2,2)
 * 
 * Min (8,8) = 8
 * 
 * 5
 * 3 4
 * 0 2 8
 * 
 **/