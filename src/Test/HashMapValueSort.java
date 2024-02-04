package Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMapValueSort {

	public static void main(String[] args) {

		Map<String, Integer> myMap = new HashMap<String, Integer>();
		myMap.put("Luke", 67);
		myMap.put("Shamir", 88);
		myMap.put("Sam", 33);
		myMap.put("Phil", 1);
		myMap.put("Jayke", -56);
		myMap.put("Tamer", 100);
		myMap.put("Azeez", 33);
		myMap.put("John", 87);
		myMap.put("Eric", 5);
		
		System.out.println(myMap);
		
		Map<String, Integer> ans = sortMap(myMap);
		System.out.println(ans);

	}
	
	public static Map<String, Integer> sortMap (Map<String, Integer> myMap){
		List<Map.Entry<String, Integer>> myList = new LinkedList<Map.Entry<String, Integer>>(myMap.entrySet());
		Collections.sort(myList, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));
		Map<String, Integer> temp = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> myEntry : myList) {
			temp.put(myEntry.getKey(), myEntry.getValue());			
		}
		return temp;		
		
	}

}