// Import Scanner class for taking input
import java.util.Scanner;

// Create a class PoundsToKilo for converting weight in pounds to kilograms.
public class PoundsToKilo {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Create the variable for weight in pounds and take user input
        System.out.println("Enter weight:");
        float weightInPounds = sc.nextFloat();
	

        // Converting weight from pounds to kilograms.
        float weightInKg = weightInPounds/2.2f; 

        // Print the height in centimeters, feet, and inches
        System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKg);

        
    }
}