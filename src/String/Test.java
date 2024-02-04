package String;

public class Test {

	public static void main(String[] args) {

		String s = "cfbdarwes";

		String tempString = "";
		String finalString = "";

		int tempSize = 0;
		int finalSize = 0;

		char[] c = s.toCharArray();

	
			for (int j = 0; j < c.length; j++) {
				if (!tempString.contains(c[j] + "")) {
					tempString = tempString + c[j];
					tempSize++;
				} else {
					if (finalSize < tempSize) {
						finalSize = tempSize;
						finalString = tempString;
					}
					tempString = "";
					tempSize = 0;
				}

			}
		

		System.out.println(finalString);
	}

}
