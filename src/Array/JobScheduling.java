package Array;

public class JobScheduling {

	public static void main(String[] args) {
		int[] start = { 1, 3, 4, 6, 8, 9, 9 };
		int[] finish = { 3, 5, 6, 8, 122, 10, 10 };
		int n = start.length;
		int[] processor = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			int j;
			for (j = 0; j < count; j++) {
				if (finish[processor[j]] <= start[i]) {
					processor[j] = i;
					break;
				}
			}
			if (j == count) {
				processor[count++] = i;
			}
		}
		System.out.println("Minimum number of processors required: " + count);
	}
}