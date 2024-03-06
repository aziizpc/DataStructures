package MyLC_Arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class AML_1_SortMatrixDiagonally {

	public static int[][] diagonalSort(int[][] mat) {

		int m = mat.length;
		int n = mat[0].length;

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		boolean[][] flag = new boolean[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (flag[i][j] == false) {
					loadQueue(mat, i, j, pq);
					unloadQueue(mat, i, j, pq, flag);
				}
			}
		}

		return mat;
	}

	public static void loadQueue(int[][] mat, int i, int j, PriorityQueue<Integer> pq) {
		if (i >= mat.length || j >= mat[0].length) {
			return;
		}
		pq.add(mat[i][j]);
		loadQueue(mat, ++i, ++j, pq);
	}

	public static void unloadQueue(int[][] mat, int i, int j, PriorityQueue<Integer> pq, boolean[][] flag) {
		if (i >= mat.length || j >= mat[0].length) {
			return;
		}
		mat[i][j] = pq.poll();
		flag[i][j] = true;
		unloadQueue(mat, ++i, ++j, pq, flag);
	}

	public static void main(String[] args) {
		int[][] mat = { { 3, 3, 1, 1 }, { 2, 2, 1, 2 }, { 1, 1, 1, 2 } };
		
		System.out.println(Arrays.deepToString(diagonalSort(mat)));

	}

}