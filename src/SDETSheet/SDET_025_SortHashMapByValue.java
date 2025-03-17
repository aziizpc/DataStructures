package SDETSheet;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SDET_025_SortHashMapByValue {

	public static void main(String[] args) {

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

		hm.put(7, 100);
		hm.put(2, 50);
		hm.put(1, 25);
		hm.put(0, 90);
		hm.put(5, 80);

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> {
			int freqA = hm.get(a);
			int freqB = hm.get(b);
			return Integer.compare(freqA, freqB);
		});

		pq.addAll(hm.keySet());

		Map<Integer, Integer> hm1 = new LinkedHashMap<Integer, Integer>();

		while (!pq.isEmpty()) {
			hm1.put(pq.peek(), hm.get(pq.poll()));		// NOTE
		}

		System.out.println(hm1);
	}

}