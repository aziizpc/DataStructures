// LC - 861
// Just have a glance
// https://www.youtube.com/watch?v=8tcPTkVgJq8&pp=ygUMbGVldGNvZGUgODYx

package MyLC_Arrays;

public class AML_17_ScoreAfterFlippingMatrix {
	
	public static int matrixScore(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        for (int row = 0 ; row < m ; row++){	// Row loop
            if (grid[row][0] != 1){				// Get the rows with first element ZERO
                updateRow(grid, row);			// This method updates 0 to 1 and vice versa
            }
        }

        for (int col = 0 ; col < n ; col++){					// Column loop
            if (getCountOfOnesInColumns(grid, col) <= (m / 2)){ // Get the count of 1s in each column
                updateColumns(grid, col);						// Flip
            }
        }

        int ans = 0;									// Final answer

        for (int i = 0 ; i < m ; i++){					// Row loop
            StringBuilder sb = new StringBuilder();		// StringBuilder
            for (int j = 0 ; j < n ; j++){				// Column loop
                sb.append(Integer.valueOf(grid[i][j]));	// Append each cell vale to sb (Row-wise)
            }
            ans += Integer.valueOf(sb.toString(), 2);	// Convert Binary String (Base 2) to Integer
        }

        return ans;
        
    }

    static int[][] updateRow(int[][] grid, int row){ // This method updates 0 to 1 and vice versa
        for (int j = 0 ; j < grid[0].length ; j++){
            if (grid[row][j] == 0){
                grid[row][j] = 1;
            }
            else grid[row][j] = 0;
        }
        return grid;
    }

    static int getCountOfOnesInColumns(int[][] grid, int col){	// Get the count of 1s in each column	
        int count = 0;
        for (int i = 0 ; i < grid.length ; i++){
            if (grid[i][col] == 1){
                count++;
            }
        }
        return count;
    }

    static int[][] updateColumns(int[][] grid, int col){	// Flip method column-wise
        for (int i = 0 ; i < grid.length ; i++){
            if (grid[i][col] == 0){
                grid[i][col] = 1;
            }
            else grid[i][col] = 0;
        }
        return grid;
    }

	public static void main(String[] args) {

		int[][] grid = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
		
		System.out.println(matrixScore(grid));

	}

}