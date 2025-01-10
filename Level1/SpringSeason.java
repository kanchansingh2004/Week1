//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create SpringSeason class to check if the input date falls in the Spring season or not.
class SpringSeason{
    public static void main(String[] args){
        
        
        // Create a Scanner object to take input from the user.
        Scanner sc = new Scanner(System.in);
        
        // Taking input for the month
        System.out.print("Enter month (1-12):");
        int month = sc.nextInt();
        
		// Taking input for the day
        System.out.print("Enter day (1-31):");
        int day = sc.nextInt();
        
        // Check if the date is within the Spring season (March 20 to June 20) using the if else statement
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20))
            System.out.println("It's a Spring Season.");
        
		else 
            System.out.println("Not a Spring Season.");
        
    }
}
