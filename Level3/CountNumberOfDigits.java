//Import Scanner class for taking the user input in program.
import java.util.Scanner; 

//create a CountNumberOfDigits class to count the number of digit in an Integer
public class CountNumberOfDigits {
    public static void main(String[] agrs){
		
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in); 

         // Take user input using statement enter a number.
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 
        
        //Create a variable newNumber that store the number variable in to it.
        int newNumber = number;

        //Create a variable count and assign it to 0.
        int count = 0;

        // Count digits using a while loop with a condition number that is not equal to 0.
        while(number != 0){

            //After checking if the number is not equal to zero, then we increment the count variable by 1.
            count = count + 1;

            // Dividing the number by 10 to remove the last digit of number and store it again in the number variable.
            number = number / 10;
        }
        //Print the count and newNumber variable.
        System.out.println("There are "+count+" digits in a number "+newNumber);
        
        
    }
}
