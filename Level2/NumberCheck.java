//Import Scanner class for taking the user input in program.
import java.util.Scanner;

//Create class NumberCheck to performe comparision
public class NumberCheck{

    // Create method to check if a number is positive or negative and return a string
    public static String isPositive(int number){
        if(number > 0) {
            return "Positive";
        } 
		else if(number < 0){
            return "Negative";
        } 
		else{
            return "Zero";
        }
    }

    // Create a method to check if a number is even or odd
    public static String isEven(int number){
        if (number % 2 == 0){
            return "Even";
        }
		else{
            return "Odd";
        }
    }

    // Create a method to compare two numbers.
    public static int compare(int number1, int number2) {
        if(number1 > number2){
            return 1;
        } 
		else if(number1 == number2){
            return 0;
        } 
		else{
            return -1;
        }
    }

    public static void main(String[] args) {
		
       // Create sc class object and take input.
		Scanner sc = new Scanner(System.in);

        // Array numbers to store 5 numbers
        int[] numbers = new int[5];

        // Take user input for the 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        // Loop through the array and check whether the number is positive or negative
        for (int i = 0; i < numbers.length; i++){
            int num = numbers[i];
            System.out.println("Number " + (i + 1) + ": " + num);

            // Check if the number is positive, negative, or zero using variable positiveOrNegative
            String positiveOrNegative = isPositive(num);
            System.out.println(positiveOrNegative);

            // If positive, check if it's even or odd
            if (posNeg.equals("Positive")){
                String evenOrOdd = isEven(num);
                System.out.println(evenOrOdd);
            }
        }

        // Compare the first and last elements of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        int comparisonResult = compare(first, last);

        if(comparisonResult == 1){
            System.out.println("The first element is greater than the last element.");
        } 
		else if(comparisonResult == 0){
            System.out.println("The first element is equal to the last element.");
        } 
		else{
            System.out.println("The first element is less than the last element.");
        }

        sc.close();
    }
}