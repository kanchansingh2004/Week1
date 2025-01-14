import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create class SplitTheString to see result with two different methods.
public class SplitTheString {

    // Method to compare two String arrays passed from main function.
    public static boolean compare(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    // Method to find the length of a string without using length() method
    public static int lengthOfStringTryCatch(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split the string into words without using split()
    public static String[] splitMethod(String str, int size) {
        int counter = 0;

        // Count the number of words by counting spaces
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) == ' ') {
                counter++;
            }
        }

        // Create an array to store the words
        String[] array = new String[counter + 1];
        int index = 0;
        String temp = "";

        // Extract words based on spaces
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) != ' ') {
                temp = temp + str.charAt(i);
            } else {
                array[index] = temp;
                temp = "";
                index++;
            }
        }

        // Adding the last word to the array
        array[index] = temp;

        return array;
    }

    public static void main(String args[]) {
        // Scanner class object to input string
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Calculate string length using user defined method
        int size = lengthOfStringTryCatch(str);

        // Split string using user-defined method
        String[] arr1 = splitMethod(str, size);

        // Split string using built-in split() method
        String[] arr2 = str.split(" ");

        // Compare and print the result
        if (compare(arr1, arr2)) {
            System.out.println("\nThe results are the same using both methods.");
        } 
		else {
            System.out.println("\nThe results are not the same using both methods.");
        }

        // Print results from both the String arrays.
        System.out.println("\nResult from custom split method:");
        for (String word : arr1) {
            System.out.println(word);
        }

        System.out.println("\nResult from built-in split method:");
        for (String word : arr2) {
            System.out.println(word);
        }
    }
}
