// LC - 42
// Hard and 100% SELF CODED :)

package MyLC_Sahil;

public class SL_TrappingRainWater {
	
	public static int trap(int[] height) {
		
		/*
		 * 	Here we want to find trapping water

			=> left and right end there is no wall
			=> at any point we store water is :
			water[i] = min (max_left_height,max_right_height) - arr[i];

			to store left height and right max height any given point we can use two array.
			so space would be O(n) and time would be O(n)
		 */

        int n = height.length;
        int[] maxLeft = new int[n];
        int[] maxRight = new int[n];

        int curMax = height[0];							
        for (int i = 0 ; i < n ; i++){					// Building the maxLeft array
            if (height[i] > curMax) curMax = height[i];
            maxLeft[i] = curMax;
        }
        
        curMax = height[n - 1];
        for (int i = (n - 1) ; i >= 0 ; i--){			// Building the maxRight array
            if (height[i] > curMax) curMax = height[i];
            maxRight[i] = curMax;
        }

        int ans = 0;									// For the final answer

        int start = 0;
        for (int i = 0 ; i < n ; i++){					// To find the first left side non 0 value
            if (height[i] > 0) {
                start = i;
                break;
            }
        }

        int end = (n - 1);
        for (int i = (n - 1) ; i >= 0 ; i--){			// To find the first right side non 0 value
            if (height[i] > 0) {
                end = i;
                break;
            }
        }

        for (int i = start ; i <= end ; i++){
            ans += Math.min(maxLeft[i], maxRight[i]) - height[i];	// THE CORE!!
        }

        return ans;

    }

	public static void main(String[] args) {
		
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		System.out.println(trap(height));

	}

}