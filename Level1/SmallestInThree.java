//Import Scanner class for taking the user input in program.
import java.util.Scanner;


// Create a class SmallestInThree for comparing the first number to check if its the smallest or not.
class SmallestInThree{
	
	public static void main(String args[])
	{
		//Create object of scanner class sc for taking inputs.
		Scanner sc = new Scanner(System.in);
		
		//Create a variable to input the first number.
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		
		//Create a variable to input the second number.
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		
		//Create a variable to input the third number.
		System.out.println("Enter the third number");
		int num3 = sc.nextInt();
		
		//Checking which input first number is the smallest among three and output the result using the if and else statement.
		if(num1 <= num2 && num1 <= num3)
			System.out.println("Is the first number the smallest? YES");
		else
			System.out.println("Is the first number the smallest? NO");
	}
	
	
}