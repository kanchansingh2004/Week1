// Import Scanner class for taking user input in the program.
import java.util.Scanner;

// Creating FizzBuzzArray class to perform the FizzBuzz operation based on user input.
public class FizzBuzzArray{

    public static void main(String[] args){

        // Create a Scanner object to take input from the user.
        Scanner sc = new Scanner(System.in);

        //Create variable number to ask the user to enter a positive integer.
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the input number is positive.
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Declare a String array to store the results of the FizzBuzz operation.
        String[] results = new String[number + 1];

        // Loop through numbers from 0 to the input number.
        for (int i = 0; i <= number; i++){

            // Check if the current number is divisible by both 3 and 5.
            if (i % 3 == 0 && i % 5 == 0){
                results[i] = "FizzBuzz";
            } 
            
            // Check if the current number is divisible by 3.
            else if (i % 3 == 0){
                results[i] = "Fizz";
            } 
            
            // Check if the current number is divisible by 5.
            else if (i % 5 == 0){
                results[i] = "Buzz";
            } 
            
            // If none of the above condition statisfy then store the number itself as a string.
            else{
                results[i] = String.valueOf(i);
            }
        }

        // Display the results stored in the array with their index positions.
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}
