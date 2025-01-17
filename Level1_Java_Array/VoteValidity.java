//Import Scanner class for taking the user input in program.
import java.util.Scanner; 


// Creating VoteValidity class for determining the eligibility of students to vote. 
public class VoteValidity{
	
	public static void main(String args[]){
		
		//Create a Scanner class to take input from user.
		Scanner sc = new Scanner(System.in);
		
		// Declaring the array for storing the age of student of size 10. 
		int[] ages = new int[10];
		
		//Take user input for the ages of all 10 students by performing insertion in array.
		for (int i = 0 ; i<ages.length; i++){
			
			System.out.println("Enter the age of Student"+ (int)(i+1) +": ");
			
			//Storing the ages of students in array.
			ages[i] = sc.nextInt();
			
			
			
		}
		
		//Checking Eligibility of the students according to age taken from user input.
		for (int i = 0 ; i < ages.length ; i++){
			
			if (ages[i] <= 0 ){
				System.out.println("Invalid Age");
			}
			else{
				
				if (ages[i] >= 18){
					System.out.println("The student with the age "+ ages[i] + " can vote.");
				}
				else{
					System.out.println("The student with the age " + ages[i] + " cannot vote.");
				}
			}
		}
	}
}