//Import Scanner class for taking the user input in the program.
import java.util.Scanner; 

// Creating SumOfAllValue class to print the total sum using two array.
public class SumOfAllValue{
	public static void main(String args[]){
		// Create a Scanner object to take input from the user.
		Scanner sc = new Scanner(System.in);
		
		// Declaring the first array arr1 of size 10 to store double values. 
		double[] arr = new double[10];
		
		//Create variable total for storing the sum of the values entered by the user.
		double total = 0.0;
		
		//Create a variable i to keep track of the index of array.
		int i = 0;
		
		//Ruunig a while loop to take user input for computation.
		while(true){
			
			//Condition for checking the limit.
			if(i>=10){
				break;
			}
			
			//Create variable number for user input store in array index.
			System.out.println("Enter the " +(int)(i+1)+ " number (Enter 0 or negative number to stop) :");
			double number = sc.nextDouble();
			
			//Checking condition to break the loop if the user wants to stop or if the limit has been reached .
			if(number <= 0){
				break;
			}
			else{
				//Storing the values in array and incrementing the index i by 1.
				arr[i] = number;
				i++;
			}
			
		}
		
		
		//Ruunig a for loop to compute the sum of numbers given in input by adding them to variable total.
		for(int j=0; j<i; j++){
			total += arr[j];
		}
		
		//Print the total sum.
		System.out.println("The total value is :"+ total);
		
		
	}
}