import java.util.Scanner; // Import Scanner class for user input

// Class to find frequency of unique characters in a string
public class CharacterFrequency02{

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        // Temporary array to hold unique characters
        char[] tempUnique = new char[text.length()];
        int uniqueCount = 0;

        // Loop to find unique characters
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character has already been encountered
            for (int j = 0; j < uniqueCount; j++) {
                if (tempUnique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If character is unique, add to the temporary array
            if (isUnique) {
                tempUnique[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create an array of the exact size to store unique characters
        char[] unique = new char[uniqueCount];
        System.arraycopy(tempUnique, 0, unique, 0, uniqueCount);

        return unique;
    }

    // Method to find frequency of unique characters
    public static String[][] findFrequency(String text) {
        // Call uniqueCharacters() method to find unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create a 2D array to store characters and their frequencies
        String[][] frequency = new String[uniqueChars.length][2];

        // Calculate frequency of each unique character
        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            int count = 0;

            // Count occurrences of the current character
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Store the character and its frequency in the array
            frequency[i][0] = Character.toString(currentChar);
            frequency[i][1] = Integer.toString(count);
        }

        return frequency;
    }

    // Main method
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Call the method to find character frequencies
        String[][] frequencies = findFrequency(str);

        // Display the result
        System.out.println("Character frequencies in the string:");
        for (String[] row : frequencies) {
            System.out.println("Character: " + row[0] + ", Frequency: " + row[1]);
        }
    }
}
