//Import Scanner class for taking the user input in program.
import java.util.Scanner;

//Create class SpringSeasonMethod to check the spring season.
class SpringSeasonMethod{
	// Function to heck if the date is within the Spring season (March 20 to June 20)
	public static String springOrNot(int month , int day){
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            return "It's a Spring Season.";
        } 
		else{
            return "Not a Spring Season."; 
        }
	}
    public static void main(String[] args){
        // Declare variables to store month and day
        int month, day;
        
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        //Input the month and day
        System.out.print("Enter month (1-12): ");
        month = sc.nextInt();
        
        System.out.print("Enter day (1-31): ");
        day = sc.nextInt();
		
		//Print the result by calling method
		System.out.println(springOrNot(month,day));
        
    }
}
