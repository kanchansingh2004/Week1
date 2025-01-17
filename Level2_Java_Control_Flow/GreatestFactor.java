// Importing Scanner class to take user input
import java.util.Scanner;

// Create a class GreatestFactor to find the Highest factor of a number
public class GreatestFactor{

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Create variable for the integer as input from the user
        System.out.print("Enter a number to find its greatest factor: ");
        int number = sc.nextInt();

        // Create the variable to store the greatest factor 
        int greatestFactor = 1;

        // Use a for loop to find the greatest factor of the number
        for (int i = number - 1; i >= 1; i--)
		{	
            // Check if the number is perfectly divisible by i and break the loop as we found the greatest factor
            if (number % i == 0) {
                greatestFactor = i; // Assign i to greatestFactor
                break; 
        }

        // Display the greatest factor as result
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

    }
}
