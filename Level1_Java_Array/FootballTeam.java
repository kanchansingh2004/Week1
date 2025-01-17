//Import Scanner class for taking the user input in the program.
import java.util.Scanner;


// Creating FootballTeam class for determining mean of the football team given by user.  
public class FootballTeam{
	public static void main(String args[]){
		// Create a Scanner object to take input from the user.
		Scanner sc = new Scanner(System.in);
		
		// Declaring the array number of size 11. 
		double[] heightValue = new double[11];
		
		//Create variable sum to store height sum. 
		double sum = 0.0;
		
		//Storing value of the height using the array user input.
		for (int i = 0 ; i<heightValue.length; i++){
			//Taking the height from user.
			System.out.println("Enter the height of the player"+(i+1)+": ");
			double height = sc.nextDouble();
			 
			//Storing height in array.
			heightValue[i] = height;
		}
		
		for(int i = 0 ; i<heightValue.length; i++){
			//Adding the height of players.
			sum += heightValue[i];
		}
		
		//Printing Mean height of the football player.
		System.out.println("Mean Height: "+(int)(sum/11));
	}
}