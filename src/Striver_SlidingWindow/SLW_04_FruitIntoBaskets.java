// LC - 904

package Striver_SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SLW_04_FruitIntoBaskets {
	
	public static int totalFruit(int[] fruits) {
		
		/* 
		 * 100% Self solved with Striver input :)
		 */

        int n = fruits.length;										
        int l = 0, r;												// Left and right pointers
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>(); // To insert the 2 numbers under consideration
        int maxLen = 0;												// Output variable
        int sum = 0;												// To store the current sum

        for (r = 0 ; r < n ; r++){									// Navigate the right pointer
            int key = fruits[r];									// Get the current value as 'key'
            while (hm.size() == 2 && (!hm.containsKey(key)) && (l < r)) {// When size = 2 (Max allowed) & 
            														// if it's new key. Also make sure l does not
            														// go beyond r when doing while loop
                    hm.put(fruits[l], hm.getOrDefault(fruits[l], 0) - 1);	// Decrement the value @ 'l' in hm
                    sum--;											// Decrement the current sum
                    if (hm.get(fruits[l]) == 0) hm.remove(fruits[l]);// value = 0 ==> Remove the key
                    l++;											// Navigate the left pointer forward
            }														// @ the end of while loop, hm size becomes 0												
            
            hm.put(key, hm.getOrDefault(key, 0) + 1);				// hm size = 0/1/2 -> Insert current (Always)
            sum++;													// Increment the current sum
            maxLen = Math.max(sum, maxLen);							// Find the max
        }

        return maxLen;

    }

	public static void main(String[] args) {
		
		int[] fruits = {1,2,1};		
		System.out.println(totalFruit(fruits));
		
		fruits = new int[] {0,1,2,2};
		System.out.println(totalFruit(fruits));

	}

}
