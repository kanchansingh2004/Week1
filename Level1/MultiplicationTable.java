//Import Scanner class for taking the user input in the program.
import java.util.Scanner; 

// Creating MultiplicationTable class to print a multiplication table of a number.
public class MultiplicationTable{
	public static void main(String args[]){
		// Create a Scanner object to take input from the user.
		Scanner sc = new Scanner(System.in);
		
		//Create variable number to store value.
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		
		// Declaring the array number of size 10. 
		int[] arr = new int[10];
		
		//Running a loop to store the multiplication of variable number.
		for(int i = 1; i <= 10; i++){
			//performing the operation.
			arr[i-1] = i*number;
		}
		
		System.out.println("The multiplication table of : "+number);
		//Running a loop to display the multiplication of variable number.
		for(int i=1; i<=10; i++){
			System.out.println(number +" * "+ i +" = "+arr[i-1]);
			
		}
	}
	
}