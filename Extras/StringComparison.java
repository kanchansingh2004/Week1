import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create a class StringComparison to compare 2 strings
public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        str1 = str1.trim(); // Removing extra spaces from the first string
        
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        str2 = str2.trim(); // Removing extra spaces from the second string
        
        // Calling the method to compare the strings
        int comparision = compareStrings(str1, str2);
        if (comparision < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" lexicographically.");
        } else if (comparision > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" lexicographically.");
        } else {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\" lexicographically.");
        }

        sc.close();
    }

    // Method to compare two strings lexicographically without built-in methods
    public static int compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length()); 

        // Loop to compare characters at each position
        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i); 
            char char2 = str2.charAt(i); 
            if (char1 != char2) {
                return char1 - char2; 
            }
        }

        // If characters match up to the shorter string length, compare lengths
        return str1.length() - str2.length();
    }
}
