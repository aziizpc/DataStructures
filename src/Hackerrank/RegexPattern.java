package Hackerrank;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class RegexPattern {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		while (testCases > 0) {
			String pattern = in.nextLine();
			try {
				Pattern.compile(pattern);	// .compile
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
			testCases--;
		}
	}
}

/**
 * INPUT: 3 
 * ([A-Z])(.+)
 * [AZ[a-z](a-z)
 * batcatpat(nat
 **/