//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a class for computing natural number.
class NaturalNumberSumMethod {
	//Method to sum the natural number using a for loop for computation.
	static int sum(int number){
		int sum = 0 ;
		for(int i = 1; i <= number ; i++ ){
			sum += i ; 
		}
		return sum;
	}
	
    public static void main(String[] args) {
        // Declare a variable to store the input number
        int number;
        
        // Create Scanner class object and take input from the number.
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        
		//Print the result.
        System.out.println("Sum: "+sum(number));
    }
}
