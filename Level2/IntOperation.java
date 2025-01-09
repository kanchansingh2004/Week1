//Import Scanner class for taking the user input in program.
import java.util.Scanner;


// Create a class IntOperation for performing integer operations with precedence
public class IntOperation{

    public static void main(String args[]){

        //Create object of scanner class sc for taking input.
        Scanner sc = new Scanner(System.in);

        // Create variables a, b, c of type int and take user input
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();

        System.out.println("Enter the value of b:");
        int b = sc.nextInt();

        System.out.println("Enter the value of c:");
        int c = sc.nextInt();

        // Perform integer operations considering operator precedence
		
		// Here multiplication is having higher precedence than addition so we first multiply b and c then add a.
        int result1 = a + b * c;  
		
		//Here multiplication is having higher precedence than addition so we first multiply b and a then add c.
        int result2 = a * b + c;  
		
		// Here division is having higher precedence than addition so we first divide a and b then add c.
        int result3 = c + a / b;  
		
		// Here modulus is having higher precedence than addition so we first perform modulus of a and b then add c.
        int result4 = a % b + c;  

        // Print the results of the operations performed.
        System.out.println("The results of Int Operations are:"+result1+", "+result2+", "+result3+" and "+result4);
        

    }
}
