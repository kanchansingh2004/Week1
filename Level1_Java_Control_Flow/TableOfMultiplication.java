//Import Scanner class for taking the user input in program.
import java.util.Scanner; 

// Create TableOfMultiplication class to find the multiplication numbers for a number from 6 to 9.
class TableOfMultiplication{
    public static void main(String[] args){
        
        //Create object of scanner class sc for taking input
        Scanner sc = new Scanner(System.in); 
        
		//Create variable num for a input number.
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        
        // Using for loop calculate and print the multiplication table from 6 to 9.
        for (int i = 6; i <= 9; i++){
			
            // Print the multiplication result.
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}
