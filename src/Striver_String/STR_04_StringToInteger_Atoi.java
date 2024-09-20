// LC - 8

package Striver_String;

public class STR_04_StringToInteger_Atoi {
	
	public static int myAtoi(String s) {
		
		if (s.length() == 0) return 0;
		
		char[] arr = s.toCharArray();
		int n = arr.length;		
		int index = 0;
		int current = arr[index];
		int sign = 0;
		long ans = 0;							// The answer variable is 'long'. Why? -> Because we need to 
												// check if ans is going beyond int and if so return MIN or MAX
												// value of integer
		
		// Step 1: Remove all the whitespace:		
		while (current == ' ') {				// Start with 'while'
			index++;
			if (index == n) return 0;			// index = n => Reached end of string => Return 0
			current = arr[index];
		}
		
		// Step 2: Capture the sign (If there is any; else mark as positive)
		if (current == '-') {
			sign = -1;
			if (index < (n - 1)) index++;		// If current is NOT the last element, move forward
		}
		
		else {
			sign = 1;							// By default, we mark as positive (If there is no '-')
			if (current == '+') {				// If '+' is there
				if (index < (n - 1)) index++;	// and if it's not the last element, move forward
			}
		}
		
		// Step 3: Process the remaining portion of the string
		for ( ; index < n ; index++) {			// Initial condition already met
			char value = arr[index];
			if (Character.isDigit(value)) {		// If Digit
				ans = ans * 10;					
				ans += (value - '0');			// Append
			}
			else {
				return (int) (sign * ans);		// Note: We cast long to int and return
			}
			if (sign * ans <= Integer.MIN_VALUE) return Integer.MIN_VALUE;	// Case 1: More bits than int (neg)
			if (sign * ans >= Integer.MAX_VALUE) return Integer.MAX_VALUE;	// Case 2: More bits than int (pos)
		}
		
		ans = sign * ans;						// Finally, return sign * ans as int
		return (int) ans;
		
	}

	public static void main(String[] args) {
		
		String s = "42";
		System.out.println(myAtoi(s));
		
		s = "     -42";
		System.out.println(myAtoi(s));
		
		s = "1337c0d3";
		System.out.println(myAtoi(s));
		
		s = "0-1";
		System.out.println(myAtoi(s));
		
		s = "words and 987";
		System.out.println(myAtoi(s));
		
		s = "hello123world!";
		System.out.println(myAtoi(s));

	}

}