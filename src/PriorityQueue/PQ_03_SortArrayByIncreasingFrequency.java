// LC - 1636

package PriorityQueue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PQ_03_SortArrayByIncreasingFrequency {
	
	public static int[] frequencySort(int[] nums) {

        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int num : nums){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {		// Learn this
            int freqA = hm.get(a);
            int freqB = hm.get(b);
            if (freqA != freqB) {
                return Integer.compare(freqA, freqB);
            } else {
                return Integer.compare(b, a); 	// For same frequency, larger number first
            }
        });

        pq.addAll(hm.keySet());

        int k = 0;

        while (!pq.isEmpty()){					// pq.isEmpty() is something to check always
            int num = pq.poll();
            for (int i = 0 ; i < hm.get(num) ; i++){
                nums[k] = num;
                k++;
            }
        }

        return nums;
        
    }

	public static void main(String[] args) {
		
		int[] nums = {-1,1,-6,4,5,-6,1,4,1};
		System.out.println(Arrays.toString(frequencySort(nums)));

	}

}
