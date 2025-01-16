import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create a class to reverse a string.
public class StringReverse {
    public static void main(String[] args) {
        //Create scanner class to take user input.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.trim();

        //Calling the method 
        String reversedStr = reverseString(str);
        System.out.println("Reversed String: " + reversedStr);
        sc.close();
    }
    //method for reversing the string 
    public static String reverseString(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }
}