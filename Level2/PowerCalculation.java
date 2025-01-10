//Import Scanner class for taking the user input in program.
import java.util.Scanner; 

// Create a class PowerCalculation to find the power of a number.
public class PowerCalculation{

    public static void main(String[] args){

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Initialize the variable with user input for the base number.
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        // Initialize the variable user input for the power
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Initialize the result variable to 1
        int result = 1;

        // Using a for loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number; 
        }

        // Display the result for power calculation
        System.out.println(number + " raised to the power " + power + " is: " + result);

        
    }
}
