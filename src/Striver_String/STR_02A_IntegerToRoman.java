package Striver_String;

import java.util.TreeMap;

public class STR_02A_IntegerToRoman {

	public final static TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

	static {						// static block: Static blocks are executed once when the class is loaded 
									// into memory, and because tm is static, the block ensures that the 
									// TreeMap is filled with values exactly once, regardless of how many 
									// objects of the class are created. (Note: TM --> TM)
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
	
	public final static String toRomanSingleMethod(int number) {
		
		TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>();	// Note: TM --> TM
		
		tm1.put(1000, "M");
		tm.put(900, "CM");

		tm1.put(500, "D");
		tm1.put(400, "CD");

		tm1.put(100, "C");
		tm1.put(90, "XC");

		tm1.put(50, "L");
		tm1.put(40, "XL");

		tm1.put(10, "X");
		tm1.put(9, "IX");

		tm1.put(5, "V");
		tm1.put(4, "IV");

		tm1.put(1, "I");
		
		int k = tm1.floorKey(number);

		if (number == k) {
			return tm1.get(number);
		}

		return tm1.get(k) + toRoman(number - k);
		
	}

	public static void main(String[] args) {

		int number = 5675;
		System.out.println(toRoman(number));
		System.out.println(toRomanSingleMethod(number));

	}

}