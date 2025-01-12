import java.util.Scanner; //Import Scanner class for taking the user input in the program.

public class EuclideanDistanceEquation{

    // Method to find the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to find the equation of the line given two points
    public static double[] findEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2];
        
        // Calculate slope
        double m = (y2 - y1) / (x2 - x1);
        
        // Calculate y-intercept
        double b = y1 - m * x1;
        
        // Store the slope and y-intercept in the array
        equation[0] = m; 
        equation[1] = b; 
        
		//Return the equation
        return equation;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs for the points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
		
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
		
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
		
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Calculate Euclidean distance and find line equation 
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between the points: " + distance);

        double[] equation = findEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + equation[0] + "x + " + equation[1]);
        
		//Close the Scanner
        sc.close();
    }
}
