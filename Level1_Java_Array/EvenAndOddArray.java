//Import Scanner class for taking the user input in program.
import java.util.Scanner; // Import Scanner to take user input.

// Create EvenAndOddArray class to print odd and even numbers between 1 and the number entered by the user.
class EvenAndOddArray{
    public static void main(String[] args){
        
		//Create object of scanner class sc for taking input in a variable num.
        Scanner sc = new Scanner(System.in); 
        
        // Create variable num for user to enter a natural number.
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
		
		//Initializing the even and odd array to store values.
		int[] even = new int[(num/2)+1];
        int[] odd = new int[(num/2)+1];
		
		int j = 0, l = 0;
		
        // Check if the entered number is a nartural integer.
        if (num <= 0){
            System.out.println("Error occured : Please enter a nartural integer!!.");
        }

		else{
            // Iterate through numbers from 1 to the entered number using a for loop.
            for (int i = 1; i <= num; i++){
				
                // Check if the current number is odd or even.
                if (i % 2 == 0){
                    // If the number is divisible by 2 the number even and storing it in even array.
                    even[l] = i;
					l++;
                }
				else{
                    // else the number is odd and storing it in odd array.
                    odd[j] = i;
					j++;
                }
            }
        }
		
		//Printing the even number array
		System.out.println("Printing the even number array:");
		for(int i = 0; i<even.length; i++){
			System.out.print(even[i]+" ");
		}
		
		//To start a new line.
		System.out.print("\n");
	
		//Printing the odd number array
		System.out.println("Printing the odd number array:");
		for(int i = 0; i<odd.length; i++){
			System.out.print(odd[i]+" ");
		}
    }
}
