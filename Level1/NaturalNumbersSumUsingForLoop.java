// Import Scanner to read user input using object
import java.util.Scanner; 

// create NaturalNumbersSumForLoop class to calculate the sum of n natural numbers using formula and while loop
class NaturalNumbersSumForLooploop
{
    public static void main(String[] args){
        
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Ask user for a natural number
        System.out.print("Enter a natural number: ");
        int n = input.nextInt(); // Read user input
        
        // Check if the number is positive
        if (n <= 0){
            System.out.println("The number " + n + " is not a natural number.");
        } 
		
		else{
			
            // Calculate sum using the formula
            int sumFormula = (n * (n + 1)) / 2;
            
            // Calculate sum using a while loop
            int sumLoop = 0;
			
            for(int i=1, i <= n, i++){
				
                 // Add current number to sumLoop
                sumLoop += i;
              
            }
            
            // Print both sums
            System.out.println("Sum using formula: " + sumFormula); 
            System.out.println("Sum using while loop: " + sumLoop);
            
            // Check if both sums are the same
            if (sumFormula == sumLoop){
                System.out.println("Both methods give the same result, the sum is correct!");
            } 
			else{
                System.out.println("There is a discrepancy in the results.");
            }
        }
    }
}

