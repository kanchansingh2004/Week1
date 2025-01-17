// Import Scanner class for taking user input in the program.
import java.util.Scanner;

// Creating MultiArray class to copy a 2D array into a 1D array.
public class MultiArray{
	public static void main(String args[]){
		
        // Create a Scanner object to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Take user input for the number of rows and columns for the 2D array.
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt(); 

        // Declare a 2D array (multiArray) of size rows x columns.
        int[][] multiArray = new int[rows][columns];

        // Taking user input to populate the 2D array using variable rows and columns.
        System.out.println("Enter the elements of the multiArray:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) { 
                System.out.print("Enter element at (" + i + ", " + j + "): ");
				// Store user input in the 2D array
                multiArray[i][j] = sc.nextInt(); 
            }
        }

        // Declare a 1D array of size rows * columns to store the elements of the 2D array.
        int[] singleArray = new int[rows*columns];

        // Variable to track the current index in the 1D array.
        int index = 0;

        // Loop through the 2D array to copy elements into the 1D array.
        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < columns; j++) {
				// Copy elements to the 1D array and perform the post incrementation of index.
                singleArray[index++] = multiArray[i][j];
            }
        }

        // Display the elements of the 1D array.
        System.out.println("The elements of the 1D array are:");
        for (int i = 0; i < singleArray.length; i++) {
			// Print each element of the 1D array
            System.out.print(singleArray[i] + " "); 
        }
    }
}
