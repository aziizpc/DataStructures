// Self

package String;

public class LargestStringWithNoRepeatingCharacters {

	public static void main(String[] args) {

		String s = "babdfghcfcfbdarwesacd";

		char[] sArr = s.toCharArray();

		String op = "";

		String ans = "";

		int max = 0, temp = 0;

		for (int j = 0; j < sArr.length; j++) {

			for (int i = 0; i < sArr.length; i++) {

				if (!op.contains(sArr[i] + "")) {

					op = op + sArr[i];

					temp++;

				}

				else {

					int len = op.length();

					if (ans.length() < op.length()) {

						ans = op;

					}

					op = "";

					max = Math.max(max, temp);

					temp = 0;

				}

			}
		}

		if (ans.length() < op.length()) {

			ans = op;

		}

		max = Math.max(max, temp);

		System.out.println(max);

		System.out.println(ans);
	}

}