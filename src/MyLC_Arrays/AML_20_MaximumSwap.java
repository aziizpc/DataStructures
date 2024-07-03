// LC - 670

package MyLC_Arrays;

public class AML_20_MaximumSwap {
	
	/*
	 * 1. Convert the num to character array - arr.
	 * 2. Create an array lastIndex. Update the array to store the LAST INDEX of each char (int) in arr. 
	 * 3. For loop: i the entire arr. Get current INTEGER as d -> For loop: j from 9 to > d -> Get 'loc' as 
	 * 	  lastIndex[j].
	 * 4. if loc > i (This is the main part. TRUE => Indirectly means, there is this bigger digit at 
	 *    RIGHT of current digit)
	 * 5. SWAP and return
	 * 6. return num (num already is the biggest)
	 * 
	 * Notes:
	 * 1. i - index, arr[i] - value ;;; j - value, lastIndex[j] - index 
	 * 2. Second for loop ONLY ensures that we are considering only 'j' which are > arr[i]
	 * 3. What more we need apart from Point 2 is that we need to make sure lastIndex[j] is @ RIGHT SIDE of i.
	 *    That is why we use the if condition.    
	 */
	
	public static int maximumSwap(int num) {

        char arr[] = String.valueOf(num).toCharArray();

        int[] lastIndex = new int[10];

        for (int i = 0 ; i < arr.length ; i++){     // Loop the character array
            int c = arr[i] - '0';                   // Get the int value of char @ i as c
            lastIndex[c] = i;                       // Set the 'lastIndex' array value @ position c as i
        }

        for (int i = 0 ; i < arr.length ; i++){
            char c = arr[i]; 
            int d = c - '0';
            for (int j = 9 ; j > d ; j--){
                int loc = lastIndex[j];
                if (loc > i){
                    char temp = arr[i];
                    arr[i] = arr[loc];
                    arr[loc] = temp;
                    return Integer.parseInt(new String(arr));
                }
            }
        }

        return num;
        
    }

	public static void main(String[] args) {
		
		int num = 2736;
		
		System.out.println(maximumSwap(num));

	}

}