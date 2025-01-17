//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create RocketLaunchForLoop class to perform countdown
class RocketLaunchForLoop{
    public static void main(String[] args){
        
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Taking input for the countdown value
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();
		
		//Create i variable to keep track of countdown and storing the counter value in it
		int i=counter;
        
        // Using a while loop to count down from the input value to 1
        while(i>=1){
			
            // Print the countdown value one by one till 1
            System.out.println("T-" + i); 
			
			//Decrement the i 
			i--;
			
        }
        
        // Print message for Rocket Launch.
        System.out.println("Rocket Launch!");
    }
}