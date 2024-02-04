package String;

public class PrintYourName1000Times {

	public static void main(String[] args) {

		String myName = "Azeez";
		
		String s = "i";
		
		s = s.replace("i", "iiiiiiiiii"); // 10
		s = s.replace("i", "iiiiiiiiii"); // 100
		s = s.replace("i", "iiiiiiiiii"); // 1000
		
		s = s.replace("i", "Azeez\n");
		
		System.out.println(s);

	}

}
