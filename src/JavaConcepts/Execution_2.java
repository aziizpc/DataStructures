package JavaConcepts;

public class Execution_2 {
	
	public void myMethod(int[] arr) {		
		System.out.println("Array method executed!");		
	}
	
	public void myMethod(double... d) {		
		System.out.println("Double method executed!");		
	}

//	public void myMethod(int... d) {				// This method is NOT accepted as already int[] present.
//		System.out.println("Int method executed!");		
//	}
	
	public static void main(String[] args) {

		Execution_2 obj = new Execution_2();
		
		obj.myMethod(1, 2, 3, 90, 67, 500);

	}

}