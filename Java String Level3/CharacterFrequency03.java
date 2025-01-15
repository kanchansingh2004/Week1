import java.util.Scanner; // Import Scanner class for taking user input

// Class to find the frequency of characters in a string
public class CharacterFrequency03{

    // Method to find the frequency of characters in a string
    public static String[] findFrequency(String text) {
        // Convert the input string to a character array for processing
        char[] characters = text.toCharArray();

        // Array to store frequencies of each character
        int[] frequency = new int[characters.length];

        // StringBuilder to construct the result as a string
        StringBuilder result = new StringBuilder();

        // Outer loop to iterate through each character in the text
        for (int i = 0; i < characters.length; i++) {
            // Check if the character has already been processed (marked as '0')
            if (characters[i] != '0') {
                int count = 1; // Initialize the count for the current character

                // Inner loop to check for duplicates and count occurrences
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        count++; // Increment the count if duplicate is found
                        characters[j] = '0'; // Mark the duplicate character as processed
                    }
                }

                // Append the character and its frequency to the result
                result.append("Character: ").append(characters[i]).append(" Frequency: ").append(count).append("\n");
            }
        }

        // Convert the result to an array of strings, splitting by newline
        return result.toString().split("\n");
    }

    public static void main(String[] args) {
        // Create a Scanner object for taking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Call the method to find character frequencies
        String[] frequencies = findFrequency(str);

        // Display the character frequencies
        System.out.println("Character Frequencies:");
        for (String frequency : frequencies) {
            if (!frequency.isEmpty()) { // Skip empty lines
                System.out.println(frequency);
            }
        }
    }
}
