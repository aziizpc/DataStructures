// LC - 2326

package MyLC_LinkedList;

import java.util.Arrays;

public class LL_2_SpiralMatrix {
	
	private static Node convertArrayToLL(int[] arr) {

		Node head = new Node(arr[0]); 			// The Array 0th index would be the head
		Node mover = head; 						// Just declare a mover. Currently it points to head.

		for (int i = 1; i < arr.length; i++) { 	// Start from the 1st index
			Node temp = new Node(arr[i]); 		// Create temp nodes based on index
			mover.next = temp; 					// Connect the mover to temp :)
			mover = temp; 						// Now, the mover is @ temp.
		}
		return head;
	}
	
	static int[][] spiralMatrix(int m, int n, Node head) {

        int top = 0;
        int right = n - 1;
        int bottom = m - 1;
        int left = 0;

        int[][] ans = new int[m][n];

        for (int i = 0 ; i < ans.length ; i++){
            for (int j = 0 ; j < ans[0].length ; j++){
                ans[i][j] = -1;
            }
        }

        Node temp = head;

        while (top <= bottom && left <= right){

            for (int i = left ; i <= right ; i++){
                ans[top][i] = temp.data;
                if (temp.next != null) temp = temp.next;
                else return ans;
            }
            top++;

            for (int i = top ; i <= bottom ; i++){
                ans[i][right] = temp.data;
                if (temp.next != null) temp = temp.next;
                else return ans;
            }
            right--;

            if (top <= bottom){
                for (int i = right ; i >= left ; i--){
                    ans[bottom][i] = temp.data;
                    if (temp.next != null) temp = temp.next;
                    else return ans;
                }
                bottom--;
            }

            if (left <= right){
                for (int i = bottom ; i >= top ; i--){
                    ans[i][left] = temp.data;
                    if (temp.next != null) temp = temp.next;
                    else return ans;
                }
                left++;
            }
            
        }

        return ans;
        
    }

	public static void main(String[] args) {
		
		int m = 3;
		int n = 5;
		
		int[] arr = { 3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0 };
		
		Node head = convertArrayToLL(arr);
		
		int[][] ans = spiralMatrix(m, n, head);
		
		System.out.println(Arrays.deepToString(ans));

	}

}