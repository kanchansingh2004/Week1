import java.util.Scanner; //Import Scanner class for taking the user input in the program.

public class TrimStringUsingCharAt {

    // Method to trim leading and trailing spaces from a string
    public int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Loop to find the first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Loop to find the last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        // Return the start and end indices in an array
        return new int[]{start, end};
    }

    // Method to create a substring using the charAt() method
    public String createSubstring(String str, int start, int end) {
        String result = "";

        // Loop through the string from start to end
        for (int i = start; i <= end; i++) {
            result += str.charAt(i); // Concatenate each character to the result
        }

        return result;
    }

    // Method to compare two strings using the charAt() method
    public boolean compareStrings(String str1, String str2) {
        // Check lengths first for quick comparison
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare character by character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of the class
        TrimStringUsingCharAt stringProcessor = new TrimStringUsingCharAt();

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask for string input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String inputString = sc.nextLine();

        // Trim using charAt method
        int[] indices = stringProcessor.findTrimIndices(inputString);
        String trimmedString = stringProcessor.createSubstring(inputString, indices[0], indices[1]);

        // Trim using built-in trim() method
        String trimmedUsingBuiltIn = inputString.trim();

        // Compare the two trimmed strings
        boolean areEqual = stringProcessor.compareStrings(trimmedString, trimmedUsingBuiltIn);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Original String: [" + inputString + "]");
        System.out.println("Trimmed String (charAt method): [" + trimmedString + "]");
        System.out.println("Trimmed String (built-in method): [" + trimmedUsingBuiltIn + "]");
        System.out.println("Are both trimmed strings equal? " + (areEqual ? "Yes" : "No"));

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
