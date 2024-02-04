package Test;

public class TestTest {

	public static void main(String[] args) {
		int[] arr = { -2, -5, 6, -2, -3, 7, 2, 1, 5, -6 };
		SubarrayWithSum(arr);
	}

	static void SubarrayWithSum(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			int sum = 0;

			System.out.println("-----------------");

			for (int j = i; j < nums.length; j++) {

				sum = sum + nums[j];

				System.out.println(sum);

				if (sum == 10) {

					System.out.println("Values: " + i + " " + j);

					sum = 0;

				}

				if (j == nums.length - 1)
					sum = 0;

			}

		}

	}

}
