package PriorityQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PQ_02_FrequencyBasedSortChar {

	public static void main(String[] args) {

		System.out.println("Output: " + frequencySort("tree"));

	}

	public static String frequencySort(String s) {

		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			myMap.put(c, myMap.getOrDefault(c, 0) + 1);
		}

		//PriorityQueue<Character> pq = new PriorityQueue<Character>((a, b) -> (myMap.get(b) - myMap.get(a)));
		
		PriorityQueue<Character> pq = new PriorityQueue<Character>((a, b) -> {	// Above is also correct
			int freqA = myMap.get(a);
			int freqB = myMap.get(b);
			return Integer.compare(freqA, freqB);
		});

		pq.addAll(myMap.keySet());

		while (!pq.isEmpty()) {
			char c = pq.poll();
			for (int i = 0; i < myMap.get(c); i++) {
				sb.append(c);
			}
		}

		return sb.toString();

	}
}