//Import Scanner class for taking the user input in program.
import java.util.Scanner; 

// Create Bonus class to calculate bonus based on years of service and salary of the employee.
class Bonus{
    public static void main(String[] args){
        
		// Create a Scanner object to take input from the user.
        Scanner sc = new Scanner(System.in);		
        
        // Take user input for salary of the employee.
        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble(); 
        
		// Take years of service value as input.
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = sc.nextInt(); 
        
        // Check if years of service is greater than 5 to check the bonus eligibility.
        if (yearsOfService > 5){
			
            // Calculate the bonus as 5% of salary of employee
            double bonus = salary * 0.05;
            System.out.println("The employee's bonus is INR " + bonus);
        } 
		else{
			
            // If years of service is 5 or less than 5 then no bonus is given to employee
            System.out.println("The employee is not eligible for a bonus.");
        }
    }
}
