// LC - 2610

/*
 * 	1 <= nums.length <= 200
	1 <= nums[i] <= nums.length
 * 
 */

package MyLC_Arrays;

import java.util.ArrayList;
import java.util.List;

public class AML_18_ConvertArrayInTo2DArrayWithConditions {
	
	public static List<List<Integer>> findMatrix(int[] nums) {
		
		int[] freq = new int[nums.length + 1];						// nums[i] can have values between 1 & 200. 0 not there.
		
		List<List<Integer>> ans = new ArrayList<List<Integer>>();	// Output List<List<Integer>>
		
		// NOTE to remember: freq value starts from 0. Also, index of 'ans' starts from zero. Reason why this program is working.
		
		for (int num : nums) {										// Loop
			if (freq[num] == ans.size()) {							// If the frequency of num is == size of ans (Initially, size of ans is zero)
				ans.add(new ArrayList<>());							// We need to create a new ArrayList within ans
																	// as we cannot add the value in any of the existing ArrayLists
			}
			
			ans.get(freq[num]).add(num);							// Add the num to ans using freq as index
			freq[num]++;											// freq increased
			
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		
		int[] arr = {1,3,4,1,2,3,1};
		
		System.out.println(findMatrix(arr));

	}

}