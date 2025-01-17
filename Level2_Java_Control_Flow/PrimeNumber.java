//Import Scanner class for taking the user input in program.
import java.util.Scanner; 

// Create PrimeNumber class to check if a number is prime
public class PrimeNumber{
    public static void main(String[] args){
        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create a variable for user to enter a number to check if it's a prime number
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 

        // Create a variable to store the result of prime check assume the number is prime initially
        boolean isPrime = true; 

        // Prime number checks are only done for numbers greater than 1
        if (number <= 1){
            isPrime = false;
        } 
		
		else{
            // Loop from 2 to the number-1 and check for divisibility
            for (int i = 2; i < number; i++){
				
                // If the number is divisible by 'i', it is not prime
                if (number % i == 0){
                    isPrime = false; // Set isPrime to false
                    break; // Exit the loop as the number is not prime
                }
            }
        }

        // Output result for prime number
        if (isPrime){
            System.out.println(number + " is a Prime Number.");
        } 
		else{
            System.out.println(number + " is not a Prime Number.");
        }
    }
}
