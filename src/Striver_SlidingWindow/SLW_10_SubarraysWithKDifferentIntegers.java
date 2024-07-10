// LC - 11

package Striver_SlidingWindow;

public class SLW_10_SubarraysWithKDifferentIntegers {
	
	/*
	 * The normal approach that we follow is NOT applicable here because of the following reason:
	 * 1. Gives wrong result when the while loop -> while ((!hm.containsKey(val)) && hm.size() == k && (l < r))
	 * is used. For example:
	 * Consider the array: [1,2,1,2,3] and k = 2
	 * 1
	 * 1 2			Will be counted with the normal approach - > 1
	 * 1 2 1		Will be counted with the normal approach - > 2
	 * 1 2 1 2		Will be counted with the normal approach - > 3
	 * Removed @ 0 as it cannot insert 3 because of size restriction in while loop
	 * 2 1 2		Will be counted with the normal approach - > 4 (There will be check for size in while loop)
	 * Removed @ 0 as it still cannot insert 3 because of size restriction in while loop ('')
	 * 1 2			Will be counted with the normal approach - > 5
	 * 2			NA
	 * 2 3			Will be counted with the normal approach - > 6

	 * The one which will be missed if the normal method is followed
	 * 2 1 			This ideally should be included, but will be missed
	 * 
	 * So instead of giving the answer as 7, it gives 6.
	 */
	
	

	public static void main(String[] args) {
		
		

	}

}