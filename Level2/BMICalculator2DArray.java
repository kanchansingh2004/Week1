//Import Scanner class for taking the user input in the program.
import java.util.Scanner;

public class BMICalculator2DArray{
    public static void main(String[] args){
		
        // Create a Scanner object to take user input and input the number of people.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int totalPerson = sc.nextInt();

        // Create a 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[totalPerson][3]; 
        String[] weightStatus = new String[totalPerson];

        // Take input for the weight and height of the persons
        for (int i = 0; i < totalPerson; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            // Checking if all inputs are valid or not
            double weight;
            do{
                System.out.print("Enter weight (in kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Enter a valid weight.");
                }
            }while (weight <= 0);

            // Checking if all inputs are valid or not
            double height;
            do{
                System.out.print("Enter height (in meters): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Enter a valid height.");
                }
            }while (height <= 0);

            // Store weight and height in 2D array
            personData[i][0] = weight; 
            personData[i][1] = height; 
        }

        // Calculate BMI, find weight status, and store it in the arrays
        for (int i = 0; i < totalPerson; i++) {
            // Calculate BMI
            double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
            personData[i][2] = bmi; 
			//Checking condition for bmi
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } 
			else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } 
			else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            }
			else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        System.out.println("\n BMI of Each Person is");
        for (int i = 0; i < totalPerson; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Height: " + personData[i][1] + " meters");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("BMI: " + String.format("%.2f", personData[i][2]));
            System.out.println("Weight Status: " + weightStatus[i]);
        }

        
    }
}
