import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create a class PalindromeChecker to check palindrome
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        String str = takeInput(input);

        // Checking if the string is a palindrome
        boolean isPalindrome = checkPalindrome(str);

        // Displaying the result
        displayResult(isPalindrome);
    }

    // Method to take input from the user
    public static String takeInput(Scanner input) {
        System.out.print("Enter a string: ");
        return input.nextLine().trim(); // Taking the string and trimming extra spaces
    }

    // Method to check if the string is a palindrome
    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Checking each character from the start and end
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // If all characters match, it's a palindrome
    }

    // Method to display the result
    public static void displayResult(boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
    }
}
