package Striver_Array;

public class ARR_9_MaximumConsecutiveOnes {

	public static int getCount(int[] arr) {

		int ans = 0;
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				ans = Math.max(ans, temp);
				temp = 0;
			} else {
				temp++;
			}
		}
		
		ans = Math.max(ans, temp);
		
		return ans;
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 1, 0, 1, 1, 1, 0, 1, 1 }; // OP: 3
		System.out.println(getCount(arr));
		
		arr = new int[] { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1 }; // OP: 3
		System.out.println(getCount(arr));
	}

}