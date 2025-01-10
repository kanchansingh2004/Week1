//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// create FactorialCalculatorUsingWhileLoop class to calculate the factorial of a number entered by the user.
class FactorialCalculatorUsingWhileLoop{
	
    public static void main(String[] args){
        
		//Create object of scanner class sc for taking input in a variable num.
        Scanner sc = new Scanner(System.in);
        
        // Create variable number for user to enter a positive integer.
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        
        // Check if the entered number is positive
        if (number < 0){
            System.out.println("Factorial is not defined for negative numbers.");
        } 
		else{
			
            // Crate variable for the factorial use long to store large results of factorials
            long factorial = 1; 
            
            // Compute factorial using a while loop start from 1
            int i = 1;
			
            while (i <= number){
				
				// Multiply factorial by i
                factorial *= i; 
				
                i++; // Increment i
            }
            
            // Print the result
            System.out.println("The factorial of " + number + " is " + factorial);
        }
    }
}
