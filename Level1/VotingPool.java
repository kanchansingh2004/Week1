//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a class VotingPool for checking whether a person is eligible to vote or not.
class VotingPool{
	
	public static void main(String args[])
	{
		//Create object of scanner class sc for taking input as variable age.
		System.out.println("Enter your age:");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		//Checking whether input age is valid for voting or not and output the result using the if and else statement.
		if(age>=18)
			System.out.println("The person's age is " + age + " and can vote.");
		else 
			System.out.println("The person's age is " + age + "  and cannot vote.");
	}
	
	
}