// LC - 146
// There is another one -> LFU Cache (It's somewhat hard to implement)

package Striver_DoublyLinkedList;

import java.util.HashMap;
import java.util.Map;

class LRUNode{
	int k;											// Key
	int v;											// Value
	LRUNode next;
	LRUNode prev;
	
	public LRUNode(int k, int v) {					// Constructor
		this.k = k;
		this.v = v;
	}
}

public class DLL_14_LRUCache {
	
	LRUNode head;									// Declared head node
	LRUNode tail;									// Declared tail node (We insert new nodes just after head)
													// Least recently used will be just before tail
	
	Map<Integer, LRUNode> mp;						// Map is needed for this approach
	
	int capacity;									// Needed for LRU Cache as it has a max capacity
	
	public DLL_14_LRUCache(int capacity) {			// LRU Cache will have a max capacity.
		head = new LRUNode(0, 0);					// Init head
		tail = new LRUNode(0, 0);					// Init tail
		mp = new HashMap<Integer, LRUNode>();		// Init the Map
		
		this.capacity = capacity;					// Init capacity
		head.next = tail;							// Initially, we just have head & tail. So connecting both.
		tail.prev = head;		
	}
	
	public int get(int key) {						// GET function
		if (mp.containsKey(key)) {					// If the key is available in the map
			LRUNode node = mp.get(key);				// Get the value (That is Node)
			remove(node);							// We need to remove the node now (So that we can insert)
			insert(node);							// Inserting (Why? r & i --> To place it JUST after head) 
			return node.v;							// Return the value (As it's GET function)
		}
		else return -1;								// -1 ==> The key is NOT available
	}
	
	public void put(int key, int value) {			// PUT function
		if (mp.containsKey(key)) {					// Key already available => Need to remove (Same reason)
			remove(mp.get(key));					// The remove function param is Node
		}
		if (mp.size() == capacity) {				// NOTE: Irrespective of the above stmt, if mp size = capa.
			remove(mp.get(tail.prev));				// WE REMOVE THE TAIL.PREV as IT'S THE LEAST RECENTLY USED
		}
		LRUNode newNode = new LRUNode(key, value);	// Created the MAP with key and value
		insert(newNode);							// Inserted
	}
		
	
	public void insert(LRUNode node) {				// @param --> Node
		mp.put(node.k, node);						// Map put -> Key as 'k' value of Node & value as the Node
		LRUNode headNext = head.next;				// Saving the node after head
		head.next = node;							// Rewiring to bring the new node after 'head':
		node.next = headNext;
		headNext.prev = node;
		node.prev = head;
	}
	
	public void remove(LRUNode node) {				// @param --> Node
		mp.remove(node.k);							// Removing the entry in the Map
		node.prev.next = node.next;					// Rewiring (Note: We are removing node before the tail)
		node.next.prev = node.prev;
	}

	
}