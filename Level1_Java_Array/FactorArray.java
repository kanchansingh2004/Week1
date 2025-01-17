// Import Scanner class for taking the user input in the program.
import java.util.Scanner;

// Create a class FactorArray to find the factors of a number taken as user input.
public class FactorArray{

    public static void main(String args[]){

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Create a variable for user input for the number
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Initialize maxFactor to define the initial size of the factors array
        int maxFactor = 10;

        // Create an array to store factors with the initial size maxFactor
        int[] factorArray = new int[maxFactor];

        // Variable to keep track of the current index of the array
        int index = 0;

        // Using a for loop to find factors of the number
        for (int i = 1; i <= number; i++) {

            // Check if the number is divisible by i
            if (number % i == 0) {

                // If index reaches the size of the factors array, resize the array
                if (index == maxFactor) {
                    // Double the size of maxFactor
                    maxFactor = maxFactor*2;

                    // Create a temporary array with the new size
                    int[] temp = new int[maxFactor];

                    // Copy elements from the current factors array to the temp array
                    for (int j = 0; j < factorArray.length; j++) {
                        temp[j] = factorArray[j];
                    }

                    // Assign the temp array back to the factors array
                    factorArray = temp;
                }

                // Store the factor in the array and increment the index
                factorArray[index] = i;
                index++;
            }
        }

        // Print the factors stored in the array
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factorArray[i] + " ");
        }
    }
}

