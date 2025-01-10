// Importing Scanner class to take user input
import java.util.Scanner;


// Create a class MultipleOfNumber to find all the multiple of a number taken as user input below 100.
public class MultipleOfNumber{

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Create variable to take user input for the number
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Run a for loop for checking multiples of the number from 100 to 1.
        System.out.print("Multiples of " + number + " below 100 are: ");
		
        for (int i = 100; i >= 1; i--){
            if (i % number == 0){  
				//Print the value of i if it is fully divisible by number
                System.out.print(i + " ");  
            }
        }

    }
}
