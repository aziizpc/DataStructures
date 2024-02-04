// Multiple Exceptions in a single catch block

package JavaConcepts;

public class Execution_5 {

	public static void main(String[] args) {

		try {
			int c = 10 / 1;		// Try changing to 0 and see
			
			int[] count = new int[5];
			for (int i = 0 ; i <= 5 ; i++) {
				count[i] = i;				
			}
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {	// NOTE
			System.out.println(e);
		} 
		
	}

}