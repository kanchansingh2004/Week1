import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create a class FactorialUsingRecursion for calculating the factorial using recursion
public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = takeInput(input);
        
        // Calculating the factorial using recursion
        long factorial = calculateFactorial(number);

        // Displaying the result
        displayResult(factorial);
    }

    // Method to take input from the user
    public static int takeInput(Scanner input) {
        System.out.print("Enter a number: ");
        return input.nextInt(); 
    }

    // Method to calculate the factorial of a number using recursion
    public static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1; 
        }
        return num * calculateFactorial(num - 1); // Recursive case
    }

    // Method to display the result
    public static void displayResult(long factorial) {
        System.out.println("The factorial is: " + factorial);
    }
}
