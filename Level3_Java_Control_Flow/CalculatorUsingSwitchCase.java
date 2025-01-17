//Import Scanner class for taking the user input in program.
import java.util.Scanner; 

//create a CalculatorUsingSwitchCase class to count the number of digit in an Integer
public class CalculatorUsingSwitchCase{
	
    public static void main(String[] agrs){
        // Create a Scanner object to take input from the user.
        Scanner input = new Scanner(System.in); 

         // Create variable for user to enter first number and store it to the first named variable
        System.out.print("Enter a first number: ");
        double first = input.nextDouble(); 

        // Similarly asking user to enter second number and store it to the second named variable
        System.out.print("Enter a second number: ");
        double second = input.nextDouble(); 

        // Now ask the user to enter the operator sign and store it in the op variable.
        System.out.print("Enter operator sign: ");
        String op = input.next(); 
        
        //Create the result variable and store the final result.
        double result;

        //Write the switch case for performing the operation such as Addition, Subtraction, Multiplication and Division
        switch(op){
			
            // if the op variable is equal to "+" then we print Addition of the variables
            case "+":
                result = first + second;
                System.out.println("The addition of two number "+first+" and "+second+" is "+result);
                break; //break is important to get out from the switch if the case if executed

            // if the op variable is equal to "-" then we print Subtraction of the variables
            case "-":
                result = first - second;
                System.out.println("The subtraction of two number "+first+" and "+second+" is "+result);
                break;
				
            // if the op variable is equal to "*" then we print Multiplication of the variables
                result = first * second;
                System.out.println("The multipication of two number "+first+" and "+second+" is "+result);
                break; 

            // if the op variable is equal to "/" then we print Division of the variables
            case "/":
                result = first / second;
                System.out.println("The division of two number "+first+" and "+second+" is "+result);
                break; 

            // if the op variable is some other sign then print Invalid Operator
            default:
                System.out.println("Invalid Operator");
                break; 
        }
        
        
    }
}
