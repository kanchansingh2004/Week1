//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a UnitConvertor class for converting the units given.
class UnitConvertor{
	//Method to convert Yards To Feet .
	static double convertYardsToFeet(double yards){
		return yards * 3.00;
	}
	
	//Method to convert feet to yards .
	static double convertFeetToYards(double feet){
		return feet * 0.333333;
	}
	
	//Method to convert meters to inches.
	static double  convertMetersToInches(double meter){
		return meter * 39.3701;
	}
	
	//Method to convert inches to meters.
	static double  convertInchesToMeters(double inches){
		return inches * 0.0254;
	}
	
	//Method to convert inches to centimeters.
	static double convertInchesToCentimeters(double inches){
		return inches * 2.54;
	}
	
    public static void main(String[] args) {
        
        // Create Scanner class object and take input from the number.
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for yards: ");
        double yards = sc.nextDouble();
		//Print the result.
        System.out.println(yards + " yards to feet is "+convertYardsToFeet(yards));
		
		System.out.println("Enter value for feet: ");
        double feet = sc.nextDouble();
		//Print the result.
        System.out.println(feet + " feet to yards is "+convertFeetToYards(feet));
		
		System.out.println("Enter value for Meter: ");
        double meter = sc.nextDouble();
		//Print the result.
        System.out.println(meter + " meters to inches is "+convertMetersToInches(meter));
		
		System.out.println("Enter value for inches: ");
        double inches = sc.nextDouble();
		//Print the result.
        System.out.println(inches + " inches to meters is "+convertInchesToMeters(inches));
		
		System.out.println("Enter value for inches: ");
        inches = sc.nextDouble();
		//Print the result.
        System.out.println(inches + " inches to centimeters is "+convertInchesToCentimeters(inches));
    }
}
