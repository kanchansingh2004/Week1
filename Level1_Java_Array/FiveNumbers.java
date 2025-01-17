//Import Scanner class for taking the user input in the program.
import java.util.Scanner; 

// Creating FiveNumbers class for performing multiple conditions on the 5 number given as input by user.
public class FiveNumbers{
	public static void main(String args[]){
		// Create a Scanner object to take input from the user.
		Scanner sc = new Scanner(System.in);
		
		// Declaring the array number of size 5. 
		int[] num = new int[5];
		
		//Take user input for the numbers.
		for (int i = 0 ; i<num.length; i++){
			System.out.println("Enter the Number"+ (int)(i+1) +" : ");
			
			//Storing the value in array using user input.
			num[i] = sc.nextInt();
		}
		
		//Performing the following operation on the array classifying it in different catagories.
		for (int i = 0 ; i < num.length ; i++){
			if (num[i] < 0){
				//If number is smaller than 0 then it is a negative number.
				System.out.println("The number "+ num[i]+" is negative.");
			}
			
			else if (num[i] == 0){
				//If number is equals to 0 then it is a Zero number.
				System.out.println("The number "+ num[i]+" is zero.");
			}
			
			else{
				if (num[i]%2==0){
					//If number is Greater than 0 and divisible by 2 then it is a even and positive number.
					System.out.println("The number " + num[i]+ " is even and positive.");
				}
				else{
					//If number is Greater than 0 and not divisible by 2 then it is a odd and positive number.
					System.out.println("The number " + num[i] + " is odd and Positive.");
				}
			}
			
		}
		
		
		
	}
}