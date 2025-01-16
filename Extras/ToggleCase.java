import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create a class ToggleCase
public class ToggleCase {

    // Method to toggle the case of each character in the string
    public static String toggleCase(String str) {
        StringBuilder toggledStr = new StringBuilder(); 

        // Loop to iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); 
            // Check if the character is uppercase
            if (Character.isUpperCase(currentChar)) { 
                toggledStr.append(Character.toLowerCase(currentChar)); 
            } 
            // Check if the character is lowercase
            else if (Character.isLowerCase(currentChar)) { 
                toggledStr.append(Character.toUpperCase(currentChar)); 
            } 
            else {
                toggledStr.append(currentChar); 
            }
        }
        return toggledStr.toString(); 
    }
    public static void main(String[] args) {
        //Create Scanner object to take user input.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Removing extra spaces from the input
        str = str.trim(); 

        // Calling the method to toggle the case of characters
        String toggledStr = toggleCase(str);
        System.out.println("String after toggling case: " + toggledStr);

        sc.close();
    }
}
