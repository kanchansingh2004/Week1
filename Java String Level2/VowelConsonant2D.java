import java.util.Scanner; //Import Scanner class for taking the user input in the program.

public class VowelConsonant2D{
	// Method to check if the character is a vowel, consonant, or not a letter
    public String checkCharacterType(char ch) {
        // Convert character to lowercase for uniformity
        char lowerChar = Character.toLowerCase(ch);

        // Check if the character is a vowel
        if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        else if (lowerChar >= 'a' && lowerChar <= 'z') {
            return "Consonant";
        }
        // If not a letter
        return "Not a Letter";
    }

    // Method to find vowels, consonants, and their types in a string
    public String[][] findCharacterTypes(String str) {
        // Create a 2D array to store characters and their types
        String[][] charTypeArray = new String[str.length()][2];

        // Loop through the string using charAt
        for (int i = 0; i < str.length(); i++) {
            // Get the character at the current index
            char currentChar = str.charAt(i);

            // Store the character and its type in the array
            charTypeArray[i][0] = String.valueOf(currentChar);
            charTypeArray[i][1] = checkCharacterType(currentChar);
        }

        // Return the 2D array
        return charTypeArray;
    }

    // Method to display the 2D array in a tabular format
    public void displayCharacterTypes(String[][] charTypeArray) {
        // Print table header
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("----------------------------");

        // Loop through the 2D array and print each row
        for (String[] row : charTypeArray) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of the class
        VowelConsonant2D obj = new VowelConsonant2D();

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Call the method to find character types
        String[][] charTypeArray = obj.findCharacterTypes(str);

        // Display the result in a tabular format
        System.out.println("\nCharacter Types:");
        obj.displayCharacterTypes(charTypeArray);

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}
