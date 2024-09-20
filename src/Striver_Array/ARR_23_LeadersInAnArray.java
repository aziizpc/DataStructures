package Striver_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARR_23_LeadersInAnArray {
	
	public static int[] getLeaders(int[] arr) {

		int min = Integer.MIN_VALUE;

		List<Integer> ans = new ArrayList<Integer>();

		for (int i = arr.length - 1; i >= 0; i--) {
			
			if (arr[i] > min) {
				ans.add(arr[i]);
			}
			
			min = Math.max(min, arr[i]);
		}
		
		return ans.stream().mapToInt(i -> i).toArray();

	}

	public static void main(String[] args) {
		
		int[] arr = { 10, 22, 12, 3, 0, 6 };		
		System.out.println(Arrays.toString(getLeaders(arr)));

	}

}