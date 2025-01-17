//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a UnitConvertor class for converting the units given.
class UnitConvertor{
	//Method to convert Farhenheit To Celsius.
	public static double convertFarhenheitToCelsius(double farhenheit){
		return ((farhenheit - 32) * 5) / 9;
	}
	
	//Method to convert Celsius to Fahrenheit.
	public static double convertCelsiusToFahrenheit(double celsius){
		return ((celsius * 9) / 5) + 32;
	}
	
	//Method to convert Pounds to kilograms .
	public static double convertPoundsToKilograms(double pounds){
		return pounds * 0.453592;
	}
	
	//Method to convert Kilograms to Pounds.
	static double  convertKilogramsToPounds(double kilograms){
		return kilograms * 2.20462;
	}
	
	//Method to convert Gallons To Liters.
	static double convertGallonsToLiters(double gallons){
		return gallons * 3.78541;
	}
	
	//Method to convert Liters to Gallons.
	static double convertLitersToGallons(double liters){
		return liters * 0.264172;
	}
	
    public static void main(String[] args) {
        
        // Create Scanner class object and take input from the number.
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for farhenheit: ");
        double farhenheit = sc.nextDouble();
		//Print the result.
        System.out.println(farhenheit + " Fahrenheit to Celsius is "+convertFarhenheitToCelsius(farhenheit));
		
		System.out.println("Enter value for celsius: ");
        double celsius = sc.nextDouble();
		//Print the result.
        System.out.println(celsius + " Celsius to Fahrenheit "+convertCelsiusToFahrenheit(celsius));
		
		System.out.println("Enter value for pounds: ");
        double pounds = sc.nextDouble();
		//Print the result.
        System.out.println(pounds + " pounds to Kilograms is "+convertPoundsToKilograms(pounds));
		
		System.out.println("Enter value for kilograms: ");
        double kilograms = sc.nextDouble();
		//Print the result.
        System.out.println(kilograms + " kilograms to pounds is "+convertKilogramsToPounds(kilograms));
		
		System.out.println("Enter value for gallons: ");
        double gallons = sc.nextDouble();
		//Print the result.
        System.out.println(gallons + " gallons to liters is "+convertGallonsToLiters(gallons));
		
		System.out.println("Enter value for liters: ");
        double liters = sc.nextDouble();
		//Print the result.
        System.out.println(liters + " liters to gallons is "+convertLitersToGallons(liters));
    }
}
