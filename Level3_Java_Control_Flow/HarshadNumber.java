//Import Scanner class for taking the user input in program.
import java.util.Scanner; 

// Create HarshadNumber class to check if a number is a Harshad number
public class HarshadNumber{
    public static void main(String[] args){
        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create variable number aksing user to enter a number to check if it's a Harshad number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Create a variable to store the sum of digits
        int sum = 0; // Initialize sum to 0

        // Create a variable to store the new number for checking divisibility
        int newNumber = number;

        // Run a while loop to access each digit of the number
        while (number > 0){
			
            // Extract the last digit of the number
			// Get the last digit
            int digit = number % 10; 
			
			// Add the digit to sum
            sum += digit; 
			
			// Remove the last digit
            number = number / 10; 
        }

        // Checking if the new number is divisible by the sum of its digits
        if (newNumber % sum == 0){
            // If the number is divisible by the sum of digits then it's a Harshad number
            System.out.println("The number is a Harshad Number");
        }
		else{
            // If the number is not divisible by the sum of digits, it's not a Harshad number
            System.out.println("The number is not a Harshad Number");
        }
    }
}
