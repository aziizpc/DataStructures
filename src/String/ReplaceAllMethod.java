package String;

public class ReplaceAllMethod {	// Replacing square bracket, space, FIRST comma only

	public static void main(String[] args) {

		String s = ",[1, 2    , 3]";
		
		System.out.println(s = s.replaceAll("\\[|\\]|\\s", "").replaceAll("^,", ""));
			

	}

}
