//Import Random class and Import Scanner class for taking the user input in program.
import java.util.Scanner; 
import java.util.Random;

//Create a class StudentsScores to compute the scores.
public class StudentsScores{

    // Create a method  to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int numStudents){
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; 
		
		//Running loop to find random values.
        for (int i = 0; i < numStudents; i++){
            for (int j = 0; j < 3; j++){
                scores[i][j] = rand.nextInt(100); 
            }
        }

        return scores;
    }

    // Create a method to calculate total, average, and percentage
    public static double[][] calculateScores(int[][] studentScores){
        int numStudents = studentScores.length;
        double[][] calculatedScores = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++){
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += studentScores[i][j];
            }
			
			//Computing the average and percentage of each student and round up to 2 decimals.
            double average = (double) total / 3;
            double percentage = (double) total / 300 * 100;

            calculatedScores[i][0] = total;
            calculatedScores[i][1] = Math.round(average * 100.0) / 100.0;
            calculatedScores[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return calculatedScores;
    }

    // Create a method to display the scorecard
    public static void displayScore(int[][] studentScores, double[][] calculatedScores) {
        
        System.out.println("Student\t     Physics\t     Chemistry\t       Maths\t        Total\tAverage\tPercentage");
        

        for (int i = 0; i < studentScores.length; i++){
			//print the result of each student.
            System.out.print("Student " + (i + 1) + "\t");
            for (int j = 0; j < 3; j++){
                System.out.print(studentScores[i][j] + "\t\t");
            }

            System.out.print(String.format("%.2f", calculatedScores[i][0]) + "\t");
            System.out.print(String.format("%.2f", calculatedScores[i][1]) + "\t\t");
            System.out.print(String.format("%.2f", calculatedScores[i][2]) + "\t\t");
            System.out.println();
        } 
    }
	
	public static void main(String args[]){
		
		// Create Scanner object to take input from the user
		System.out.println("Enter the number of students : ");
        Scanner sc = new Scanner(System.in);
        int numStudents = sc.nextInt();

        // Generate random scores for all students
        int[][] studentScores = generateRandomScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] calculatedScores = calculateScores(studentScores);

        // Display the scorecard
        displayScore(studentScores, calculatedScores);
    }
}