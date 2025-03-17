// LC - 1910

package SDETSheet;

public class SDET_044_RemoveAllOccurrencesofASubstring {

	public static String removeOccurrences(String s, String part) {

		StringBuilder sb = new StringBuilder(s);

		while (sb.indexOf(part) != -1) {
			int idx = sb.indexOf(part);
			sb.delete(idx, idx + part.length());
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		String s = "daabcbaabcbc";
		String part = "abc";
		System.out.println(removeOccurrences(s, part));

		s = "axxxxyyyyb";
		part = "xy";
		System.out.println(removeOccurrences(s, part));

	}

}