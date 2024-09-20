package Freshworks;

import java.util.HashSet;
import java.util.Set;

public class FRW_02_ContainsDuplicate {
	
	public static boolean containsDuplicate(int[] nums) {
		
		Set<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0 ; i < nums.length ; i++) {
			int val = nums[i];
			if (hs.add(val) == false) {
				return true;
			}
		}
		
		return false;		
	}

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,1};
		System.out.println(containsDuplicate(nums));
		
		nums = new int[] {1,2,3,4};
		System.out.println(containsDuplicate(nums));

	}

}