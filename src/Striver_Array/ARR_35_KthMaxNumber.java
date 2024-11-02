package Striver_Array;

import java.util.PriorityQueue;

public class ARR_35_KthMaxNumber {
	
	public static int findKthLargest(int[] nums, int k) {
		
        // Create a min-heap with capacity k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        // Iterate over the numbers
        for (int num : nums) {
        	
            // Add the number to the heap if size is less than k
            if (minHeap.size() < k) {
                minHeap.add(num);
            }
            
            // If num is larger than the root, replace root
            else if (num > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(num);
            }
        }
        
        // Root of heap is the K-th largest element
        return minHeap.peek();
    }

	public static void main(String[] args) {

		int[] nums = { 3, 2, 1, 8, 9, 5, 2, 0 }; 	// 0 1 2 2 3 5 8 9
		
		int k = 3;
		
		System.out.println(findKthLargest(nums, k));

	}

}