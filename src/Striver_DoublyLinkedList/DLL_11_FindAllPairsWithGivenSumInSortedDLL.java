// Self

package Striver_DoublyLinkedList;

import java.util.ArrayList;
import java.util.List;

public class DLL_11_FindAllPairsWithGivenSumInSortedDLL {
	
	static Node convertArrayToDLL(int[] arr) {
		
		Node head = new Node(arr[0]);
		
		Node prev = head;	// prev itself is used as mover here :)
		
		for (int i = 1 ; i < arr.length ; i++) {
			Node temp = new Node(arr[i], null, prev);
			prev.next = temp;
			prev = temp;
		}
		
		return head;		
	}
	
	static List<List<Integer>> getAllPairs(Node head, int sum){
		
		List<Integer> al = new ArrayList<Integer>();
		
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		
		Node left = head;
		Node right = head;
		
		while (right.next != null) {
			right = right.next;
		}
		
		while (right.data > left.data) {			// While right data is greater then the left data
													// NOTE: The given DLL is sorted 
			
			int x = right.data;					
			int y = left.data;
			
			if (x + y == sum) {
				al.add(x);
				al.add(y);
				right = right.back;
				left = left.next;
				ans.add(new ArrayList<Integer> (al));
				al.clear();
			}
			
			else if (x + y < sum) {
				left = left.next;
			}
			
			else right = right.back;
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 9 };
		
		int sum = 5;
		
		Node head = convertArrayToDLL(arr);
		
		List<List<Integer>> ans = getAllPairs(head, sum);
		
		System.out.println(ans);

	}

}