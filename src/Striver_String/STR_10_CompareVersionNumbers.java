// LC - 165
// Self coded

package Striver_String;

public class STR_10_CompareVersionNumbers {
	
	public static int compareVersion(String version1, String version2) {

        String[] arr1 = version1.split("\\.");									// Split the string (NOTE)
        String[] arr2 = version2.split("\\.");

        int length = arr1.length >= arr2.length ? arr1.length : arr2.length;	// Get the max length of two

        for (int i = 0 ; i < length ; i++){										// For loop the max length
            Integer v1 = i < arr1.length ? Integer.parseInt(arr1[i]) : 0;  // Convert if exists, else 0 (Integer)
            Integer v2 = i < arr2.length ? Integer.parseInt(arr2[i]) : 0;  // Convert if exists, else 0 (Integer)
            int compare = v1.compareTo(v2);										// Compare
            if (compare != 0){													// If not zero (-1 or 1)
                return compare;													// Return immediately
            }
        }

        return 0;																// Return 0 as both are same
        
    }

	public static void main(String[] args) {
		
		String version1 = "1.2";
		String version2 = "1.10";
		
		System.out.println(compareVersion(version1, version2));

	}

}
