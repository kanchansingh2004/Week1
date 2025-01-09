//Import Scanner class for taking the user input in program.
import java.util.Scanner;


// Create a class UserInputPayment for calculating the discounted amount and discounted price the student will pay for the course.
public class UserInputPayment{
	
	public static void main(String args[]){
		
		//Taking the user input for the fees using the scanner class.
		System.out.println("Enter the payment: ");
		Scanner sc = new Scanner(System.in);
		int fees = sc.nextInt();
		
		//Taking the user input variable for discount percent.
		System.out.println("Enter the discount: ");
		int discountPercent = sc.nextInt();
		
		//Create the variable for calculating the discount price .
		int discountedPrice = (fees*discountPercent)/100 ;
		
		//Create the variable for calculating the final fees price.
		int finalFees = fees-discountedPrice;
		
		//Print the Final price student need to pay.
		System.out.println("The discount amount is INR "+discountedPrice+ " and final discounted fee is INR "+finalFees);
		
		
	}
}