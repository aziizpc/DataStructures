// Concat is stored as new String [concat --> Different]

// Append not (StringBuffer) [append --> Same]

package JavaConcepts;

public class StringAndStringBuffer {

	public static void main(String[] args) {

		String s1 = new String("Abdul ");

		String s2 = s1.concat("Azeez");	// concat

		int s1Code = s1.hashCode();

		int s2Code = s2.hashCode();

		System.out.println(s1Code + " " + s2Code); // Different
		
		System.out.println("-----------------------------------------------------");

		StringBuffer s3 = new StringBuffer("Abdul ");

		StringBuffer s4 = s3.append("Azeez"); // append

		int s3Code = s3.hashCode();

		int s4Code = s4.hashCode();

		System.out.println(s3Code + " " + s4Code); // Same

	}

}