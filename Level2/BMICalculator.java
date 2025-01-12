//Import Scanner class for taking the user input in the program.
import java.util.Scanner;

//Create class to calculate the Body Mass Index (BMI) of all the persons in the team of 10 members.
public class BMICalculator{

    // Create method to calculate BMI for each person and Store in the 2D array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++){
			//first column for weight.
            double weight = data[i][0];
			
			//second column for height
            double heightInCm = data[i][1];
			
			// Convert height from cm to meters
            double heightInMeters = heightInCm / 100; 
			
			// BMI formula to calculate
            double bmi = weight / (Math.pow(heightInMeters, 2)); 
			
			//third column for BMI
            data[i][2] = bmi;
        }
    }

    // Method to determine the BMI status
    public static String[] determineBMIStatus(double[][] data){
		//String array to store status.
        String[] status = new String[data.length];
		
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } 
			else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } 
			else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } 
			else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Create 2D array to store weight, height, and BMI for each person
        double[][] data = new double[10][3]; 

        // Taking input for weight and height of 10 persons
        for (int i = 0; i < 10; i++) {
            System.out.println("\n Enter details for Person " + (i + 1));
            System.out.print("Enter weight (in kg): ");
            data[i][0] = scanner.nextDouble(); 
            System.out.print("Enter height (in cm): ");
            data[i][1] = scanner.nextDouble(); 
        }

        // Calculate BMI for all persons
        calculateBMI(data);

        // Check BMI status
        String[] status = determineBMIStatus(data);
		
		//Print result.
		System.out.println("Weight (kg)\tHeight (cm)\tBMI\tStatus");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s\n", data[i][0], data[i][1], data[i][2], status[i]);
        }
    }
}