//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a class FactorialCalculatorUsingForLoop for calculating the factorial of a number entered by the user.
class FactorialCalculatorUsingForLoop {
    public static void main(String[] args) {
        
		//Create object of scanner class sc for taking input in a variable num
        Scanner sc = new Scanner(System.in);
        
        // Asking user to enter a positive integer in number variable
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt(); // Read the number entered by the user
        
        // Check if the entered number is positive
        if (number < 0){
            System.out.println("Factorial is not defined for negative numbers.");
        } 
		
		else{
            // Initialize the factorial variable
            long factorial = 1; // We use long to store large results of factorials
            
            // Compute factorial using a for loop
            // Loop from 1 to 'number'
            for (int i = 1; i <= number; i++) { 

                // Multiply factorial by i
                factorial *= i; 
            }
            
            // Print the result
            System.out.println("The factorial of " + number + " is " + factorial);
        }
    }
}
