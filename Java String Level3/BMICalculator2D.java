import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create class BMICalculator2D to find the BMI and display the height, weight, BMI, and status of each individual
public class BMICalculator2D{

    // Method to compute BMI and status for 10 person
    public static String[][] computeBMI(double[][] height){
        String[][] bmiResults = new String[10][4]; 

        for (int i = 0; i < 10; i++) {
            double weight = height[i][0];
			
			// Convert height to meters
            double heightInMeters = height[i][1] / 100.0; 
            double bmi = weight / (heightInMeters * heightInMeters);

            bmiResults[i][0] = String.format("%.2f", weight); 
            bmiResults[i][1] = String.format("%.2f", height[i][1]); 
            bmiResults[i][2] = String.format("%.2f", bmi); 

            // Determine BMI status
            if (bmi < 18.5){
                bmiResults[i][3] = "Underweight";
            } 
			else if (bmi < 24.9){
                bmiResults[i][3] = "Normal weight";
            } 
			else if (bmi < 29.9){
                bmiResults[i][3] = "Overweight";
            } 
			else{
                bmiResults[i][3] = "Obesity";
            }
        }
        return bmiResults;
    }

    // Method to calculate BMI and store results in a 2D array
    public static String[][] calculateBMI(double[][] height){
        return computeBMI(height);
    }

    // Method to display results
    public static void displayBMIReport(String[][] bmiheight) {
        System.out.println("Person\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < bmiheight.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t%s\n", 
                              i + 1, bmiheight[i][0], bmiheight[i][1], bmiheight[i][2], bmiheight[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personheight = new double[10][2]; // [Weight, Height]

        // Input: weight and height of 10 persons
        System.out.println("Enter the weight (in kg) and height (in cm) for 10 members:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d - Weight (kg): ", i + 1);
            personheight[i][0] = sc.nextDouble();
            System.out.printf("Person %d - Height (cm): ", i + 1);
            personheight[i][1] = sc.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiResults = calculateBMI(personheight);

        // Display BMI Report
        System.out.println("\nBMI Report:");
        displayBMIReport(bmiResults);

        sc.close();
    }
}
