import java.util.Scanner; // Import Scanner class for user input

// Class to check if a text is a palindrome using three different logics
public class PalindromeCheck{

    // Logic 1: Compare characters from the start and end of the string
    public static boolean isPalindromeByIndex(String text) {
        int start = 0; // Start index
        int end = text.length() - 1; // End index

        // Loop through the string and compare characters
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // Return false if characters do not match
            }
            start++; 
            end--; 
        }
        return true; // Return true if all characters match
    }

    // Logic 2: Recursive method to check if a text is a palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case: If start index is greater than or equal to end index
        if (start >= end) {
            return true;
        }
        // If characters do not match, return false
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        // Recursive call with incremented start and decremented end
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Compare original and reversed character arrays
    public static boolean isPalindromeByArray(String text) {
        // Reverse the string using a custom method
        char[] reversedArray = reverseString(text);

        // Convert the original string to a character array
        char[] originalArray = text.toCharArray();

        // Compare characters in original and reversed arrays
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false; // Return false if characters do not match
            }
        }
        return true; // Return true if all characters match
    }

    // Helper method to reverse a string using charAt()
    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        int index = 0;

        // Loop through the string in reverse order to populate the reversed array
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed[index++] = text.charAt(i);
        }
        return reversed; // Return the reversed character array
    }

   
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text to check if it is a palindrome: ");
        String text = scanner.nextLine();

        // Call each method and display the result
        System.out.println("\nChecking Palindrome using Different Logics:");

        // Applying Logic 1
        boolean resultByIndex = isPalindromeByIndex(text);
        System.out.println("Logic 1 (Index Comparison): " + (resultByIndex ? "Palindrome" : "Not a Palindrome"));

        // Applying Logic 2
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Logic 2 (Recursive): " + (resultRecursive ? "Palindrome" : "Not a Palindrome"));

        // Applying Logic 3
        boolean resultByArray = isPalindromeByArray(text);
        System.out.println("Logic 3 (Character Array Comparison): " + (resultByArray ? "Palindrome" : "Not a Palindrome"));
    }
}
