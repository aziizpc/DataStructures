// Exception

package JavaConcepts;

public class Execution_4 {

	public static void main(String[] args) {

		try {
			System.out.println("Hello everyone!");
			int c = 10 / 0;
			System.out.println("What's up?");
		} catch (Exception e) {
			System.out.println("I'm caught :(");
		} finally {
			System.out.println("How are you?");
			System.out.println("Where are you now?");
		}
		System.out.println("Please like :)");
		System.out.println("Please subscribe :)");
	}

}