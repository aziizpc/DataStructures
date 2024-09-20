// LC - 38
// 100% self

package Striver_String;

public class STR_09_CountAndSay {
	
	/* Input: n = 4
	 * Output: "1211"
	 * 
	 * Explanation:
	 * countAndSay(1) = "1"
	 * countAndSay(2) = RLE of "1" = "11"
	 * countAndSay(3) = RLE of "11" = "21"
	 * countAndSay(4) = RLE of "21" = "1211"
	 */
	
	public static String countAndSay(int n) {
        int k = 1;
        String result = "1";
        while (k != n){
            result = helper(result);
            k++;
        }
        return result;
    }
    
    public static String helper(String result){
        char curKey = ' ';
        int counter = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = 0 ; i < result.length() ; i++){
            char c = result.charAt(i);
            if (curKey == ' ' || c == curKey){
                curKey = c;
                counter++;
            }
            else {
                ans.append(Character.forDigit(counter, 10));
                ans.append(curKey);
                curKey = c;
                counter = 1;
            }
        }
        ans.append(Character.forDigit(counter, 10));
        ans.append(curKey);
        return ans.toString();        
    }

	public static void main(String[] args) {
		
		int n = 4;
		System.out.println(countAndSay(n));

	}

}
