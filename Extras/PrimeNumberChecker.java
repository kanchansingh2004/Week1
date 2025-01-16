import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create a class PrimeNumberChecker to check prime numbers
public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Calling the method to check if the number is prime
        boolean isPrime = checkPrime(number);

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        sc.close();
    }

    // Method to check if a number is prime
    public static boolean checkPrime(int num) {
        // Numbers less than 2 are not prime
        if (num <= 1) {
            return false;
        }

        // Check for factors other than 1 and the number itself
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If a factor is found, it's not prime
            }
        }

        return true; // If no factors are found, it's prime
    }
}
