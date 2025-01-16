import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create a class VowelConsonantCounter to count vowel and consonent in a String
public class VowelConsonantCounter {

    // Method to count the number of vowels and consonants in a given string.
    public static void countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lowercase to simplify the vowel check
        str = str.toLowerCase();

        // Iterate over each character in the string
        for (char c : str.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Check if the character is a vowel
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
    }

    public static void main(String[] args) {
        //Create Scanner object to take user input.
        Scanner sc  = new Scanner(System.in);
        String word = sc.next();
        System.out.println("Input String: " + word);

        //Call method to count
        countVowelsAndConsonants(word);
        sc.close();
    }
}