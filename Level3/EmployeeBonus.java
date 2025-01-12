//Import Random class for taking random values
import java.util.Random;

//Create a class EmployeeBonus to compute the bonus of an employee.
public class EmployeeBonus{

    // Create a method to generate random salary and years of service for 10 employees
    public static double[][] generateEmployeeData(){
        Random random = new Random();
		
		// 2D Array to store salary and years of service
        double[][] employeeData = new double[10][2]; 
        
        for (int i = 0; i < 10; i++){
            double salary = 50000 + (random.nextInt(50000) + 1); 
            int yearsOfService = random.nextInt(15); 
            employeeData[i][0] = salary; 
            employeeData[i][1] = yearsOfService; 
        }
        return employeeData;
    }

    // Create a method to calculate the new salary and bonus based on the service years
    public static double[][] calculateBonusAndSalary(double[][] employeeData){
		
		//Create an array for updated Employee Data.
        double[][] updatedEmployeeData = new double[10][3];
        
        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus = 0;
            double newSalary = oldSalary;
            
            // Determine bonus based on years of service
            if (yearsOfService >= 5) {
                bonus = oldSalary * 0.05; 
            } else {
                bonus = oldSalary * 0.02; 
            }
            
			// Add bonus to the old salary
            newSalary += bonus; 
            
			// New salary after bonus
            updatedEmployeeData[i][0] = newSalary; 
			
			// Bonus amount
            updatedEmployeeData[i][1] = bonus;  

			// Old salary			
            updatedEmployeeData[i][2] = oldSalary; 
        }
        return updatedEmployeeData;
    }

    // Create a method to calculate and display the sum of the old salary, new salary, and total bonus
    public static void calculateTotalSalariesAndBonus(double[][] updatedEmployeeData){
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        
        System.out.println("Employee Data (Old Salary, New Salary, Bonus):\n");
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Employee", "Old Salary", "New Salary", "Bonus");

        for (int i = 0; i < 10; i++) {
            double oldSalary = updatedEmployeeData[i][2];
            double newSalary = updatedEmployeeData[i][0];
            double bonus = updatedEmployeeData[i][1];
            
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
            
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f\n", i + 1, oldSalary, newSalary, bonus);
        }
        
        // Display the total amounts
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus Amount: " + totalBonus);
    }

    public static void main(String[] args) {
        // Generate random employee data (salary and years of service)
        double[][] employeeData = generateEmployeeData();
        
        // Calculate new salary and bonus for each employee
        double[][] updatedEmployeeData = calculateBonusAndSalary(employeeData);
        
        // Calculate and display total salaries and bonus amounts
        calculateTotalSalariesAndBonus(updatedEmployeeData);
    }
}
