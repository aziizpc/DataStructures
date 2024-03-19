// LC - 1903
// Full self

package MyLC_String;

public class STR_18_LargestOddNumberInString {
	
	public static String largestOddNumber(String num) {

        for (int i = num.length() - 1 ; i >= 0 ; i--){
            char c = num.charAt(i);
            int d = c - '0';
            if (d % 2 != 0){
                return num.substring(0, i + 1);
            }
        }

        return "";
        
    }

	public static void main(String[] args) {
		String num = "8646524";
		
		System.out.println(largestOddNumber(num));

	}

}