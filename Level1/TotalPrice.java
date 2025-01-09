// importing Scanner class for taking input
import java.util.Scanner;

// Create a class TotalPrice for calculating the total price of an item.
public class TotalPrice{

    public static void main(String args[]){

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Create the variable taking input of unit price.
        System.out.println("Enter the unit price: ");
        int unitPrice = sc.nextInt();

        // Input the quantity to be brought.
		System.out.println("Enter the quantity: ");
        int quantity = sc.nextInt();

		//Calculating the total price of item.
		int totalPrice = unitPrice*quantity;
		
		
        // Printing the total price of the item.
        System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+"  and unit price is INR "+unitPrice);

        
    }
}