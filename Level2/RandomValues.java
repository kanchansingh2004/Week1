//Create RandomValues class.
public class RandomValues{

    // Create method to generate 4 Digit number for Random Array.
    public static int[] generate4DigitRandomArray(int size){
        int[] numbers = new int[size];

        // Generating random 4-digit numbers from 1000 to 9999.
        for (int i = 0; i < size; i++){
			// Random number between 1000 and 9999 using Math.random function
            numbers[i] = (int) (Math.random() * 9000) + 1000;  
        }
		//return the array numbers
        return numbers;
    }

    // Create method to find the average, min, and the max value of array numbers
    public static double[] findAverageMinAndMax(int[] numbers){
		// Create array to store average, min, and max
        double[] result = new double[3]; 

        int sum = 0;
        int min = numbers[0], max = numbers[0];

        // Calculate the sum, min, and max using function min andmax
        for (int number : numbers){
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        // Calculate the average of the numbers.
        double average = sum / (double) numbers.length;

        // Store results for min, max, and average.
        result[0] = average; 
        result[1] = min;      
        result[2] = max;      

		//return result.
        return result;
    }

    public static void main(String args[]){
        // Calling function to generate 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Print the generated numbers
        System.out.println("Generated 4-digit random numbers:");
        for (int number : randomNumbers){
            System.out.print(number + " ");
        }
		
        System.out.println();

        // Find the average, min, and max values
        double[] result = findAverageMinAndMax(randomNumbers);

        // Display the results
        System.out.println("The average of numbers is: " + result[0]);
        System.out.println("The minimum value is: " + result[1]);
        System.out.println("The maximum value is: " + result[2]);
    }
}