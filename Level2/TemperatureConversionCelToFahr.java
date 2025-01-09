//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a class TemperatureConversionCelToFahr for converting Celsius to Fahrenheit
public class TemperatureConversionCelToFahr{

    public static void main(String args[]){

        //Create object of scanner class sc for taking input.
        Scanner sc = new Scanner(System.in);

        // Create a variable for Celsius and take user input
        System.out.println("Enter the temperature in Celsius:");
        double celsius = sc.nextDouble();

        // Perform the conversion from Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Print the result in Fahrenheit
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");

    }
}
