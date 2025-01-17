//Import Scanner class for taking the user input in the program.
import java.util.Scanner;

// Create NumberMethod class to check if a number is positive, negative, or zero.
class NumberMethod{
    // Method to check if a number is positive, negative, or zero
    public static String numberChecker(int number){
        if (number > 0){    
            return "The number is positive.";
        } 
		else if(number < 0){
            return "The number is negative.";
        } 
		else{
            return "The number is zero.";
        }
    }

    public static void main(String args[]){
        // Declare a variable to store the number
        int number;

        // Create a Scanner object to get input from the user
        Scanner sc = new Scanner(System.in);

        // Create variable to input the number
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        // Printing the result by calling the method
        System.out.println(numberChecker(number));
    }
}
