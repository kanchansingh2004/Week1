import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create a class TemperatureConverter to convert celcius to fahrenheit vice versa.
public class TemperatureConverter {

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; 
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; 
    }
    public static void main(String[] args) {
        // Taking input from the user for the temperature and conversion choice
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter 1 to convert from Fahrenheit to Celsius, or 2 to convert from Celsius to Fahrenheit: ");
        int choice = sc.nextInt();

        // Calling the appropriate function based on user input and displaying the result
        if (choice == 1) {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit is equal to " + celsius + " Celsius.");
        } 
        else if (choice == 2) {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
        } 
        else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }
        sc.close();
    }
}
