//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a class FactorSumSquareProduct for calculate the Factor, their sum, product and Squared sum of a number.
class FactorSumSquareProduct{
	
	//Function for storing factors in an arrays
	public static int[] factorArray(int number){
		//First count the factor for array size
		int count = 0;
		for (int i = 1; i <= number; i++){
            if (number % i == 0) {
                count++;
            }
        }
		
		//Storing factors by computing modulus.
		int arr[] = new int[count];
		int index = 0;
		for (int i = 1; i <= number; i++){
            if (number % i == 0) {
                arr[index] = i;
				index++;
            }
        }
		
		//Display factors
		System.out.println("Factors are : ");
		for (int i = 0; i < count; i++){
            System.out.print(arr[i] +" ");
        }
		
		System.out.println();
		
		
		return arr;
	}
	
	//Method to calculate sum.
	public static int sumArray(int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
		
		return sum;
	}
	
	//Method to calculate sum of squares.
	public static int sumOfSquare(int[] arr){
		int sumSquare = 0;
		for (int i = 0; i < arr.length; i++){
            sumSquare += Math.pow(arr[i],2);
        }
		
		return sumSquare;
	}
	
	//Method to calculate the product.
	public static long productArray(int[] arr){
		long product = 1;
		for (int i = 0; i < arr.length; i++){
            product *= arr[i];
        }
		
		return product;
	}
	
	
	public static void main(String args[]){
		//Taking user input.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		//Declare array to store factors returned by function factorArray.
		int arr[] = factorArray(number);
		
		//Display the results.
		System.out.println("The sum of the factors using factors array is: " + sumArray(arr));
		System.out.println("The product of the factors using factors array is: " + sumOfSquare(arr));
		System.out.println("The sum of square of the factors is: " + productArray(arr));
	}
}