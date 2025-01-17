//Import Scanner class for taking the user input in program.
import java.util.Scanner; 

// Create GradeCalculator class to calculate grade based on average marks
public class GradeCalculator
{
    public static void main(String[] args){
		
        // Create Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Create a variable for user to enter Physics marks and store the value 
        System.out.print("Enter Physics marks: ");
        double physicsMarks = scanner.nextDouble(); 

        // Create a variable for user to enter Chemistry marks and store the value 
        System.out.print("Enter Chemistry marks: ");
        double chemistryMarks = scanner.nextDouble(); 

        // Create a variable for user to enter Maths marks and store the value 
        System.out.print("Enter Maths marks: ");
        double mathsMarks = scanner.nextDouble(); 

        // Calculate the total marks by adding Physics, Chemistry, and Maths marks
        double total = physicsMarks + chemistryMarks + mathsMarks;

        // Calculate the average marks by dividing the total marks by 3
        double averageMarks = total / 3;

        // Initialize the grade variable to store the final grade
        String grade = "";

        // Check if the average marks are 80 or above and assign the corresponding grade
        if (averageMarks >= 80){
            grade = "A (Level 4, above agency-normalized standards)";
        }
		
        // Check if the average marks are between 70 and 79 and assign the corresponding grade
        else if (averageMarks >= 70){
            grade = "B (Level 3, at agency-normalized standards)";
        }
		
        // Check if the average marks are between 60 and 69 and assign the corresponding grade
        else if (averageMarks >= 60){
            grade = "C (Level 2, below, but approaching agency-normalized standards)";
        }
		
        // Check if the average marks are between 50 and 59 and assign the corresponding grade
        else if (averageMarks >= 50){
            grade = "D (Level 1, well below agency-normalized standards)";
        }
		
        // Check if the average marks are between 40 and 49 and assign the corresponding grade
        else if (averageMarks >= 40){
            grade = "E (Level 1-, too below agency-normalized standards)";
        }
		
        // If the average marks are below 40, assign "R" for remedial standards
        else{
            grade = "R (Remedial standards)";
        }

        // Print the average marks with 2 decimals
        System.out.printf("Average Marks: %.2f\n", averageMarks);

        // Print the grade 
        System.out.println("Grade: " + grade);

    }
}
