// importing Scanner class for taking input.
import java.util.Scanner;

// Create a class DistanceInYardAndMiles for converting distance from feet to yards and miles.
public class DistanceInYardsAndMiles{

    public static void main(String args[]){

        // Create a Scanner object to take user input.
        Scanner sc = new Scanner(System.in);

        // Create the variable for distance in feet through user input.
        System.out.println("Enter the distance in feet:");
        double distanceInFeet = sc.nextDouble();

        // Convert the distance to yards.
        double distanceInYards = distanceInFeet / 3;

        // Convert the distance to miles using the formula.
        double distanceInMiles = distanceInYards / 1760;

        // Print the distance in yards and miles.
        System.out.println("The distance in yards is "+distanceInYards+" and in miles is "+distanceInMiles);

    }
}