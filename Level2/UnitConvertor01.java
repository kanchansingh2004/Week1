//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a UnitConvertor class for converting the units given.
class UnitConvertor{
	//Method to convert kmmeters to miles .
	static double km2Miles(double km){
		return km * 0.621371;
	}
	
	//Method to convert miles to kmmeters .
	static double miles2km(double miles){
		return miles * 1.60934;
	}
	
	//Method to convert meters to feet.
	static double meters2feet(double meter){
		return meter * 3.28084;
	}
	
	//Method to convert feet to meters.
	static double feet2meters(double feet){
		return feet * 0.3048;
	}
	
    public static void main(String[] args) {
        
        // Create Scanner class object and take input from the number.
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for kmmeter: ");
        double km = sc.nextDouble();
		//Print the result.
        System.out.println(km + " kmmeters to miles is "+km2Miles(km));
		
		System.out.println("Enter value for Miles: ");
        double miles = sc.nextDouble();
		//Print the result.
        System.out.println(miles + " miles to kmmeters is "+miles2km(miles));
		
		System.out.println("Enter value for Meter: ");
        double meter = sc.nextDouble();
		//Print the result.
        System.out.println(meter + " meters to feet is "+meters2feet(meter));
		
		System.out.println("Enter value for Feet: ");
        double feet = sc.nextDouble();
		//Print the result.
        System.out.println(feet + " feet to meters is "+feet2meters(feet));
    }
}
