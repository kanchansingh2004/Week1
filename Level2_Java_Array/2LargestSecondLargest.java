// Import Scanner class for taking user input in the program.
import java.util.Scanner;

// Create a class to find the largest and the second-largest digits from a number
public class LargestSecondLargest {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Define the number variable and take user input for the number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Initialize maxDigit variable to set the initial array size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];  
        int index = 0;  

        // Running loop to extract digits from the number and store them in the array
        while (number != 0){ 
			// Break the loop if the array size exceeds maxDigit
            if (index == maxDigit){
                maxDigit += 10;
				
				// Create a temporary array with the new size
                    int[] temp = new int[maxDigit];

                    // Copy elements from the current digits array to the temp array
                    for (int j = 0; j < digits.length; j++){
                        temp[j] = digits[j];
                    }

                    // Assign the temp array back to the digits array
                    digits = temp;
                }
				
			// Get the last digit of the number and add it to the array
            digits[index] = (int)number % 10;
            number /= 10;  
            index++; 
        }
        

        // Variables to store the largest and second largest digits
        int largest = -1, secondLargest = -1;

        // Loop through the digits array to find the largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
			else if (digits[i] > secondLargest && digits[i] != largest){
                secondLargest = digits[i];
            }
        }

        // Display the largest and second largest digits
        if (secondLargest != -1 && largest != -1){
            System.out.println("The largest digit is: " + largest +"\nThe second largest digit is: " + secondLargest);
        } 
		else{
			System.out.println("All digits are same");
		}
		
	}
}
