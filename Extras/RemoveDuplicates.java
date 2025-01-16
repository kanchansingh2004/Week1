import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create a class RemoveDuplicates to remove the duplicates
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.trim(); // Removing extra spaces from the input
        
        // Calling the method to remove duplicate characters
        String modifiedStr = removeDuplicates(str);
        System.out.println("String after removing duplicates: " + modifiedStr);
        sc.close();
    }

    // Method for removing duplicate characters from the string
    public static String removeDuplicates(String str) {
         // To store the modified string
        String result = "";
        
        // Loop to iterate through the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i); 
            if (result.indexOf(currentChar) == -1) { 
                result += currentChar; 
            }
        }
        return result; // Return the modified string
    }
}
