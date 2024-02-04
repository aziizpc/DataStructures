package String;

import java.util.Arrays;

public class SplitStringIntoEqual {

	public static void main(String[] args) {

		String s = "abcdefg";
		
		String[] array = s.split("(?<=\\G...)");	// ... => how many pieces?
		
		System.out.println(Arrays.toString(array));
		

	}

}
