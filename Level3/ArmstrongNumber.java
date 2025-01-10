// Import Scanner to read user input
import java.util.Scanner;

// Create a ArmstrongNumber class to check if input number is Armstrong or not.
public class ArmstrongNumber{
	
    public static void main(String[] agrs){
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in); 

         // Create num variable for user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 

        // Create a variable of newNumb to store the user input number to the newNumb.
        int newNumb = number;

        //Create a variable result and assign it to 0 as value.
        int result = 0; 

        // Calculate the Armstrong through a while loop with a condition that numher should not equal to 0.
        while(number != 0){
			
            //Create a variable remainder that storesult the remainder of the variable number when we divide the number by 10.
            int remainder = number % 10;

            //find the cube of the of the remainder and add to result of the variable
            result = result + (int)Math.pow(remainder,3);

            //Here we divide the number by 10 to remove the last digit of the number and again store it in the number variable.
            number = number / 10;
        }
		
		
        //After the loops ends, we check the value of newNumb variable and result varibale.
        if(newNumb == result){	
            //if this condition is true,then print its Armstrong number.
            System.out.println("The number "+newNumb+" is an Armstrong number");
        }
		
		else{
			//if this condition is false,then print its not an Armstrong number.
            System.out.println("The number "+newNumb+" is not an Armstrong number");
        }
    }
}


