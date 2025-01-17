//Import Scanner class for taking the user input in program.
import java.util.Scanner; 

// Create a class FactorOfNumber to find the factors of a number taken as user input.
public class FactorOfNumber{

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Create variable for user input for the number
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Using a for loop to find the factors of the number taken as user input
        System.out.print("Factors of " + number + " are: ");
		
        for (int i = 1; i < number; i++) {
			
			// Check if the number is divisible by i
            if (number % i == 0) {  
				// Print the factor
                System.out.print(i + " ");  
            }
        }

 
    }
}
