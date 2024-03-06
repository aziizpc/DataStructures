// LC 1314

package MyLC_Arrays;

import java.util.Arrays;

public class AML_3_MatrixBlockSum {

	public static int[][] matrixBlockSum(int[][] mat, int k) {

		int m = mat.length;
		int n = mat[0].length;

		int[][] ans = new int[m][n];

		int rowStart = 0, rowEnd = 0, colStart = 0, colEnd = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				rowStart = i - k;
				colStart = j - k;
				rowEnd = i + k;
				colEnd = j + k;

				if (rowStart < 0)
					rowStart = 0;
				if (rowEnd > m - 1)
					rowEnd = m - 1;

				if (colStart < 0)
					colStart = 0;
				if (colEnd > n - 1)
					colEnd = n - 1;

				ans[i][j] = getTheArrayElement(mat, rowStart, rowEnd, colStart, colEnd);
			}
		}

		return ans;

	}

	public static int getTheArrayElement(int[][] mat, int rowStart, int rowEnd, int colStart, int colEnd) {
		int num = 0;
		for (int i = rowStart; i <= rowEnd; i++) {
			for (int j = colStart; j <= colEnd; j++) {
				num += mat[i][j];
			}
		}
		return num;
	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		int k = 1;
		
		System.out.println(Arrays.deepToString(matrixBlockSum(arr, k)));

	}

}