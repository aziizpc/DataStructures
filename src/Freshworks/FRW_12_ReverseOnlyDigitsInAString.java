// 100% self (Minor error resolved with ChatGPT)

package Freshworks;

public class FRW_12_ReverseOnlyDigitsInAString {
	
public static String reverse(String s){
        
        char[] arr = s.toCharArray();
        
        int n = arr.length;
        
        int start = -1, end = -1;
        
        for (int i = 0 ; i < n ; i++){
            if (Character.isDigit(arr[i])){
                start = i;
                break;
            }
        }
        
        if (start == -1) return s;
        
        for (int j = (n - 1) ; j >= 0 ; j--){
            if (Character.isDigit(arr[j])){
                end = j;
                break;
            }
        }
        
        if ((start == end)) return s;
        
        while (start < end){
            
            swap(arr, start, end);
            
            start++;
            end--;
            
            while (!Character.isDigit(arr[start])) start++;
            while (!Character.isDigit(arr[end])) end--;
            
        }
        
        return new String(arr);
        
    }
    
    public static void swap(char[] arr, int start, int end){
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    
    public static void main(String[] args) {
        
        String s1 = "s1d";
        System.out.println(reverse(s1));
        
        String s2 = "s1vv2vcc345hgh6##7%%A6----1@2";
        System.out.println(reverse(s2));
    }

}