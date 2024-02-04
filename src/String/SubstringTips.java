package String;

public class SubstringTips {

	public static void main(String[] args) {

		String str = "Hello World";
		
		int n = str.length();
		
		String substr1 = str.substring(6); // Output: World
		String substr2 = str.substring(1, 5); // Output: ello
		
		
		String substr3 = str.substring(n); // Gives empty string (Important)
		
		System.out.println(substr1 + " --- " + substr2 + " --- " + substr3);

	}

}
