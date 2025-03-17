package SDETConcepts;

class Parent19 {
    public static void main(String[] args) {
        System.out.println("Parent's main method");
    }
}

class Child19 extends Parent19 {
    public static void main(String[] args) {
        System.out.println("Child's main method");
    }
}

public class SDETC_019_HidingMainMethod {
	
	public static void main(String[] args) {
        // Calling the main method of the parent class directly
        Parent19.main(args); // Output: Parent's main method

        // Calling the main method of the child class directly
        Child19.main(args);  // Output: Child's main method	(MADE THIS DEFAULT IN IDE)
    }

}