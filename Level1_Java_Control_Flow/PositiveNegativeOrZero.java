//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a class PositiveNegativeOrZero for checking whether a person is eligible to vote or not.
class PositiveNegativeOrZero{
	
	public static void main(String args[])
	{
		//Create object of scanner class sc for taking input as variable num.
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//Checking whether input number is positive negative or zero and output the result using the if and else statement.
		if(num>0)
			System.out.println("Positive");
		else if(num<0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
	}
	
	
}