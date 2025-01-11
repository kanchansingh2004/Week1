//Import Scanner class for taking the user input in the program.
import java.util.Scanner; 

// Creating NumbersTable6To9 class for determining the table of the given number  
public class NumbersTable6To9{
	public static void main(String args[]){
		
		// Create a Scanner object to take input from the user.
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the Number: "); 
		 int number = sc.nextInt();
		 
		// Declare the array of age size 4 to take 4 multiples.
		int[] values = new int[4];
		
		//Running a for loop for computing and storing value and also printing the table at same time.
		for (int i = 0 ; i<values.length; i++){
			
			// Initializing the naturalNumber to keep track of number for multiplication.
			int naturalNumber = i+6 ;
			
			//Performing computation from 6 to 9 and storing it in array.
			values[i] = number * naturalNumber;
			
			//Print the result.
			System.out.println(number+" * "+naturalNumber+" = " +values[i]);
			
			
			
		}
	}
}