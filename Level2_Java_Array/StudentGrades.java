// Import Scanner class for taking the user input in the program.
import java.util.Scanner;

// Create StudentGrades class to calculate and display grades for students
public class StudentGrades {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt(); // Read the number of students

        // Create arrays to store the marks, percentages, and grades for each student
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];
        int[] mathsMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Loop through each student to take input for marks and calculate the grade
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            // Loop to ensure non-negative marks are entered
            do {
                System.out.print("Physics: ");
                physicsMarks[i] = sc.nextInt();
                System.out.print("Chemistry: ");
                chemistryMarks[i] = sc.nextInt();

                System.out.print("Maths: ");
                mathsMarks[i] = sc.nextInt();
            } while (physicsMarks[i] < 0 || chemistryMarks[i] < 0 || mathsMarks[i] < 0);

            // Calculate percentage and store in the percentages array
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;

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

        // Display the results in line-by-line format
        System.out.println("\nResults:");

        // Loop to display the details of each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("  Physics: " + physicsMarks[i]);
            System.out.println("  Chemistry: " + chemistryMarks[i]);
            System.out.println("  Maths: " + mathsMarks[i]);
            System.out.printf("  Percentage: %.2f%%\n", percentages[i]);
            System.out.println("  Grade: " + grades[i]);
            System.out.println(); // Add a blank line for better readability
        }
    }
}
