// LC - 1395
// Very easy

package MyLC_Arrays;

public class AML_22_CountNumberOfTeams {
	
	/*
	 * Easy -> We need to get strictly increasing / decreasing triplets.
	 * Loop trough the array. Current element will be the middle element. Now, get count of lower in LHS 
	 * and higher in RHS. Multiply them. Now, get count of lower in RHS and higher in LHS. Multiple them.
	 * Add both to ans. Simple :)    
	 */ 
	
	public static int numTeams(int[] rating) {

        int n = rating.length;

        int ans = 0;

        for (int i = 0 ; i < n ; i++){
            int val = rating[i];
            int left_1 = 0;
            int right_1 = 0;
            int left_2 = 0;
            int right_2 = 0;
            for (int j = 0 ; j < i ; j++){
                if (rating[j] < val){
                    left_1++;
                }
                else if (rating[j] > val){
                    left_2++;
                }
            }
            for (int j = i + 1 ; j < n ; j++){
                if (rating[j] > val){
                    right_1++;
                }
                else if (rating[j] < val){
                    right_2++;
                }
            }
            ans += left_1 * right_1;
            ans += left_2 * right_2;
        }

        return ans;
        
    }

	public static void main(String[] args) {
		
		int[] arr = {2,5,3,4,1};
		System.out.println(numTeams(arr));

	}

}
