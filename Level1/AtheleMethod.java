//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a class AthleteMethod to calculate the number of rounds the athlete must complete.
public static class AthleteMethod{
	//Function for computing number of runs.
	double athlete(double distance ,double perimeter){
		return distance/perimeter ; 
	}

	public static void main(String args[]){
		// Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Create variable and user inputs for the sides of the triangular park
        System.out.println("Enter the length of the first side :");
        double side1 = sc.nextDouble();

        System.out.println("Enter the length of the second side :");
        double side2 = sc.nextDouble();

        System.out.println("Enter the length of the third side :");
        double side3 = sc.nextDouble();

        // Calculate the perimeter
        double perimeter = side1+side2+side3;

        // Convert 5 km to meters
        double distance = 5 * 1000;
		
        // Calculate the number of rounds the athlete needs to complete
        double rounds = athlete(distance,perimeter);

        // Print the result
        System.out.println("The number of rounds user needs to do is " + Math.ceil(rounds) + " to complete 5 km.");

    }
}
