//Import Scanner class for taking the user input in the program.
import java.util.Scanner; 

//Creating the class NumberCheckerMethod 
public class NumberCheckerMethod{
	
	//Method to count the number of digits present.
	public static int countDigit(int num){
		int count = 0 ;
		while (num != 0){
			num = num/10; 
			count++;
		}
		return count;
	}
	
	//Method to store the digits in the array.
	public static int[] digitArray(int num, int count){
		int[] digitArray = new int[count];
		for (int i = 0 ; i < count ; i ++){
			int element = num%10;
			digitArray[i] = element;
			num = num/10;
		}
		
		return digitArray;
	}
	
	//method to check if number is a duck number or not.
	public static String checkDuckNumber(int[] digitArray){
		boolean checkDuckNumber = true; 
		for (int i : digitArray){
			if (i == 0){
				checkDuckNumber = false ;
				break;
			}
		}
		if (checkDuckNumber){
			return "It\'s Duck Number\n";
		}
		else{
			return "It\'s not a Duck Number\n";
		}
	}
	
	//method to check if number is a armstrong number.
	public static String checkArmstrongNumber(int[] digitArray,int num,int count){
		int temp = 0 ;
		
		for (int i:digitArray){
			temp += Math.pow(i,count);
		}
		
		if(temp == num){
			return "The number is an armStrong Number\n";
		}
		else{
			return "The number is not an armStrong Number\n";
		}
	}
	
	//method to find the largest and the Second Largest in the digit array
	public static String largestSecondLargest(int[] digits , int index){
		// Variables to store the largest and second largest digits
        int largest =  Integer.MIN_VALUE; 
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the digits array to find the largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
		return "Largest: " + largest + "\n" + "SecondLargest: "+secondLargest;
	}
	
	//method to find the smallest and the Second smallest in the digit array
	public static String smallestSecondSmallest(int[] digits , int index){
		// Variables to store the smallest and second smallest 
        int smallest =  Integer.MAX_VALUE; // Initializing to -1 assuming non-negative digits
        int secondSmallest = Integer.MAX_VALUE;

        // Loop through the digits array to find the smallest and smallest second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
		return "\nSmallest: " + smallest + "\n" + "SecondLargest: "+secondSmallest ;
	}
	
	
	public static void main(String args[]){
		//Creating object of Scanner class for taking input 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int count = countDigit(num);
		
		int[] digitArray = digitArray(num,count);
		
		//Calling functions to perform the various operations.
		String checkDuckNumber = checkDuckNumber(digitArray);
		
		String armstrong = checkArmstrongNumber(digitArray,num,count);
		
		String largestAndSecondLargest = largestSecondLargest(digitArray,count);
		
		String smallestAndSecondSmallest = smallestSecondSmallest(digitArray,count);
		
		//Print the results 
		System.out.println("Number: " + num + "\n" + "Count of digit: "+count+ "\n\n" + checkDuckNumber + "\n" + armstrong + "\n" + largestAndSecondLargest + "\n" + smallestAndSecondSmallest );
		
	}
}