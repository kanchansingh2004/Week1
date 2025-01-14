import java.util.Scanner; //Import Scanner class for taking the user input in the program.

public class VowelConsonantCounter {

	// Method to find vowels and consonants in a string
    public int[] findVowelsAndConsonants(String str) {

        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Loop through the string using charAt
        for (int i = 0; i < str.length(); i++) {

            // Get the character at the current index
            char currentChar = str.charAt(i);

            // Check the type of character and update counters
            String characterType = checkCharacterType(currentChar);
            if (characterType.equals("Vowel")) {
                vowelCount++;
            } else if (characterType.equals("Consonant")) {
                consonantCount++;
            }
        }

        // Return the counts as an array
        return new int[]{vowelCount, consonantCount};
    }
	
	// Method to check if the character is a vowel or consonant
    public String checkCharacterType(char ch) {
        // Convert character to lowercase to handle both uppercase and lowercase
        char lowerChar = Character.toLowerCase(ch);

        // Check if the character is a vowel
        if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        else if (lowerChar >= 'a' && lowerChar <= 'z') {
            return "Consonant";
        }
        // If not a letter, return "Not a Letter"
        return "Not a Letter";
    }

    public static void main(String[] args) {
        // Create an object of the class
        VowelConsonantCounter counter = new VowelConsonantCounter();

        //Scanner class object to input string value.
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

        // Call the method to count vowels and consonants
        int[] result = counter.findVowelsAndConsonants(str);

        // Display the result
        System.out.println("\nResults:");
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

        // Close the scanner 
        sc.close();
    }
}
