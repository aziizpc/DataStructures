// LC - 405
// Self

package MyLC_BitManipulation;

public class BMC_04_DecimalToHexa {
	
	static String toHexa(int num) {
		
		char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
		
		StringBuilder sb = new StringBuilder(); 
		
		while (num != 0) {
			sb.insert(0, map[(num & 15)]);
			num >>= 4;
		}
		
		return sb.toString();
		
		/*
		 * 26:
		 * 
		 * 11010 : 0001 1010 => 1a 
		 * 
		 */
		
	}

	public static void main(String[] args) {
		
		int num = 26;		
		System.out.println(toHexa(num));
		
		num = 54;
		System.out.println(toHexa(num));

	}

}