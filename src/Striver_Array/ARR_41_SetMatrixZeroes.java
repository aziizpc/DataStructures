package Striver_Array;

import java.util.Arrays;

public class ARR_41_SetMatrixZeroes {

	public static int[][] setZeroes(int[][] matrix) {

		int col0 = 1;							// Used for tracking what to put in COLUMN 0 elements
		int m = matrix.length;					// Row length
		int n = matrix[0].length;				// Column length

		for (int i = 0; i < m; i++) {			// All the rows
			for (int j = 0; j < n; j++) {		// All the columns
				if (matrix[i][j] == 0) {		// If the value is ZERO
					if (j != 0) {				// If the value is NOT AT COLUMN 0
						matrix[i][0] = 0;		// Set the corresponding COLUMN to 0
						matrix[0][j] = 0;		// Set the corresponding ROW to 0
					} else {
						col0 = 0;				// If the value is AT COLUMN 0 -> Update the variable col0 to 0
					}
				}
			}
		}

		for (int i = 1; i < m; i++) {						  	// Loop FROM FIRST ROW (Not ZERO)
			for (int j = 1; j < n; j++) {					  	// Loop FROM FIRST COLUMN (NOT Zero)
				if (matrix[0][j] == 0 || matrix[i][0] == 0) { 	// If the value @ corresponding ROW/COL is ZERO
					matrix[i][j] = 0;						  	// Set the VALUE to ZERO 
				}
			}
		}

																// Now, what is left is ROW0 and COL0
		
		if (matrix[0][0] == 0) {								// If the R0C0 value is 0
			for (int j = 0; j < n; j++)							// Set all the values in the R0 ROW to 0
				matrix[0][j] = 0;
		}

		if (col0 == 0) {										// If the COL0 value is 0
			for (int i = 0; i < m; i++)							// Set all the values in the C0 COLUMN to 0
				matrix[i][0] = 0;
		}

		return matrix;
		
	}

	public static void main(String[] args) {
		
		int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
		
		System.out.println(Arrays.deepToString(setZeroes(arr)));

	}

}