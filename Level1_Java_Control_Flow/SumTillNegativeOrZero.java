//Import Scanner class for taking the user input in program.
import java.util.Scanner;



// create SumtillZeroOrNegative class to calculate the sum of numbers until the user enters 0 or a negative number
class SumtillZeroOrNegative{
    public static void main(String[] args){
        
        // Declare a variable start to store the running sum of the numbers.
        // Initialize it to 0.0 since we are taking it as double and the sum starts from zero.
        double start = 0.0;
        
        // Create a Scanner object to get input from the user.
        Scanner sc = new Scanner(System.in);
        
        // Create a variable to store the user input.
        double number;
        
        // Using an infinite loop to continuously ask the user for input.
        while (true) {
            // Ask the user to input a number.
            System.out.print("Enter a number (enter 0 or a negative to stop the loop): ");
            number = sc.nextDouble();
            
            // If the entered number is 0 or negative, break the loop and stop the input process
            if (number <= 0) {
                break;
            }
            
            // Add the entered number to the start sum
            start += number;
        }
        
        // After the loop, print the sum of the numbers.
        System.out.println("The start sum is: " + start);
    }
}
