//Import Scanner class for taking the user input in program.
import java.util.Scanner;


// Create a class TotalRounds to calculate the number of rounds the athlete must complete
public class TotalRounds{

    public static void main(String args[]){

		// Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking user inputs for the sides of the triangular park.
        System.out.println("Enter the length of the first side of the triangular park:");
        double side1 = sc.nextDouble();

        System.out.println("Enter the length of the second side of the triangular park:");
        double side2 = sc.nextDouble();

        System.out.println("Enter the length of the third side of the triangular park:");
        double side3 = sc.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Convert 5 km to meters to use it perimeter as the sides are in meters.
        double distanceToRun = 5 * 1000;

        // Calculate the number of rounds the athlete needs to complete
        double rounds = distanceToRun/perimeter;

        // Print the result, rounding up the number of rounds if necessary by using the Math.ceil function that takes the nearest upper value.
        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");

    }
}
