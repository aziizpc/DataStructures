// LC - 118

package Striver_Array;

import java.util.ArrayList;
import java.util.List;

public class ARR_31_PascalsTriangle {
	
	public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> masterList = new ArrayList<List<Integer>>();

        int i = 0;

        while (i != numRows){								// Calling the function for all i < numRows
            masterList.add(getPascal(i));
            i++;
        }
    
        return masterList;
    }

    public static List<Integer> getPascal(int rowIndex) {	// Main function

        List<Integer> ls = new ArrayList<>();				// Output list (Row by row)

        long val = 1;										// Initiate val as long with value 1

        ls.add((int) val);									// Add that to the list	(All row starts with 1)

        for (int i = 1; i <= rowIndex; i++) {				// For loop (Note: First row has 1 element & so on)
        	val = (val * (rowIndex - i + 1)) / i;			// Memorize this equation !!!
            ls.add((int) val);								// Add each val to to the list
        }

        return ls;											// Return the list
    }

	public static void main(String[] args) {
		
		int numRows = 6;
		
		System.out.println(generate(numRows));

	}

}