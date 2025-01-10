//Import Scanner class for taking the user input in program.
import java.util.Scanner; 

// Create a class BMICalculator to calculate BMI of a person
public class BMICalculator{

    public static void main(String[] args){

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Create variable taking user input for weight in kilograms
        System.out.println("Enter your weight in kilograms:");
        double weight = input.nextDouble();

        //  Create variable taking user user input for height in centimeters
        System.out.println("Enter your height in centimeters:");
        double heightInCm = input.nextDouble();

        // Convert height from cm to meters
        double heightInMeters = heightInCm / 100;

        // Calculate BMI using the formula
        double bmi = weight / (heightInMeters * heightInMeters);

        // Print the BMI result
        System.out.println("Your BMI is: %.2f%n", bmi);

        // Determine weight status based on BMI
        if (bmi <= 18.4){
            System.out.println("Status: Underweight");
        } 
		else if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Status: Normal");
        } 
		else if (bmi >= 25.0 && bmi <= 39.9){
            System.out.println("Status: Overweight");
        } 
		else if (bmi >= 40.0){
            System.out.println("Status: Obese");
        }

    }
}
