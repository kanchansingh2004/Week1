// import Scanner class for taking input
import java.util.Scanner;

// Create a class BasicCalculator for performming addition, subtraction, multiplication and division.
class BasicCalculator{
	
	public static void main(String args[])
	{
		//Create object of Scanner class.
		Scanner sc = new Scanner(System.in);
		
		//Creating variable and taking the 2 number as input using Scanner class.
		System.out.println("Enter the first number: ");
		float num1 = sc.nextFloat();
		
		System.out.println("Enter the second number: ");
		float num2 = sc.nextFloat();
		
		//Create add variable for performming addition.
		float add = num1+num2;
		
		//Create sub variable for performming subtraction.
		float sub = num1-num2;
		
		//Create div variable for performming division.
		float div = num1/num2;
		
		//Create multi variable for performming multiplication.
		float multi = num1*num2;
		
		
		System.out.println( "The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+" is "+add+", "+sub+", "+div+" and "+multi);

	}
	
	
}