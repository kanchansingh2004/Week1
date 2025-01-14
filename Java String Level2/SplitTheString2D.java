import java.util.Scanner;

// Create SplitTheString2D to split the string into words and find the length of the corresponding word using a 2D String array.
public class SplitTheString2D {

    // Create a method lengthOfString to calculate the length of the string.
    public int lengthOfString(String str) {
        int counter = 0;
        try {
            while (str.charAt(counter) > 0) {
                counter++;
            }
        } catch (IndexOutOfBoundsException e) {
            return counter;
        }
        return counter;
    }

    public static void main(String[] agrs) {
        // Create the object of class SplitTheString2D
        SplitTheString2D split = new SplitTheString2D();

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        // Remove the spaces from the start and end using trim method
        str = str.trim();

        // Create the length variable and store the result return by lengthOfString method
        int length = split.lengthOfString(str);

        // Create a string array that stores the word and length of word that return by splitString method
        String[][] stringArray = split.splitString(str, length);

        // Display the results in tabular format
        System.out.println("|       Word       |   Length     |");

        for (int i = 0; i < stringArray.length; i++) {
            String word = stringArray[i][0];
            int wordLength = Integer.parseInt(stringArray[i][1]);
            System.out.printf("| %-16s | %-12d |\n", word, wordLength);
        }


        // Close the scanner to prevent resource leak
        sc.close();
    }

    // Create a method that uses charAt method to split the string into words and count the length of each word
    public String[][] splitString(String str, int length) {
        int counter = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') {
                continue;
            } else if (str.charAt(i) == ' ') {
                counter++;
            }
        }

        String[][] stringArray = new String[counter + 1][2];
        String word = "";
        int wordCount = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') {
                continue;
            } else if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {
                stringArray[wordCount][0] = word;
                stringArray[wordCount][1] = String.valueOf(lengthOfString(word));
                word = "";
                wordCount++;
            }
        }
        stringArray[wordCount][0] = word;
        stringArray[wordCount][1] = String.valueOf(lengthOfString(word));
        return stringArray;
    }
}
