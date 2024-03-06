// LC-1061

package MyLC_String;

public class STR_4_SmallestEquivalentString {

	public static String smallestEquivalentString(String s1, String s2, String baseStr) {

		int[] alpha = new int[26];

		for (int i = 0; i < 26; i++) {
			alpha[i] = i;
		}

		for (int i = 0; i < s1.length(); i++) {
			int c1 = s1.charAt(i) - 'a';
			int c2 = s2.charAt(i) - 'a';

			int cd1 = find(alpha, c1);
			int cd2 = find(alpha, c2);

			if (cd1 <= cd2) {		// As we want lexicographically smallest. if b <= c, we want only b.
				alpha[cd2] = cd1;
			} else {
				alpha[cd1] = cd2;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (char a : baseStr.toCharArray()) {
			char b = (char) (find(alpha, a - 'a') + 'a');
			sb.append(b);
		}

		return sb.toString();

	}

	public static int find(int[] alpha, int x) {
		if (alpha[x] == x) {
			return x;
		}
		return find(alpha, alpha[x]);
	}

	public static void main(String[] args) {
		String s1 = "leetcode";
		String s2 = "programs";
		String baseStr = "sourcecode";
		
		System.out.println(smallestEquivalentString(s1, s2, baseStr));

	}

}