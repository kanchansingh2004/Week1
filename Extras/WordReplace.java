import java.util.Scanner;
//Creating the class
public class WordReplace {
    public static void main(String[] args) {
          //Create Scanner object to take user input for accepting sentence, word to replace, and replacement word from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        sentence = sentence.trim(); // Removing extra spaces from the sentence

        System.out.print("Enter the word to replace: ");
        String wordToReplace = sc.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacementWord = sc.nextLine();

        // Calling the method to replace the word in the sentence
        String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);
        System.out.println("Modified Sentence: \"" + modifiedSentence + "\"");

        sc.close();
    }

    // Method to replace all occurrences of a word in a sentence
    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        // Use the replaceAll method to replace all occurrences of the word with the new word
        return sentence.replaceAll("\\b" + wordToReplace + "\\b", replacementWord);
    }
}
