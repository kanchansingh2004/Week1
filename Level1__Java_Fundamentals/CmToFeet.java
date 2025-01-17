// import Scanner class for taking input
import java.util.Scanner;

// Create a class CmToFeet for converting height in centimeters to feet and inches
public class CmToFeet {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Create the variable for height in centimeters and take user input
        System.out.println("Enter your height in centimeters:");
        double heightInCm = sc.nextDouble();

        // Create a variable to Convert height to inches.
        double heightInInches = heightInCm/2.54;	

        // Convert height to feet and calculate the remaining inches.
        int heightInFeet = (int)(heightInInches/12); 
        int remaining = (int)(heightInInches%12);

        // Print the height in centimeters, feet, and inches
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + remaining);

        
    }
}