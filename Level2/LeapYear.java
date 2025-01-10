//Import Scanner class for taking the user input in program.
import java.util.Scanner; 

// Create LeapYear class to check if a year is a Leap Year
public class LeapYear
{
    public static void main(String[] args){
        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create variable for user to enter a year for checking the Leap Year
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        // Check if the year is valid by applying condition year>1582.
        if (year < 1582){
            System.out.println("Please enter a year greater than or equal to 1582.");
        } 
		
		else{
			
            // Check if the year is divisible by 4 but not divisible by 100, unless it is divisible by 400 by using if statement with OR condition.
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                // If the year satisfies the leap year conditions
                System.out.println(year + " is a Leap Year.");
            } 
			else{
                // If the year does not satisfy the leap year conditions
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }
}

