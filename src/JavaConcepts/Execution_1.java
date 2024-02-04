// Java backward compatibility

package JavaConcepts;

public class Execution_1 {
	
	void m1(int a, int b, int c) {		
		System.out.println("int a int b int c m1 method!");		
	}
	
	void m1(byte... b) {		
		System.out.println("byte b m1 method!");		
	}
	
	public static void main(String[] args) {

		Execution_1 obj = new Execution_1();
		
		byte b = 10;
		
		obj.m1(b, b, b);
		
		obj.m1(b, b, b, b);

	}
}