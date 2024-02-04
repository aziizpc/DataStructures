package Test;

import java.util.ArrayList;
import java.util.List;

public class TestScope {
	public static int getSum(int index, int len, int[] arr, List<Integer> myList, int target, int ans, int calc) {
		if (index == len) {
			System.out.println("--------");
			int temp = 0;
			if (myList.size() == 3) {
				for (int i = 0; i < myList.size(); i++) {
					System.out.println("GET: " + myList.get(i));
					temp = temp + myList.get(i);
				}
				System.out.println("TEMP: " + temp);
				System.out.println("Old ans: " + ans);
				System.out.println("Old calc: " + calc);
				// Math.min(Math.abs(target - temp), calc);
				if (Math.abs(target - temp) < (calc)) {
					calc = Math.abs(target - temp);
					System.out.println("calc: " + calc);
					ans = temp;
				}
				System.out.println("ans: " + ans);
			}
			return ans;
		}

		myList.add(arr[index]);
		getSum(index + 1, len, arr, myList, target, ans, calc);
		myList.remove(myList.size() - 1);
		getSum(index + 1, len, arr, myList, target, ans, calc);

		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { -1, 2, 1, -4 };
		int target = 1;
		int index = 0;
		int len = nums.length;
		List<Integer> myList = new ArrayList<Integer>();
		int ans = Integer.MAX_VALUE;
		int calc = Integer.MAX_VALUE;

		ans = getSum(index, len, nums, myList, target, ans, calc);

		System.out.println(ans);
	}

}