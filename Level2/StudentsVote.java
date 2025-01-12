//Import Scanner class for taking the user input in program.
import java.util.Scanner;

//Create StudentVoteChecker class to check eligibility.
public class StudentVoteChecker{

    // Create function to check if a student is eligible to vote or not.
    public boolean canStudentVote(int age) {
        // Condition to check if the age is negative return false.
        if (age < 0){
            return false;  
        }
		
        // Return through condition as if age is 18 or above then student can vote.
        return (age >= 18);
    }

    public static void main(String args[]) {
		//Scanner class object sc.
        Scanner sc = new Scanner(System.in);
        
        // Array to store the age of 10 students
        int[] ages = new int[10];
        
        // Run a loop to get age input for 10 students and check the vote eligibility.
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the student " + (i + 1) + " age: ");
            ages[i] = sc.nextInt();
            
		StudentVoteChecker object = new StudentVoteChecker();
		
            // Check if the student can vote
            if (object.canStudentVote(ages[i])){
                System.out.println("Student " + (i + 1) + " can vote.\n ");
            } 
			else{
                System.out.println("Student " + (i + 1) + " cannot vote.\n");
            }
        }
        
        sc.close();
    }
}