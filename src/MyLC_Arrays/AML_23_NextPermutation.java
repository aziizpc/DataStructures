// LC - 31

package MyLC_Arrays;

import java.util.Arrays;

public class AML_23_NextPermutation {
	
	public static void nextPermutation(int[] nums) {
		
		// Steps:
		// Find the LG pair -> Find the pivot -> Swap them -> Reverse from (L+1)th position

        int index1 = -1;
        int index2 = -1;

        for (int  i = nums.length - 2 ; i >= 0 ; i--){		// Find (ith, (i+1)th) pair which is Less, Greater
            if (nums[i] < nums[i + 1]){						// Find first such pair from RIGHT 
                index1 = i;									// Save the ith index as index1 and break
                break;
            }
        }

        if (index1 == -1){									// If no such pair, it means the number is strictly
            reverse(nums, 0);								// .. decreasing. E.g. 54321. Next is 12345.
        }													// Therefore, just reverse. (ANS)

        else {												// else ..
            for (int i = nums.length - 1 ; i >= 0 ; i--){	// We need to find the firstGREATER element from 
                if (nums[i] > nums[index1]){				// RIGHT which is greater than the number at index1.
                    index2 = i;								// Save the index as index2 and break.
                    break;
                }
            }
            
            swap(nums, index1, index2);						// Now, swap the number at index1 and index2
            reverse(nums, index1 + 1);						// Reverse the portion from (i+1) ... (end of array)
        }													// (ANS)
    }

    public static void swap(int[] nums, int i, int j){		// Swap function
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start){		// Function to reverse portion of array from 'start'
        int end = nums.length - 1;							// .. end of the array
        while (start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 2, 5, 3, 3, 0};
		
		nextPermutation(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}