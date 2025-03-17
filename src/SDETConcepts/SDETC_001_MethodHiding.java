package SDETConcepts;

class Parent1 {
	static void show() { 						// Static method
		System.out.println("Parent1's show()");
	}
}

class Child1 extends Parent1 {
	static void show() { 						// Hides Parent1's method
		System.out.println("Child1's show()");
	}
}

public class SDETC_001_MethodHiding {
	
	public static void main(String[] args) {
		Parent1 p = new Child1();
		p.show(); 								// Calls Parent1's show()

		Child1 c = new Child1();
		c.show(); 								// Calls Child1's show()
	}
}
