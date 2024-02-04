package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubarray_KSumArrays {

	public static void main(String[] args) {

		//int[] arr = { 4, 2, 2, 6, 4 };
		//int k = 0; // Sum that we want
		
		int[] arr = { 56, -1, 0, -3, 2, 0, 0, 2, -78, 100, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
		int k = 0; // Sum that we want
		
		longestSubarray(arr, k);

	}

	public static int longestSubarray(int[] arr, int k) {

		List<Integer> myList = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>(); 

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {			
			
			sum = sum + arr[i];			

			if (sum == k) {				
				myList.clear();
				int end = i;
				while (end >= 0) {
					myList.add(arr[end]);
					end--;
				}			
				ans.add(myList);
			}
			
			else {
				if (myMap.containsKey(sum - k)) {
					myList.clear();
					int start = myMap.get(sum - k) + 1;
					while (start <= i) {
						myList.add(arr[start]);
						start++;
					}
					ans.add(new ArrayList<Integer> (myList));
				}
				
				else {
					myMap.put(sum, i);
				}
			}

		}
		
		System.out.println("Size of the list: " + ans.size());
		
		System.out.println("\n" + ans);

		return ans.size();
	}

}
