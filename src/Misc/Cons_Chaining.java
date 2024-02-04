package Misc;

public class Cons_Chaining extends TestSubject {

	public Cons_Chaining() {
		this(10); // Calling same class constructor
	}

	public Cons_Chaining(int i) {
		super(i); // Calling super class constructor
	}

	public static void main(String[] args) {
		Cons_Chaining ch = new Cons_Chaining();
	}
}

class TestSubject {

	public TestSubject(int i) {
		System.out.println("Super Class Constructor");
	}

}