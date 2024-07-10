// LC - 1423

package Striver_SlidingWindow;

public class SLW_01_MaximumPointsYouCanObtainFromCards {	// Max around edge problem
	
	public static int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;
        int leftSum = 0, rightSum = 0;					// Set vars for calculating left sum and right sum
        int maxSum = 0;									// Answer var

        for (int i = 0 ; i < k ; i++){					// For loop till kth index and add values to leftSum
            leftSum += cardPoints[i];
        }

        maxSum = leftSum;								// leftSum itself will be maxSum now. Think!

        int rightIndex = (n - 1);						// Variable for the right last index
        for (int i = k - 1 ; i >= 0 ; i--){				// For loop from kth index backwards
            leftSum -= cardPoints[i];					// Decrement the ith value from LEFTSUM
            rightSum += cardPoints[rightIndex];			// Increment the RIGHTSUM by rightIndex'th value
            rightIndex--;								// This has to be decremented
            int sum = leftSum + rightSum;				// The new sum
            maxSum = Math.max(maxSum, sum);				// Find which is the maximum
        }

        return maxSum;

    }

	public static void main(String[] args) {
		
		int[] cardPoints = {1,2,3,4,5,6,1};
		int k = 3;
		
		System.out.println(maxScore(cardPoints, k));

	}

}