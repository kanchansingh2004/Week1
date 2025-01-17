// Import Scanner class for taking the user input in the program.
import java.util.Scanner;

// Create StudentGrades class to calculate and display grades for students using a 2D array
public class StudentGrades2DArray {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt(); 

        // Create a 2D array to store marks for Physics, Chemistry, and Maths for each student
        int[][] marks = new int[numStudents][3]; 
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents]; 

        // Loop through each student to take input for marks and calculate the grade
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            // Loop to ensure non-negative marks are entered for each subject
            do {
                System.out.print("Physics: ");
                marks[i][0] = sc.nextInt(); 

                System.out.print("Chemistry: ");
                marks[i][1] = sc.nextInt(); 

                System.out.print("Maths: ");
                marks[i][2] = sc.nextInt(); 
            } while (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0);

            // Calculate percentage for the student
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Determine the grade based on the percentage
            if (percentages[i] >= 80) {
                grades[i] = 'A'; 
            } 
			else if (percentages[i] >= 70) {
                grades[i] = 'B'; 
            } 
			else if (percentages[i] >= 60) {
                grades[i] = 'C'; 
            } 
			else if (percentages[i] >= 50) {
                grades[i] = 'D'; 
            } 
			else if (percentages[i] >= 40) {
                grades[i] = 'E'; 
            } 
			else {
                grades[i] = 'R'; 
            }
        }

        // Display the results
        System.out.println("\nResults:");

        // Loop to display the details of each student
         for (int student = 0; student < numStudents; student++){
            System.out.println("Student " + (student + 1) + ":");
            System.out.println("  Physics: " + marks[student][0]);
            System.out.println("  Chemistry: " + marks[student][1]);
            System.out.println("  Maths: " + marks[student][2]);
            System.out.printf("  Percentage: %.2f%%\n", percentages[student]);
            System.out.println("  Grade: " + grades[student]);
			
			// Add a blank line between students
            System.out.println(); 
			}
		}
    }

