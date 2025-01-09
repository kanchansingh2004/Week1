//Import Scanner class for taking the user input in program.
import java.util.Scanner;


// Create a class DoubleOpteration for performing double operations with precedence.
public class DoubleOpteration{

    public static void main(String args[]){

        //Create object of scanner class sc for taking input.
        Scanner input = new Scanner(System.in);

        // Create variables a, b, c of double data type and take user input
        System.out.println("Enter the value of a:");
        double a = input.nextDouble();

        System.out.println("Enter the value of b:");
        double b = input.nextDouble();

        System.out.println("Enter the value of c:");
        double c = input.nextDouble();

        // Perform double operations considering operator precedence
        // Here multiplication(*) has higher precedence than addition (+) so we first multiply b and c then add a.
        double result1 = a + b * c; 
		
		//Here multiplication(*) has higher precedence than addition (+) so we first multiply b and a then add c.
        double result2 = a * b + c; 
		
		// Here division(/) has higher precedence than addition (+) so we first divide a and b then add c.
        double result3 = c + a / b;  
		
		
        // Here modulus(%) has higher precedence than addition (+) so we first perform modulus of a and b then add c.
        double result4 = a % b + c;  

        // Print the results of the operations
        System.out.println("The results of Int Operations are:"+result1+","+result2+","+","+result3+" and "+result4);

      
    }
}
