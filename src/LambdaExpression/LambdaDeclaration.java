package LambdaExpression;

public class LambdaDeclaration {

	public static void main(String[] args) {

		WebPage w1 = new WebPage() { // This is not function. But, Anonymous Inner Type.

			@Override
			public void header(String value) {
				System.out.println("Hiii " + value);
			}
		};
		
		WebPage w2 = new WebPage() { // This is not function. But, Anonymous Inner Type.

			@Override
			public void header(String value) {
				System.out.println("Hello " + value);
			}
		};
		
		w1.header("Google :)");
		w2.header("Facebook :)");
		
		WebPage w3 = (n) -> System.out.println(n);	// Writing the same as above using Lambda.		
		w3.header("Azeez :)");
		
	}

}