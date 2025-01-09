// importing Scanner class for taking input
import java.util.Scanner;

// Create a class Perimeter for finding the side of a square
public class Perimeter{

    public static void main(String args[]){

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Create the variable for perimeter and take user input for perimeter
        System.out.println("Enter the perimeter of the square: ");
        int perimeter = sc.nextInt();

        // Create the side variable and calculate the side of the square.
        int side = perimeter/4;

        // Printing the side of the square and its perimeter
        System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);

        
    }
}