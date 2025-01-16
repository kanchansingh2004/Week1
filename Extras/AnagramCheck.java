import java.util.Scanner;
//Create the class AnagramCheck
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accepting two strings from the user
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        // Removing extra spaces from the first string
        str1 = str1.trim(); 
        
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        // Removing extra spaces from the second string
        str2 = str2.trim();

        // Calling the method to check if the two strings are anagrams
        boolean areAnagrams = checkAnagram(str1, str2);
        if (areAnagrams) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }
        sc.close();
    }

    // Method to check if two strings are anagrams of each other
    public static boolean checkAnagram(String str1, String str2) {
        // If lengths of strings are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert both strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort both arrays
        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);

        // Compare sorted arrays
        return java.util.Arrays.equals(charArray1, charArray2);
    }
}
