// LC - 791

package MyLC_String;

public class STR_17_CustomSortString {

	public static String customSortString(String order, String s) {
		StringBuilder sb = new StringBuilder();

		int[] arr = new int[26];

		for (char c : s.toCharArray()) {
			arr[c - 'a']++;
		}

		for (int i = 0; i < order.length(); i++) { // For the characters available in 'order'
			char c = order.charAt(i);
			int pos = c - 'a'; // NOTE!!
			while (arr[pos] != 0) { // while (and not if) because there could be duplicate characters in 's'. We
									// need to append that as well.
				sb.append(c);
				arr[pos]--;
			}
		}

		for (int i = 0; i < 26; i++) { // For the left out characters
			while (arr[i] != 0) {
				sb.append((char) (i + 'a')); // NOTE: (i + 'a') and not (arr[i] + 'a'). arr[i] stores 'count'.
				arr[i]--;
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		String order = "cba"; // Order

		String s = "azbcccd"; // Sample string

		System.out.println(customSortString(order, s));

	}

}