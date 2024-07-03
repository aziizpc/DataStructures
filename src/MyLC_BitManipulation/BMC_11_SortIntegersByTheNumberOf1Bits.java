// LC - 1356

package MyLC_BitManipulation;

import java.util.Arrays;

public class BMC_11_SortIntegersByTheNumberOf1Bits {
	
	public static int[] sortByBits(int[] arr) {

        for (int i = 0 ; i < arr.length ; i++){			// Update arr[i] including bitCount
            arr[i] += Integer.bitCount(arr[i]) * 10001;	// Multiply with 10001 as max length given is 10^4
        }

        Arrays.sort(arr);								// Sort it

        for (int i = 0 ; i < arr.length ; i++){			// Now reverse
            arr[i] = (arr[i] % 10001);					// Use % operator to get back the number :)  
        }

        return arr;

    }

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4,5,6,7,8};
		
		System.out.println(Arrays.toString(sortByBits(arr)));

	}

}