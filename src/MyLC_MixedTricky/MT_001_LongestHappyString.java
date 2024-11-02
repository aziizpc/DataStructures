// LC - 1405
// String

package MyLC_MixedTricky;

public class MT_001_LongestHappyString {
	
	public static String longestDiverseString(int a, int b, int c) {

        int total = (a + b + c);				// Sum of the max of three characters
        
        int current_a = 0;						// To keep track of 'a' towards the end (Current)
        int current_b = 0;						// To keep track of 'b' towards the end (Current)
        int current_c = 0;						// To keep track of 'c' towards the end (Current)

        StringBuilder sb = new StringBuilder();
        
        /* Logic :-
         * if a character count is greater than / equal to the other two AND if that character count is less than 2 (Last two positions):
         * OR
         * Any of the other two characters has current count = 2 & the current character count is greater than 0:
         * 		append that character to 'sb'
         * 		Decrement that character count
         * 		Increment that character current count
         * 		Set the other two character current count to 0 			
         *   
         */

        for (int i = 0 ; i < total ; i++){		// Loop from 0 to total
            if ((a >= b && a >= c && current_a < 2) || (current_b == 2 && a > 0) || (current_c == 2 && a > 0)){
                sb.append('a');
                a--;
                current_a++;
                current_b = 0;
                current_c = 0;
            }
            else if ((b >= a && b >= c && current_b < 2) || (current_a == 2 && b > 0) || (current_c == 2 && b > 0)){
                sb.append('b');
                b--;
                current_b++;
                current_a = 0;
                current_c = 0;
            }
            else if ((c >= a && c >= b && current_c < 2) || (current_a == 2 && c > 0) || (current_b == 2 && c > 0)){
                sb.append('c');
                c--;
                current_c++;
                current_a = 0;
                current_b = 0;
            }
        }

        return sb.toString();
        
    }

	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		int c = 7;
		
		System.out.println(longestDiverseString(a, b, c));

	}

}