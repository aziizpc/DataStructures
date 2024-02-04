// Self

package Misc;

public class Pattern_Alphabet3 {

	public static void main(String[] args) {

		int a = 65;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {				
				System.out.print(Character.toString(a) + " ");
				a++;
			}
			System.out.println("");
		}

	}

}