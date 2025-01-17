//Import Scanner class for taking the user input in program.
import java.util.Scanner;


// Create a class TravelCalculation to take user inputs and print travel details
public class TravelCalculation{

    public static void main(String args[]){

        //Create object of scanner class sc for taking input.
        Scanner sc = new Scanner(System.in);

        // Create a variable taking user input for traveler's details.
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter the city you are traveling from:");
        String fromCity = sc.nextLine();

        System.out.println("Enter the city you are traveling via:");
        String viaCity = sc.nextLine();

        System.out.println("Enter the city you are traveling to:");
        String toCity = sc.nextLine();

        // Create a variable taking user input for distances
        System.out.println("Enter the distance from " + fromCity + " to " + viaCity + " (in Km):");
        double fromToVia = sc.nextDouble();

        System.out.println("Enter the distance from " + viaCity + " to " + toCity + " (in Km):");
        double viaToFinalCity = sc.nextDouble();

        // Create a variable taking user input for travel time
        System.out.println("Enter the time taken for the journey from " + fromCity + " to " + viaCity + " (in hours and mintues):");
        double timeFromToViaInHours = sc.nextDouble();
		double timeFromToViaInMin = sc.nextDouble();
		double timeFromToVia = timeFromToViaInHours*60+timeFromToViaInMin;
		

        System.out.println("Enter the time taken for the journey from " + viaCity + " to " + toCity + " (in hours and minutes):");
        double timeViaToFinalCityInHours = sc.nextDouble();
		double timeViaToFinalCityInMin = sc.nextDouble();
		double timeViaToFinalCity = timeViaToFinalCityInHours*60+timeViaToFinalCityInMin;

        // Calculate total distance and total time
        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the travel details.
        System.out.println("Traveler: " + name+"\n Route from: " + fromCity + " via " + viaCity + " to " + toCity +" \n Total Distance: " + totalDistance + " Km" + "\n Total Time: " + totalTime + " mintues");
        


    }
}
