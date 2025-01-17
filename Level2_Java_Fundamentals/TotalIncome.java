//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create TotalIncome Class to compute the age of harry by performing substraction with birth year and current year.
 class TotalIncome{
	 
	public static void main(String args[])
	{
		//Create object of scanner class sc for taking input.
		Scanner sc = new Scanner(System.in);
		
		//Create a variable salary for taking user salary as input.
		System.out.println("Enter the salary: ");
		float salary = sc.nextFloat();
		
		//Create a variable bonus for taking bonus as input. 
		System.out.println("Enter the bonus: ");
		float bonus = sc.nextFloat();
		
		// Create a variable totalIncome to calculate the user's total Income.
		float totalIncome = salary + bonus;
		
		// Print the total Income of the user after the bonus is added.
		System.out.println("The salary is INR "+ salary +" and bonus is INR " + bonus +". Hence Total Income is INR "+totalIncome);
	}
}