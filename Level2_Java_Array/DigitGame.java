// Import Scanner class for taking user input in the program.
import java.util.Scanner;

// Creating DigitGame class to find the frequency of each digit in the given number.
public class DigitGame{
    public static void main(String args[]){
		// Create a Scanner object to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Take user input.
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Convert the number to its absolute value to handle negative numbers.
        number = Math.abs(number);

        // Declare an array to store the digits of the number.
        int[] digits = new int[String.valueOf(number).length()];

        // Extract digits from the number and store them in the digits array.
        int tempNumber = number;
        int index = 0;
        while (tempNumber > 0){
            digits[index] = tempNumber % 10;
            tempNumber /= 10;
			//Increment the index
            index++;
        }

        // Declare a frequency array to count the occurrence of each digit.
        int[] frequency = new int[10];

        // Loop through the digits array and update the frequency array.
        for (int i = 0; i < digits.length; i++){
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit in the number.
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < frequency.length; i++){
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " have frequency " + frequency[i]);
            }
        }
    }
}
