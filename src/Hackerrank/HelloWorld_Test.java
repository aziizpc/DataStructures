package Hackerrank;

import java.io.*;
import java.util.*;

class HelloWorld_Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			String[] elements = s.split("//s");
			int size = Integer.parseInt(elements[0]);
			List<Integer> myList = new ArrayList<Integer>();
			for (int j = 1; j <= elements.length; i++) {
				myList.add(Integer.parseInt(elements[j]));
			}
			System.out.println(myList);
		}

	}
}