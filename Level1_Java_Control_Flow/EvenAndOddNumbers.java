//Import Scanner class for taking the user input in program.
import java.util.Scanner; // Import Scanner to take user input.

// Create EvenAndOddNumbers class to print odd and even numbers between 1 and the number entered by the user.
class EvenAndOddNumbers{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in); //Create object of scanner class sc for taking input in a variable num.
        
        // Create variable num for user to enter a positive integer.
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        
        // Check if the entered number is a positive integer.
        if (num <= 0){
            System.out.println("Please enter a positive integer.");
        }

		else{
            // Iterate through numbers from 1 to the entered number using a for loop.
            for (int i = 1; i <= num; i++){
				
                // Check if the current number is odd or even.
                if (i % 2 == 0){
					
                    // If the number is divisible by 2 the number even.
                    System.out.println(i + " is an even number.");
                }
				else{
					
                    // else the number is odd.
                    System.out.println(i + " is an odd number.");
                }
            }
        }
    }
}
