import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create a class RemoveSpecificCharacter to remove a specific character
public class RemoveSpecificCharacter {
    public static void main(String[] args) {
        //Create Scanner object to take user input.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.trim(); 

        System.out.print("Enter the character to remove: ");
        char charToRemove = sc.next().charAt(0); 

        // Calling the method to remove the specified character
        String modifiedStr = removeCharacter(str, charToRemove);
        System.out.println("Modified String: \"" + modifiedStr + "\"");
        
        sc.close();
    }

    // Method to remove all occurrences of a specific character from the string
    public static String removeCharacter(String str, char charToRemove) {
        StringBuilder result = new StringBuilder(); 

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); 
            if (currentChar != charToRemove) {
                // Append the character if it is not the one to remove
                result.append(currentChar); 
            }
        }

        return result.toString(); // Return the modified string
    }
}
