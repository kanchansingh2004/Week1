import java.util.Scanner; // Import Scanner class for taking user input in the program.

// Create class CharacterFrequency01 to find the frequency of characters in a string using charAt() method
public class CharacterFrequency01 {

    // Method to find the frequency of characters in a string
    public static String[][] findFrequency(String text) {
        // Array to store the frequency of each character (for ASCII values)
        int[] frequency = new int[256];

        // Loop through the string to populate the frequency array
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

        // Determine the size of the 2D array using frequencies
        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Store the result in the 2D array with characters and their frequencies
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = Character.toString((char) i); 
                result[index][1] = Integer.toString(frequency[i]); 
                index++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        // Call the method to find character frequencies
        String[][] frequencies = findFrequency(str);

        // Display the result in a tabular format
        System.out.println("Character | Frequency");
        System.out.println("----------------------");
        for (String[] row : frequencies) {
            System.out.printf("    %s     |     %s\n", row[0], row[1]);
        }

        // Close the scanner
        sc.close();
    }
}
