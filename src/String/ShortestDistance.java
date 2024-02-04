package String;

public class ShortestDistance {
	
	public static void main(String[] args) {
		String[] words = {"hello","i","am","leetcode","hello"};
		String target = "hello";
		int startIndex = 1;
		
		System.out.println(closestTarget(words, target, startIndex));
	}
	
	public static int closestTarget(String[] words, String target, int startIndex) {

        int n = words.length;
        int min = Integer.MAX_VALUE;

        for (int i = 0 ; i < n ; i++){

            if (words[i].equals(target)){

                int diff = Math.abs(i - startIndex);	// NOTE
                
                min = Math.min(min, diff);		// NOTE

                min = Math.min(min, n - diff);	// NOTE

                if (min == 1) return min;

            }

        }

        return min == Integer.MAX_VALUE ? -1 : min;
        
    }

}
