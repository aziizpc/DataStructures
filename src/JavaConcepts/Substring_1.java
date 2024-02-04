package JavaConcepts;

public class Substring_1 {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = str1.substring(2);
		System.out.println(str2);
		System.out.println(str1 == str2);
		
		System.out.println("-----------------------");
		
		String str3 = "Hello";
		String str4 = str1.substring(0);	// As the String is same as str3, no separate is created.
		System.out.println(str3);
		System.out.println(str3 == str4);
		
		System.out.println("-----------------------");
		
		String str5 = "Hello";
		String str6 = new String(str5.substring(0));	// Note
		System.out.println(str5);
		System.out.println(str5 == str6);
		
		System.out.println("-----------------------");		

	}

}