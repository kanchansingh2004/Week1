//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a class DivisibilityOf5 for checking if any number is divisibleby 5.
class DivisibilityOf5{
	
	public static void main(String args[])
	{
		//Create object of scanner class sc for taking input in a variable num
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//Checking whether input number is divisible by 5 or not and output the result using the if and else statement.
		if(num%5==0)
			System.out.println("Is the number "+ num +" divisible by 5? YES");
		else 
			System.out.println("Is the number "+ num +" divisible by 5? NO");
	}
	
}