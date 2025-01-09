// Import Scanner class for taking input
import java.util.Scanner;

// Create a class TemperatureConversion for converting Fahrenheit to Celsius.
public class TemperatureConversion{

    public static void main(String args[]){

        //Create object of scanner class sc for taking input.
        Scanner sc = new Scanner(System.in);

        // Create a variable fahrenheit and take user input for it.
        System.out.println("Enter the temperature in Fahrenheit:");
        double fahrenheit = sc.nextDouble();

        // Perform the conversion from Fahrenheit to Celsius.
        double celsiusResult = (fahrenheit-32)*5/9;

        // Print the result.
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");
    }
}
