//Import Scanner class for taking the user input in program.
import java.util.Scanner;

//Create class FindingRoots to find the roots of the equation ax2+ bx + c.
public class FindingRoots{

    // Method to calculate the roots of a quadratic equation using variable a, b and c
    public static double[] findingRoots(double a, double b, double c){
		// Calculating the discriminant i.e delta
        double delta = Math.pow(b, 2)-4*a*c; 

        if (delta > 0){
            // Calculating and return two distinct real roots and store in variable root 1 and root 2
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1,root2};
        } 
		else if(delta == 0){
            // Calculating and return one real root
            double root = -b/(2*a);
            return new double[]{root};
        } 
		else{
            // Calculating and return empty array as no real roots that is delta is negative .
            return new double[0]; 
        }
    }

    public static void main(String[] args){
		 // Create Scanner class object and take input from the number.
		Scanner sc = new Scanner(System.in);
		
        // Create variable for user input a, b, and c to calculate the roots.
        System.out.print("Enter value1: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value2: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value3: ");
        double c = scanner.nextDouble();

        // Calling function to find the roots and store in array.
        double[] roots = findingRoots(a, b, c);

        // Display the results
        if (roots.length == 0){
            System.out.println("The equation has no real roots.");
        } 
		else if (roots.length == 1){
            System.out.println("The equation has one root: " + roots[0]);
        } 
		else{
            System.out.println("The equation has two roots: " + roots[0] + " and " + roots[1]);
        }
    }
}