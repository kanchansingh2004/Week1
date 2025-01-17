// importing Scanner class for taking input
import java.util.Scanner;

// Create a class Handshakes for calculating the total price of an item.
public class Handshakes{

    public static void main(String args[]){

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Create the variable taking input of unit price.
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();

		//Create the variable to calculate the maximum number of handshakes.
		int totalHandshakes = (n*(n-1))/2;
		
		
        // Printing the total price of the item.
        System.out.println("The total number of possible handshakes are: "+totalHandshakes);

        
    }
}