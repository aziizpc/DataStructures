package SDETConcepts;

abstract class Animal1 {
	abstract void makeSound();
}

public class SDETC_012_ObjectOfAbstractClass {
	public static void main(String[] args) {
		// Anonymous inner class extending the abstract class
		Animal1 obj = new Animal1() {
			@Override
			void makeSound() {
				System.out.println("Abstract Animal Sound");
			}
		};
		
		obj.makeSound(); // Output: Abstract Animal Sound
	}
}