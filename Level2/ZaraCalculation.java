//Import Scanner class for taking the user input in the program.
import java.util.Scanner; 

// Create ZaraCalculation class to calculate and display bonus for employees
public class ZaraCalculation{
    public static void main(String args[]){
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Define arrays to store salary and years of service of 10 employees
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];

        // Define arrays to store bonus, new salary
        double[] bonus = new double[10];
        double[] newSalaryOfZara = new double[10];

        // Variables to calculate the total bonus 
        double totalBonus = 0;
		
		// Variables to calculate the total old salary
        double totalOldSalary = 0;
		
		//Variables to calculate the total new salary
        double totalnewSalaryOfZara = 0;

        // Loop to take input for salary and years of service for 10 employees
        for (int i = 0; i < 10; i++){
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();

            // Validate the salary taken as input
            if (salary[i] <= 0){
                System.out.println("Please enter a valid positive salary.");
                i--; 
                continue;
            }

            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = sc.nextInt();

            // Validate the years of service input
            if (yearsOfService[i] < 0){
                System.out.println("Please enter a valid number .");
                i--;
                continue;
            }
        }

        // Loop to calculate bonus and new salary, and accumulate total values
        for (int i = 0; i < 10; i++) {
            // Calculate the bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; 
            } 
			else{
                bonus[i] = salary[i] * 0.02;
            }

            // Calculate the new salary (old salary + bonus)
            newSalaryOfZara[i] = salary[i] + bonus[i];

            // Update total bonus 
            totalBonus += bonus[i];
			
			//Update total old salary
            totalOldSalary += salary[i];
			
			//Update total new salary
            totalnewSalaryOfZara += newSalaryOfZara[i];
        }

        // Print the total bonus payout, total old salary, and total new salary
        System.out.println("\nTotal Bonus Payout: " + totalBonus +"\nTotal Old Salary of all employees: " + totalOldSalary + "\nTotal New Salary of all employees : " + totalnewSalaryOfZara);
		

        // Display the result
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1) + " - Salary: " + salary[i] +", Years of Service: " + yearsOfService[i] + ", Bonus: " + bonus[i] + ", New Salary: " + newSalaryOfZara[i]);
        }

    }
}
