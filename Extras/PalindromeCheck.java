import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create a class PalindromeCheck to check the palindrome
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        // Removing extra spaces from the input
        str = str.trim(); 
        
        // Calling the method to check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(str);
        if (isPalindrome) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }

        sc.close();
    }

    // Method for checking if the string is a palindrome
    public static boolean checkPalindrome(String str) {
        int size = str.length(); 
        
        // Loop to compare characters from the beginning and end
        for(int i = 0 ; i < size/2 ; i++){
            if(str.charAt(i) != str.charAt(size-i-1))
                return false;
        }
        return true; 
    }
}
