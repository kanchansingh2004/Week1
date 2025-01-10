//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a class NaturalNumberSum for checking whether the number is a natural number and calculate its sum.
class NaturalNumberSum{
	
	public static void main(String args[])
	{
		//Create object of scanner class sc for taking input as variable n.
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//Checking whether input number is a natural number and output the result using the if and else statement.
		if(n>0)
			System.out.println("The sum of " + n +" natural numbers is " + (n*(n+1))/2);
		else 
			System.out.println("The number " + n + " is not a natural number");
	}
	
	
}