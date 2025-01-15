import java.util.Scanner; // Import Scanner class for user input

// Class to check if two texts are anagrams by comparing their charaters frequencies
public class AnagramCheck{

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths of the two texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store the frequency of characters in the two texts
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256]; 

        // Loop through text1 to count the frequency of each character
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++; 
        }

        // Loop through text2 to count the frequency of each character
        for (int i = 0; i < text2.length(); i++) {
            frequency2[text2.charAt(i)]++; 
        }

        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false; 
            }
        }

        return true; // If all frequencies match, texts are anagrams
    }

    // Main method to test the anagram checking logic
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the first text
        System.out.print("Enter the first text: ");
        String text1 = sc.nextLine();

        // Take user input for the second text
        System.out.print("Enter the second text: ");
        String text2 = sc.nextLine();

        // Call the method to check if the texts are anagrams
        boolean result = areAnagrams(text1, text2);

        // Display the result
        if (result) {
            System.out.println("The texts \"" + text1 + "\" and \"" + text2 + "\" are anagrams.");
        } else {
            System.out.println("The texts \"" + text1 + "\" and \"" + text2 + "\" are not anagrams.");
        }
    }
}
