package SDETConcepts;

interface Animal {				// Interface
	void makeSound();
}

public class SDETC_011_ObjectOfInterface {
	public static void main(String[] args) {
		// Anonymous inner class implementing the interface
		Animal obj = new Animal() {
			@Override
			public void makeSound() {
				System.out.println("Animal Sound");
			}
		};
		
		obj.makeSound(); // Output: Animal Sound
	}
}