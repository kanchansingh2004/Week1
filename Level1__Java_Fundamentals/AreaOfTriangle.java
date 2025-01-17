// import Scanner class for taking input
import java.util.Scanner;

// Create a class AreaOfTriangle for converting to find area of a triangle in square inches and square centimeters.
public class AreaOfTriangle {

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Creating the variable for height and base through user input
        System.out.println("Enter the height of triangle in centimeters:");
        double height = sc.nextDouble();
		
		System.out.println("Enter the base of triangle in centimeters:");
		double base = sc.nextDouble();

        // Create a variable to find area of triangle in square centimeters.
        double areaInCm	= 0.5 * base * height;

        // Converting the area of triangle in inches.
        double areaInInches	= areaInCm/(2.54*2.54);

        // Print the base and height and the area of triangle.
        System.out.println("The area of the triangle is "+areaInCm+" square centimeters and "+areaInInches+" square inches.");

        
    }
}