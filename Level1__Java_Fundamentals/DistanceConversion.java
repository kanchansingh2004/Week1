//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a class for performing the conversion
class DistanceConversion{
	
//Create a function solve taking input km in double that is returning the converted value.
	public  static double Solve(double km){
		return km/1.6;
		
	}
	
	public static void main(String args[]){
		
	//Taking the user input using the scanner class
		System.out.println("Enter the value: ");
		Scanner sc = new Scanner(System.in);
		double km = sc.nextDouble();
		
		//Storing the converted value in result variable
		double result = Solve(km);
		
		//Print the value.
		System.out.println("The total miles is "+result+"mile for the given "+km+"km");
	}
	
}