//Import Scanner class for taking the user input in program.
import java.util.Scanner; 
 
// Create AbundantNumber class to check if a number is abundant
public class AbundantNumber{
    public static void main(String[] args){
        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create a variable number for user to enter a number to check if it's an abundant number or not.
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // Read the number entered by the user.

        // Create a variable to store the sum of divisors and initialize sum to 0.
        int sum = 0; 

        // Run a for loop for finding divisors of the input number.
        for(int i = 1; i < number; i++){
			
            // Using for loop check if 'i' is a divisor of number.
            if (number % i == 0){
				// Add i to the sum of divisors if it divide perfectly.
                sum += i; 
            }
        }

        // Check if the sum of divisors is greater than the number.
        if (sum > number){
            // If sum is greater than number then it is an abundant number.
            System.out.println("Abundant Number");
        } 
		else{
            // If sum is not greater than number then it's not an abundant number.
            System.out.println("Not an Abundant Number");
        }
    }
}
