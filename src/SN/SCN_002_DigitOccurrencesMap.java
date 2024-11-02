package SN;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class SCN_002_DigitOccurrencesMap {

    public static void main(String[] args) {
        // Example BigDecimal
        BigDecimal bigDecimal = new BigDecimal("12345.6789");
        
        // Map to store counts of digits 0 to 9
        Map<Integer, Integer> digitCounts = new HashMap<>();
        
        // Convert BigDecimal to String (plain string without scientific notation)
        String numberString = bigDecimal.toPlainString();
        
        // Iterate over each character in the string
        for (char c : numberString.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);  // Convert char to integer
                digitCounts.put(digit, digitCounts.getOrDefault(digit, 0) + 1);  // Increment count
            }
        }
        
        // Display the results
        System.out.println("Digit occurrences:");
        for (Map.Entry<Integer, Integer> entry : digitCounts.entrySet()) {
            System.out.println("Digit " + entry.getKey() + ": " + entry.getValue());
        }
    }
}