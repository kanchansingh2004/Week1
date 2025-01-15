import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create class UniqueCharacters find unique characters in a string using charAt() method
public class UniqueCharacters{

    // Method to calculate the length of the string without using the length() method
    public int calculateLength(String str) {
        int length = 0;
        try {
            while (str.charAt(length) != '\0') {
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of the string reached
        }
        return length;
    }

    // Method to find unique characters in a string
    public char[] findUniqueCharacters(String str) {
        int length = calculateLength(str);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        // Outer loop iterates over each character
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;

            // Inner loop checks if the character is already in the uniqueChars array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the uniqueChars array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array to store only the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of the class
        UniqueCharacters uniqueFinder = new UniqueCharacters();

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the method to find unique characters
        char[] uniqueCharacters = uniqueFinder.findUniqueCharacters(input);

        // Display the result
        System.out.print("Unique characters in the string are: ");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }

        // Close the scanner
        sc.close();
    }
}
