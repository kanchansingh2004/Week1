// Import Scanner class for taking user input in the program.
import java.util.Scanner;

public class ReverseNumber{
    public static void main(String args[]){
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Variable to count the number of digits in the number and storing number to a temporary number.
        int count = 0;
        int temporary = number;
		
		//Running while loop for 
        while (temporary != 0){
            temporary /= 10;
			//Increase the count.
            count++; 
        }

        // Taking out digits from the number and store them in the digits array
		// Declaring the array number of size count
        int[] digits = new int[count];
        temporary = number;
        for (int i = 0; i < count; i++){
            digits[i] = temporary % 10; 
            temporary = temporary / 10;  
        }


		 // Create an array to store the digits in reverse order and run for loop
        int[] reverse = new int[count];
        for (int i = 0; i < count; i++){
            reverse[i] = digits[count-1-i];
        }

        // Print the reversed digits
        System.out.print("Reversed number is: ");
        for (int i = 0; i < count; i++){
            System.out.print(reverse[i]);
        }
    }
}
