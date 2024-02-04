package String;

public class SubstringWithoutBuiltInFunction {

	public static void main(String[] args) {

		String s = "Hello Azeez P C !!!";
		StringBuilder newStr = new StringBuilder();
		int startFrom = 2, endBefore = 10;
		for (int i = startFrom; i < endBefore; i++) {
			newStr.append(s.charAt(i));
		}
		System.out.println(newStr);
	}

}