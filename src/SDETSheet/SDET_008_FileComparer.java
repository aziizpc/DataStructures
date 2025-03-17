package SDETSheet;

import java.io.*;

public class SDET_008_FileComparer {

    public static void compareFiles(String filePath1, String filePath2) {
        try (
            BufferedReader r1 = new BufferedReader(new FileReader(filePath1));
            BufferedReader r2 = new BufferedReader(new FileReader(filePath2))
        ) {
            String line1, line2;
            int lineNumber = 1;
            boolean areFilesIdentical = true;

            while ((line1 = r1.readLine()) != null | (line2 = r2.readLine()) != null) {
                if (line1 == null || line2 == null || !line1.equals(line2)) {
                    areFilesIdentical = false;
                    System.out.println("Difference found at line " + lineNumber + ":");
                    System.out.println("File 1: " + (line1 != null ? line1 : "EOF"));
                    System.out.println("File 2: " + (line2 != null ? line2 : "EOF"));
                }
                lineNumber++;
            }

            if (areFilesIdentical) {
                System.out.println("The files are identical.");
            }

        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Replace with your file paths
        String filePath1 = "path/to/first/file.txt";
        String filePath2 = "path/to/second/file.txt";

        compareFiles(filePath1, filePath2);
    }
}