import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create class StudentScoreCard compute the percentage and then calculate the grade
public class StudentScoreCard{

    // Method to generate random scores for Physics, Chemistry, and Math
    public int[][] generateScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10; // Physics scores
            scores[i][1] = (int) (Math.random() * 90) + 10; // Chemistry scores
            scores[i][2] = (int) (Math.random() * 90) + 10; // Math scores
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public double[][] calculateTotalAndPercentage(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] results = new double[numberOfStudents][3]; // Total, Average, Percentage

        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
        }
        return results;
    }

    // Method to calculate grades based on percentage
    public String[] calculateGrades(double[][] percentages) {
        String[] grades = new String[percentages.length];
        for (int i = 0; i < percentages.length; i++) {
			 // Percentage is at index 2, checking percentage lies in which grade
            double percentage = percentages[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } 
			else if (percentage >= 70) {
                grades[i] = "B";
            } 
			else if (percentage >= 60) {
                grades[i] = "C";
            } 
			else if (percentage >= 50) {
                grades[i] = "D";
            } 
			else if (percentage >= 40) {
                grades[i] = "E";
            }
			else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    // Method to display the scorecard
    public void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-15s %-10s%n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("-------------------------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-15.2f %-10s%n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of the class
        StudentScoreCard scoreCard = new StudentScoreCard();
        Scanner sc = new Scanner(System.in);

        // Take the number of students as input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Generate scores for all students
        int[][] scores = scoreCard.generateScores(numberOfStudents);

        // Calculate total, average, and percentage of the students
        double[][] results = scoreCard.calculateTotalAndPercentage(scores);

        // Calculate grades of all students
        String[] grades = scoreCard.calculateGrades(results);

        // Display the scorecard
        System.out.println("\nScorecard:");
        scoreCard.displayScorecard(scores, results, grades);

        // Close the scanner
        sc.close();
    }
}
