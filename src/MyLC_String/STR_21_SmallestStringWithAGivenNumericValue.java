// LC - 1663
// 100% self

package MyLC_String;

public class STR_21_SmallestStringWithAGivenNumericValue {
	
	/*
	 * 	Input: n = 5, k = 73

		4 * 26 > 73 : a 72
		3 * 26 > 72 : a 71
		2 * 26 < 71 : z 45
		1 * 26 < 45 : z 19
		------------------
		19th character: s

		---------------------------------

		Input: n = 3, k = 27

		2 * 26 > 27 : a 26
		1 * 26 = 26 : a 25
		------------------
		25th character: y

	 */

	public static String getSmallestString(int n, int k) {

		StringBuilder sb = new StringBuilder();		// StringBuilder for answer

		int point = 0;								// Index to insert the character after 'a' (THINK)

		for (int i = (n - 1); i >= 1; i--) {		// See above logic in comment
			if (i * 26 >= k) {
				sb.append('a');
				k--;
				point++;
			} else {
				sb.append('z');
				k -= 26;
			}
		}

		sb.insert(point, (char) ('a' + k - 1));		// Insert the character @ point

		return sb.toString();

	}

	public static void main(String[] args) {
		
		int n = 5;
		int k = 73;		
		System.out.println(getSmallestString(n, k));
		
		n = 3;
		k = 27;
		System.out.println(getSmallestString(n, k));
			
		
	}

}
