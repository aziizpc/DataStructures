package Striver_String;

import java.util.TreeMap;

public class STR_02A_IntegerToRoman {

	public final static TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

	static {
		tm.put(1000, "M");
		tm.put(900, "CM");

		tm.put(500, "D");
		tm.put(400, "CD");

		tm.put(100, "C");
		tm.put(90, "XC");

		tm.put(50, "L");
		tm.put(40, "XL");

		tm.put(10, "X");
		tm.put(9, "IX");

		tm.put(5, "V");
		tm.put(4, "IV");

		tm.put(1, "I");
	}

	public final static String toRoman(int number) {
		int k = tm.floorKey(number);

		if (number == k) {
			return tm.get(number);
		}

		return tm.get(k) + toRoman(number - k);
	}

	public static void main(String[] args) {

		int number = 5675;

		System.out.println(toRoman(number));

	}

}