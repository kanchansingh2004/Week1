import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create a class FibonacciSequenceGenerator for generating fibonacci sequence.
public class FibonacciSequenceGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for the number of terms
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int terms = sc.nextInt();

        // Calling the method to generate and print the Fibonacci sequence
        generateFibonacci(terms);
        sc.close();
    }

    // Method to generate and print the Fibonacci sequence up to the specified number of terms
    public static void generateFibonacci(int terms) {
        // Handle edge cases
        if (terms <= 0) {
            System.out.println("Please enter a number.");
            return;
        }

        // First two terms of the Fibonacci sequence
        int first = 0, second = 1;

        // Print the first term if it's part of the sequence
        if (terms >= 1) {
            System.out.print(first);
        }

        // Print the second term if it's part of the sequence
        if (terms >= 2) {
            System.out.print(" " + second);
        }

        // Generate and print the remaining terms in the Fibonacci sequence
        for (int i = 3; i <= terms; i++) {
            int nextTerm = first + second;
            System.out.print(" " + nextTerm);
            first = second;
            second = nextTerm;
        }

        System.out.println(); 
    }
}
