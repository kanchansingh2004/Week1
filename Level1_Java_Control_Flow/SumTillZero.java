//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create SumtillZero class to calculate the sum of numbers until the user enters 0
class SumtillZero{
    public static void main(String[] args){
        
        // Declare a variable start of type double to store the sum of numbers
        double start = 0.0;
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Declare a variable to store the user's entered number to use the modified value each time.
        double number;
        
        // Use a while loop to keep checking for numbers until the user enters 0 as input to stop.
        while (true){
            // Ask the user to input a number
            System.out.print("Enter a number (or enter 0 to stop): ");
            number = sc.nextDouble();
            
            // If the number is 0, break out of the loop
            if (number == 0) {
                break;
            }
            
            // Add the entered number to the start
            start += number;
        }
        
        // Print the result as the start sum after the loop end
        System.out.println("The start sum is: " + start);
    }
}
