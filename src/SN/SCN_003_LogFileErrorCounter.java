package SN;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SCN_003_LogFileErrorCounter {

    public static void main(String[] args) {
        // File path of the log file
        String logFilePath = "C:\\Users\\Azeez\\eclipse-workspace\\DataStructures\\src\\SN\\logfile.log"; // Update this to your log file path

        // Map to store error codes and their occurrences
        Map<String, Integer> errorCodeCounts = new HashMap<>();

        // Read the log file using FileInputStream
        try (FileInputStream fis = new FileInputStream(logFilePath)) {
            StringBuilder sb = new StringBuilder();
            int character;
            // Read file byte by byte
            while ((character = fis.read()) != -1) {
                sb.append((char) character);
            }

            // Convert the StringBuilder to a string and split it into lines
            String[] lines = sb.toString().split(System.lineSeparator());

            // Process each line
            for (String line : lines) {
                String errorCode = extractErrorCode(line);
                if (errorCode != null) {
                    // Increment the count of the error code in the map
                    errorCodeCounts.put(errorCode, errorCodeCounts.getOrDefault(errorCode, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Output the error codes and their occurrences
        System.out.println("Error codes and their occurrences:");
        for (Map.Entry<String, Integer> entry : errorCodeCounts.entrySet()) {
            System.out.println("Error Code: " + entry.getKey() + " -> Occurrences: " + entry.getValue());
        }
    }

    // Helper method to extract error code from a log line using regex
    private static String extractErrorCode(String logLine) {
        // Regex pattern for "CODE XXX" where XXX is the error code (digits)
        Pattern pattern = Pattern.compile("CODE (\\d+)");
        Matcher matcher = pattern.matcher(logLine);
        if (matcher.find()) {
            return matcher.group(1);  // Return the first captured group (error code)
        }
        return null;
    }
}