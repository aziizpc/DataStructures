// LC - 23
// Easy

package Striver_LinkedList;

import java.util.PriorityQueue;

public class LL_26_MergeKSortedLists {
	
	public Node mergeKLists(Node[] lists) {
		
		PriorityQueue<Node> pq = new PriorityQueue<Node>((a, b) -> a.data - b.data);// Created a PQ of Nodes
																					// sorted in the decreasing
																					// order of value
		
		for (Node list : lists) {				// Loop through all the LL
			if (list != null) {					// If the first node of each LL is NOT null
				pq.add(list);					// Add it to PQ
			}
		}
		
		Node dummyNode = new Node(-1);			// Created a dummy LL
		Node temp = dummyNode;					// Saved the first node
		
		while (!pq.isEmpty()) {					// While the PQ is not empty:
			Node minNode = pq.poll();			// Get the minimum node by doing poll (Note: Nodes are stored in Dec order)
			if (minNode.next != null) {			// If the next element after the minNode is not null:
				pq.add(minNode.next);			// Add it to PQ
			}
			temp.next = minNode;				// Connect the minNode to temp
			temp = minNode;						// minNode is the new temp
		}
		
		return dummyNode.next;					// return the next value after dummyNode
		
		
	}

}