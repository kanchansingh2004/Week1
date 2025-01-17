//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a class QuotientAndRemainder for calculating the quotient and remainder.
public class QuotientAndRemainder{

    public static void main(String args[]){

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Create the variable for the first number through user input
        System.out.println("Enter the first number:");
        int number1 = sc.nextInt();

        // Create the variable for the second number through user input
        System.out.println("Enter the second number:");
        int number2 = sc.nextInt();

        // Calculate the quotient
        int quotient = number1 / number2;

        // Calculate the remainder
        int remainder = number1 % number2;

        // Print the quotient and remainder along with the input numbers
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);

    }
}
