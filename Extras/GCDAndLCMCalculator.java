import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create a class GCDAndLCMCalculator to calculate the GCD and LCM
public class GCDAndLCMCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking sc from the user for two numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calculating the GCD and LCM using functions
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        // Displaying the results
        displayResult(gcd, lcm);
        sc.close();
    }

    // Method to calculate the Greatest Common Divisor (GCD)
    public static int calculateGCD(int num1, int num2) {
        // Using Euclidean algorithm to calculate GCD
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1; // Return the GCD
    }

    // Method to calculate the Least Common Multiple (LCM)
    public static int calculateLCM(int num1, int num2, int gcd) {
        return (num1 * num2) / gcd; // Formula: LCM = (num1 * num2) / GCD
    }

    // Method to display the results
    public static void displayResult(int gcd, int lcm) {
        System.out.println("The Greatest Common Divisor (GCD) is: " + gcd);
        System.out.println("The Least Common Multiple (LCM) is: " + lcm);
    }
}
