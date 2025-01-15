import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create class FirstNonRepeatingCharacter to find the first non-repeating character in a string
public class FirstNonRepeatingCharacter{

    // Method to find the first non-repeating character in a string
    public char findFirstNonRepeatingChar(String str) {
        // Array to store the frequency of characters
        int[] frequency = new int[256]; 
        int[] index = new int[256]; 
        final int NOT_FOUND = -1;

        // Initialize index array
        for (int i = 0; i < 256; i++) {
            index[i] = NOT_FOUND;
        }

        // Populate frequency and index arrays
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            frequency[currentChar]++;
			// Condition to store first occurrence index
            if (index[currentChar] == NOT_FOUND) {
                index[currentChar] = i; 
            }
        }

        // Find the smallest index corresponding to a frequency of 1
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] == 1 && index[i] < minIndex) {
                minIndex = index[i];
            }
        }

        // If no non-repeating character found, return '\0'
        return (minIndex == Integer.MAX_VALUE) ? '\0' : str.charAt(minIndex);
    }

    public static void main(String[] args) {
        // Create an object of the class
        FirstNonRepeatingCharacter fnrc = new FirstNonRepeatingCharacter();

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the method to find the first non-repeating character
        char result = fnrc.findFirstNonRepeatingChar(input);

        // Display the result
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }

        // Close the scanner
        sc.close();
    }
}
