package SDETSheet;

/*
 * To efficiently search for a given target in a sorted 𝑚×𝑛 matrix where each row and column 
 * are sorted, we can use the "staircase search" method.
 * The idea is to start from the top-right corner and adjust our search direction based on the
 * target's value compared to the current element.
 * 
 * Time Complexity: O(m+n), where m is the number of rows and n is the number of columns.
 * Space Complexity: O(1), as we are not using any extra space.
 */

public class SDET_001_StaircaseSearch {

	public static boolean searchMatrix(int[][] matrix, int target) {
		
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}

		int rows = matrix.length;
		int cols = matrix[0].length;

		// Start from the top-right corner
		int row = 0;
		int col = cols - 1;

		while (row < rows && col >= 0) {
			if (matrix[row][col] == target) {
				System.out.println("Row#: " + row + "; Col#: " + col);
				return true; 							// Found the target
			} else if (matrix[row][col] > target) {
				col--; 									// Move left
			} else {
				row++; 									// Move down
			}
		}

		return false; 									// Target not found
	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 4, 7, 11 }, { 2, 5, 8, 12 }, { 3, 6, 9, 16 }, { 10, 13, 14, 17 } };
		int target = 5;

		System.out.println(searchMatrix(matrix, target)); // Output: true
	}

}