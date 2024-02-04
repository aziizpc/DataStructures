package Hackerrank;

import java.util.*;

public class BigInteger_Prime {
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
		}	
	}
}