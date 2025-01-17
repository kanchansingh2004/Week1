//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a NaturalNumberSum class for calculating natural number sum using recursion and formula.
public class NaturalNumberSum{

	//function to compute using recursion.
    public static int sumUsingRecursion(int n){
        if (n == 1){
            return 1;
        } 
		else{
            return n + sumUsingRecursion(n - 1);
        }
    }
	//function to compute using formula
    public static int sumUsingFormula(int n){
        return n*(n + 1)/2;
    }

    public static void main(String args[]){
		
         // Create Scanner class object and take input from the number.
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

		//Check condition for valid number
        if (n <= 0){
            System.out.println("Please enter a valid natural number!!.");
            return;
        }

		//calling function of recursion in variable recursiveSum
        int recursiveSum = sumUsingRecursion(n);
		
		//calling function of formula in variable formulaSum.
        int formulaSum = sumUsingFormula(n);

		//Print the result 
        System.out.println("Sum of the first " + n + " natural numbers (using recursion): " + recursiveSum);
        System.out.println("Sum of the first " + n + " natural numbers (using formula): " + formulaSum);


		//Condition to compare the two results
        if (recursiveSum == formulaSum){
            System.out.println("Both results are correct and equal.");
        } 
		else{
            System.out.println("The results of two methods are different.");
        }
    }
}