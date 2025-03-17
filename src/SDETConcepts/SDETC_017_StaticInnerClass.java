package SDETConcepts;

class Outer {

	static int y = 100;

	static void display() {
		System.out.println("Inner Class: x = " + Outer.Inner.x);
		System.out.println("Outer Class: y = " + y);
		
	}

	static class Inner {

		static int x = 10;

		static void display() {
			System.out.println("Inner Class: x = " + x);
			System.out.println("Outer Class: y = " + y);
		}
	}
}

public class SDETC_017_StaticInnerClass {
	public static void main(String[] args) {
		Outer.Inner obj1 = null;				// = null : display() is static method
		obj1.display();

		Outer obj2 = null;						// Since display() is static method
		obj2.display();
	}
}