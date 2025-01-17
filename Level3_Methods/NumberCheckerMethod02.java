//Import Scanner class for taking the user input in the program.
import java.util.Scanner; 

//Creating the class NumberCheckerMethod02
public class NumberCheckerMethod02{

    // Create a method to find the count of digits in the number
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0){
            num /= 10;
            count++;
        }
        return count;
    }

	// Create a method to reverse the digits array of the number 
    public static int[] reverseArray(int[] digitArray){
        int[] reversed = new int[digitArray.length];
        for (int i = 0; i < digitArray.length; i++){
            reversed[i] = digitArray[digitArray.length - 1 - i];
        }
        return reversed;
    }

    // Create a method to store the digits of the number in an array
    public static int[] getDigitArray(int num) {
        int count = countDigits(num);
        int[] digitArray = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digitArray[i] = num % 10;
            num /= 10;
        }
        return digitArray;
    }


    // Create a method to check if a number is a palindrome using its digits
    public static boolean isPalindrome(int[] digitArray){
        int[] reversed = reverseArray(digitArray);
        return compareArrays(digitArray, reversed);
    }

    // Create a method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int[] digitArray) {
        for (int digit : digitArray) {
            if (digit == 0) {
                return true; 
            }
        }
        return false; 
    }
	
	
    // Create a method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array, int[] reversedArray){
        if (array.length != reversedArray.length){
            return false;
        }
        for(int i = 0; i < array.length; i++){
            if (array1[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //Creating object of Scanner class for taking input 
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the Number");
		int num = sc.nextInt();

        // Get the digits array
        int[] digitArray = getDigitArray(num);

        // Reverse the digits array 
        int[] reversed = reverseArray(digitArray);

        // Check if the number is a palindrome or not
        boolean palindrome = isPalindrome(digitArray);

        // Check if the number is a duck number or not
        boolean duckNumber = isDuckNumber(digitArray);

        // Display the results
        System.out.println("Number: " + num);
        System.out.println("Digits Array: " + Arrays.toString(digitArray));
        System.out.println("Reversed Array: " + Arrays.toString(reversed));
        System.out.println("Is Palindrome: " + (palindrome ? "Yes" : "No"));
        System.out.println("Is Duck Number: " + (duckNumber ? "Yes" : "No"));
    }
}
