import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create a class LongestWordFinder to find longest word
public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        sentence = sentence.trim(); // Removing extra spaces from the input
        
        // Calling the method to find the longest word
        String longestWord = findLongestWord(sentence);
        System.out.println("The longest word in the sentence is: " + longestWord);
        sc.close();
    }

    // Method for finding the longest word in the sentence
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" "); // Splitting the sentence into words
        String longestWord = ""; // To store the longest word found

        // Loop to iterate through the words and Check if the current word is longer
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word; 
            }
        }
        return longestWord; // Return the longest word
    }
}
