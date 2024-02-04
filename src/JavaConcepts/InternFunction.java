// All run-time operation stores value in Heap memory.

package JavaConcepts;

public class InternFunction {
	
	public static void main(String[] args) {
		
		String s1 = "Azeez";		// Stores in SCP
		
		String s2 = new String ("Azeez");	// Stores in Heap
		
		System.out.println(s1 == s2);	// false
		
		System.out.println("-------------------------------------------");
		
		String s3 = "Azeez";		// Stores in SCP
		
		String s4 = new String ("Azeez").intern();		// Points to SCP
		
		System.out.println(s3 == s4);	// true
		
		System.out.println("-------------------------------------------");
		
	}

}