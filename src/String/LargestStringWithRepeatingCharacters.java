package String;

public class LargestStringWithRepeatingCharacters {

    public static void main(String[] args) {

        // Sample input
        String s = "babdfghccddddddddddbdarfwesacd";

        if (s.isEmpty()) {
            System.out.println("0 No repeating characters");
            return;
        }

        int maxLength = 1, tempLength = 1, end = 0;

        // Iterate through the string to find the longest repeating character sequence
        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            char previous = s.charAt(i - 1);

            if (current == previous) {
                tempLength++;
                end = i;
            } else {
                // Check if we have found a longer repeating sequence
                if (tempLength > maxLength) {
                    maxLength = tempLength;
                }
                tempLength = 1;
            }
        }

        // Final check after loop in case the longest sequence is at the end
        if (tempLength > maxLength) {
            maxLength = tempLength;
        }

        // Calculate and print the longest repeating character substring
        String output = s.substring(end - maxLength + 1, end + 1);
        System.out.println("Length of largest repeating substring: " + maxLength);
        System.out.println("Largest repeating substring: " + output);
    }
}
