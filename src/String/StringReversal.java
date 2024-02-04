// Without converting to array

package String;

public class StringReversal {

	public static void main(String[] args) {

		String s = "hello world";

		StringBuilder sb = new StringBuilder(s);

		int len = s.length();

		for (int i = 0; i < len / 2; i++) {

			char c = s.charAt(i);
			char d = s.charAt(len - 1 - i);

			sb.deleteCharAt(i);
			sb.insert(i, d);

			sb.deleteCharAt(len - 1 - i);
			sb.insert(len - 1 - i, c);
		}

		System.out.println(sb.toString());
	}

}
