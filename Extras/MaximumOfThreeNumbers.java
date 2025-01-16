import java.util.Scanner;
//Creating the class
public class MaximumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user for three numbers
        int num1 = takeInput(input, 1);
        int num2 = takeInput(input, 2);
        int num3 = takeInput(input, 3);

        // Calling the method to find the maximum number
        int maximum = findMaximum(num1, num2, num3);

        // Output the result
        System.out.println("The maximum of the three numbers is: " + maximum);
    }

    // Method to take input from the user for a specific number
    public static int takeInput(Scanner input, int numberPosition) {
        System.out.print("Enter number " + numberPosition + ": ");
        return input.nextInt(); // Returns the entered number
    }

    // Method to find the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1; // Assume the first number is the maximum initially

        // Compare with second number
        if (num2 > max) {
            max = num2;
        }

        // Compare with third number
        if (num3 > max) {
            max = num3;
        }

        return max; // Return the maximum number
    }
}
