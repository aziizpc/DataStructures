package String;

public class RepeatedSubstringPattern {

public static void main(String[] args) {
        
        String s = "abaaabaaabaaabaa";
        
        System.out.println(repeatedSubstringPattern(s));
        
        
    }
    
    public static boolean repeatedSubstringPattern(String s) {
        int idx = (s + s).indexOf(s, 1);
        System.out.println("Index: " + idx);
        return  idx < s.length();	// NOTE: Less than ONLY
    }

}
