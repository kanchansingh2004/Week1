// Import Scanner class for taking the user input in the program.
import java.util.Scanner;

//Create class SimpleInterestMethod for calculation the simple interest 
public class SimpleInterestMethod{
	
	//Function for calculating the simpleInterest
	public static double simpleInterestMethod(double principle , double rate , double time ){
			return (principle*time*rate/100);
		}
	
	public static void main(String args[]){
		// Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking user inputs for Principal, Rate, and Time
        System.out.println("Enter the Principal amount:");
        double principal = sc.nextDouble();
		System.out.println("Enter the Rate of Interest (in percentage):");
        double rate = sc.nextDouble();
        System.out.println("Enter the Time (in years):");
        double time = sc.nextDouble();
		
		//Finction calling
		double simpleInterest = simpleInterestMethod(principal,rate,time);
		
		// Print the results
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time + ".");
		}
	
}