//Import Scanner class for taking the user input in program
import java.util.Scanner;

// Create a class SimpleInterest to take user inputs and print the SI using principal, rate and time
class SimpleInterest{
	
	public static void main(String args[]){
		
		//Create object of scanner class sc for taking input.
		Scanner sc = new Scanner(System.in);
		
		//Create the variable principal for input.
		System.out.println("Enter the principal: ");
		float principal = sc.nextFloat();
		
		//Create the variable for rate of interest.
		System.out.println("Enter the rate: ");
		float rate = sc.nextFloat();
		
		//Create the variable for time.
		System.out.println("Enter the time: ");
		float time = sc.nextFloat();
		
		//Create the variable for calculating the simple interest.
		float simpleInterest = (principal*rate*time)/100.00f;
		
		System.out.println("Simple Interest is: "+simpleInterest);
		
	}
	
}