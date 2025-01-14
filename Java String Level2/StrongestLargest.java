import java.util.Scanner; //Import Scanner class for taking the user input in the program.

// Create ShortestAndLargest to split the string into words and find the shortest and longest strings
public class ShortestAndLargest {

    public static void main(String[] args) {

        // Create the object of the class SplitAndFindLength
        ShortestAndLargest shortestAndLargest = new ShortestAndLargest();

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        // Remove the spaces from the start and end using trim method
        str = str.trim();

        // Create the length variable and store the result returned by calculateLength method
        int length = shortestAndLargest.calculateLength(str);

        // Create a string array that stores the word and length of word returned by splitString method
        String[][] stringArray = shortestAndLargest.splitString(str, length);

        // Print all the words and their lengths
        System.out.println("\nWords and their lengths:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Word: " + stringArray[i][0] + ", Length: " + stringArray[i][1]);
        }

        // Find the shortest and longest word lengths
        int[] arr = shortestAndLargest.shortestAndLargestElement(stringArray);

        // Display the shortest and largest word lengths
        System.out.println("\nShortest word length: " + arr[0]);
        System.out.println("Longest word length: " + arr[1]);

        // Close the scanner
        sc.close();
    }

    // Create a method for shortest and largest element length of the string.
    public int[] shortestAndLargestElement(String[][] stringArray) {
        // Initialize shortest and largest lengths using the first word's length
        int shortest = Integer.parseInt(stringArray[0][1]);
        int longest = Integer.parseInt(stringArray[0][1]);

        // Traverse the array to find the shortest and longest word lengths
        for (int i = 1; i < stringArray.length; i++) {
            int currentLength = Integer.parseInt(stringArray[i][1]);
            if (currentLength < shortest) {
                shortest = currentLength;
            }
            if (currentLength > longest) {
                longest = currentLength;
            }
        }

        // Return the shortest and longest lengths in an array
        return new int[]{shortest, longest};
    }

    // Create a method calculateLength to calculate the length of the string.
    public int calculateLength(String str) {
        // Create a variable and initialize it to zero to count the word in the string
        int counter = 0;

        try {
            // Take a loop to iterate over the string
            while (str.charAt(counter) > 0) {
                // If the string is not empty, increase the counter variable
                counter++;
            }
        } catch (IndexOutOfBoundsException e) {
            // If an error occurs, it means the string has ended, so return the counter variable
            return counter;
        }

        // Return the counter
        return counter;
    }

    // Create a method that uses charAt method to split the string into words and count the length of words
    public String[][] splitString(String str, int length) {
        int counter = 0;

        // Traverse the string to count words
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') {
                continue;
            } else if (str.charAt(i) == ' ') {
                counter++;
            }
        }

        // Create a string array that stores the word and its length
        String[][] stringArray = new String[counter + 1][2];
        String word = "";
        int wordCount = 0;

        // Traverse the string to split it into words
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') {
                continue;
            } else if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {
                stringArray[wordCount][0] = word;
                stringArray[wordCount][1] = String.valueOf(calculateLength(word));
                word = "";
                wordCount++;
            }
        }

        // Add the last word to the array
        stringArray[wordCount][0] = word;
        stringArray[wordCount][1] = String.valueOf(calculateLength(word));

        // Return the string array
        return stringArray;
    }
}
