//Import Arrays class for using various functions in the program.
import java.util.Arrays;
import java.util.Scanner;

//Create class NumberChecker01 to perform various operations
public class NumberChecker01{
    // Method to find the count of digits in a number
    public static int countDigits(int num){
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    // Method to store digits of the number in a digits array
    public static int[] getDigitArray(int num){
        int count = countDigits(num);
        int[] digitArray = new int[count];
        for (int i = count - 1; i >= 0; i--){
            digitArray[i] = num % 10;
            num = num / 10;
        }
        return digitArray;
    }

    // Method to find the sum of digits in the number
    public static int sumOfDigits(int[] digitArray){
        int sum = 0;
        for (int digit : digitArray){
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of digits of the number
    public static int sumOfSquares(int[] digitArray){
        int sum = 0;
        for (int digit : digitArray) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int num, int[] digitArray){
        int sum = sumOfDigits(digitArray);
        return num % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digitArray){
        int[][] frequencyArray = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequencyArray[i][0] = i; 
        }
        for (int digit : digitArray) {
            frequencyArray[digit][1]++; 
        }
        return frequencyArray;
    }

    public static void main(String args[]){
        
		//Create an object of class Scanner for variable num.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
        // Call methods and display results
        int count = countDigits(num);
        int[] digitArray = getDigitArray(num);

        int sum = sumOfDigits(digitArray);
        int sumSquares = sumOfSquares(digitArray);
        boolean isHarshad = isHarshadNumber(num, digitArray);
		
		//Create 2D array for storing the frequency of digits 
        int[][] frequency = digitFrequency(digitArray);

        // Print results
        System.out.println("Number: " + num);
        System.out.println("Count of digits: " + count);
        System.out.println("Digits array: " + Arrays.toString(digitArray));
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares of digits: " + sumSquares);
        System.out.println("Is Harshad number: " + (isHarshad ? "Yes" : "No"));
        System.out.println("Digit Frequencies:");
		
		//Print the frequency of each digit in the number.
        for (int[] freq : frequency){
            if (freq[1] > 0){
                System.out.println("Digit: " + freq[0] + ", Frequency: " + freq[1]);
            }
        }
    }
}
