// LC 1539 --> Very tricky question

package Array;

public class KthMissingPositiveNumber {

	public static void main(String[] args) {

		int[] arr = {2,3,4,7,11};	// 1 5 6 8 9
		int k = 5;
		
		int ans = findKthPositive(arr, k);
		
		System.out.println(ans);

	}
	
	public static int findKthPositive(int[] arr, int k) {
        for(int i : arr){
			if(i <= k) k++; else break;
		}
        return k;
    }

}