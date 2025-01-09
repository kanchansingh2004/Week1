//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a class SwapNumbers for swapping 2 numbers.
class SwapNumbers{
	
	public static void main(String args[])
	{
		//Create object of scanner class sc for taking input.
		Scanner sc = new Scanner(System.in);
		
		//Create a variable number1 for taking first number as input.
		System.out.println("Enter the first number: ");
		float number1 = sc.nextFloat();
		
		//Create a variable number1 for taking second number as input. 
		System.out.println("Enter the second number: ");
		float number2 = sc.nextFloat();
		
		//Swapping the numbers using the temp variable first storing the first number in temp, preserving it then storing second number in first number and storing temp in second number where our first number was stored.
		float temp = number1;
		number1 = number2;
		number2 = temp;
		
		//printing the swapped numbers 
		System.out.println("The swapped numbers are "+number1+" and "+number2);
	}
	
	
}