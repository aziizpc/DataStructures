package String;

public class LargestStringWithRepeatingCharacters {

	public static void main(String[] args) {
		
		int end = 0;

		String s = "babdfghccddddddddddbdarfwesacd";

		int ans = 1, temp = 1;

		for (int i = 1; i < s.length(); i++) {

			char c = s.charAt(i);

			char d = s.charAt(i - 1);

			if (c == d) {
				
				end = i;

				temp++;

			}

			else {

				ans = Math.max(ans, temp);

				temp = 1;

			}

		}

		System.out.println(ans + " " + end);
		
		String output = s.substring(end - ans + 1, end + 1);
		
		System.out.println(output);

	}

}