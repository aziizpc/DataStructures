package Hackerrank;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class IPAddressRegex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			boolean result = isValidIPAddress(s);
			System.out.println(result);
		}
	}

	public static boolean isValidIPAddress(String ip) {

		// Regex for digit from 0 to 255.
		String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";

		// Regex for a digit from 0 to 255 and
		// followed by a dot, repeat 4 times.
		// this is the regex to validate an IP address.
		String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the IP address is empty
		// return false
		if (ip == null) {
			return false;
		}

		// Pattern class contains matcher() method
		// to find matching between given IP address
		// and regular expression.
		Matcher m = p.matcher(ip);

		// Return if the IP address
		// matched the ReGex
		return m.matches();
	}
}

/**
 * 
 * 	000.12.12.034
	121.234.12.12
	23.45.12.56
	00.12.123.123123.123
	122.23
	Hello.IP
 * 
 * 
 */


