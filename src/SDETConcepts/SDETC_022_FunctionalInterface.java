package SDETConcepts;

@FunctionalInterface
public interface SDETC_022_FunctionalInterface {
	
	// Abstract method for calculation
    int calculate(int a, int b);

    // Static method for addition
    static int add(int a, int b) {
        return a + b;
    }

    // Default method for subtraction
    default int subtract(int a, int b) {
        return a - b;
    }

}

class MathOperationImpl {
    public static void main(String[] args) {
        // Using a Lambda Expression to define the calculate method for multiplication
    	SDETC_022_FunctionalInterface multiply = (a, b) -> a * b;
        int multiplicationResult = multiply.calculate(4, 7);

        // Using the static method
        int additionResult = SDETC_022_FunctionalInterface.add(5, 3);

        // Using the default method
        SDETC_022_FunctionalInterface subtractionOperation = (a, b) -> 0; // Placeholder lambda
        int subtractionResult = subtractionOperation.subtract(9, 4);

        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
    }
}