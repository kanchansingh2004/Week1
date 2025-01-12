import java.util.Scanner; //Import Scanner class for taking the user input in the program.
import java.util.Arrays; //Import Arrays for using various array functions

//Creating the class numberCheckerMethod03
public class numberCheckerMethod03{

    // Create a method to check if a number is prime or not using for loop
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Create a method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Create a method to check if a number is a spy number or not
    public static boolean isSpy(int number){
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Create a method to check if a number is an automorphic number or not
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return Integer.toString(square).endsWith(Integer.toString(number));
    }

    // Create a method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String args[]){
        
			//Creating object of Scanner class for taking input 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number");
			int number = sc.nextInt();
        
			//Print the results.
            System.out.println("number: " + number);
            System.out.println("Is Prime: " + (isPrime(number) ? "Yes" : "No"));
            System.out.println("Is Neon: " + (isNeon(number) ? "Yes" : "No"));
            System.out.println("Is Spy: " + (isSpy(number) ? "Yes" : "No"));
            System.out.println("Is Automorphic: " + (isAutomorphic(number) ? "Yes" : "No"));
            System.out.println("Is Buzz: " + (isBuzz(number) ? "Yes" : "No"));
    }
}
