import java.util.Scanner; //Import Scanner class for taking the user input in the program.

public class VotingEligibilityStrings{

    // Method to generate random 2-digit ages for n students
    public int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 90) + 10; // Generate random ages between 10 and 99
        }
        return ages;
    }

    // Method to determine voting eligibility and return a 2D array
    public String[][] determineVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); // Store the age as a string
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote (Invalid Age)"; // Invalid age
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote"; // Eligible to vote
            } else {
                result[i][1] = "Cannot Vote"; // Not eligible to vote
            }
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public void displayVotingEligibility(String[][] data) {
        System.out.printf("%-10s %-20s%n", "Age", "Voting Eligibility");
        System.out.println("-------------------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-20s%n", row[0], row[1]);
        }
    }
	
    public static void main(String[] args) {
        // Create an object of the class
        VotingEligibilityStrings votingEligibility = new VotingEligibilityStrings();

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Generate random ages for n students
        int[] ages = votingEligibility.generateAges(n);

        // Determine voting eligibility
        String[][] eligibilityData = votingEligibility.determineVotingEligibility(ages);

        // Display the results
        System.out.println("\nVoting Eligibility Table:");
        votingEligibility.displayVotingEligibility(eligibilityData);

        // Close the scanner
        sc.close();
    }
}
