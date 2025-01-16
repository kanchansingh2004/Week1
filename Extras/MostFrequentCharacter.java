import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create a class MostFrequentCharacter to find the most frequency character
public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        // Removing extra spaces from the input
        str = str.trim(); 

        // Calling the method to find the most frequent character
        char mostFrequentChar = findMostFrequentCharacter(str);
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");

        sc.close();
    }

    // Method to find the most frequent character in a string
    public static char findMostFrequentCharacter(String str) {
        int[] frequency = new int[256]; 
        int maxFrequency = 0; 
        char mostFrequentChar = '\0'; 

        // Loop to count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
            frequency[ch]++; 
        }

        // Loop to find the character with the highest frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); 
            if (frequency[ch] > maxFrequency) {
                maxFrequency = frequency[ch]; 
                mostFrequentChar = ch; 
            }
        }

        return mostFrequentChar; // Return the most frequent character
    }
}
