package JavaConcepts;

public class BooleanExamples {

	public static void main(String[] args) {

		Boolean b1 = new Boolean("true");	// true
		Boolean b2 = new Boolean(true);		// true
		System.out.println(b1.equals(b2));
		
		System.out.println("--------------------------------------");
		
		Boolean b3 = new Boolean("true");
		Boolean b4 = new Boolean("TrUe");
		System.out.println(b3.equals(b4));
		
		System.out.println("--------------------------------------");
		
		Boolean b5 = new Boolean("Hey");	// false	(Apart from true, whatever we store will be false)
		Boolean b6 = new Boolean("Bye");	// false
		System.out.println(b5.equals(b6));
		
		System.out.println("--------------------------------------");

	}

}
