package SDETSheet;

public class SDET_037_RemoveAllTheOccurrencesOfACharacter {

	public static String removeChar(String str, char ch) {

		char[] arr = str.toCharArray();
		int n = arr.length;
		int write = 0;

		for (int read = 0; read < n; read++) {
			if (arr[read] != ch) {
				arr[write++] = arr[read];
			}
		}

		return new String(arr, 0, write);

	}

	public static void main(String[] args) {
		String str = "aabacbaa";
		char ch = 'a';
		System.out.println(removeChar(str, ch)); // Output: "bcb"
	}

}