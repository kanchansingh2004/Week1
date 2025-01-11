//Import Scanner class for taking the user input in the program.
import java.util.Scanner; 

// Create YoungestAndTallest class to calculate bonus based on years of service and salary of the employee.
class YoungestAndTallest{
    public static void main(String[] args){
        
		// Create a Scanner object to take input from the user.
        Scanner sc = new Scanner(System.in);
		
		//// Declare an array to store age and height.
		int[] age = new int[3];
		double[] height = new double[3];
		
		String[] names = {"Amar", "Akbar", "Anthony"};
		int youngest = 0
		double tallest = 0.0;
		
		//Running for loop to store age and height .
		for (int i=0; i<3; i++){
			System.out.print("Enter the age: ");
			age[i] = sc.nextInt();
			
			System.out.print("Enter the height: ");
			height[i] = sc.nextDouble();
		}
		
		//Running loop to compare the age and height.
		for(int i=1; i<3; i++){
			if(age[i]<=age[i-1]){
				youngest = i;
			}
			
			if(height[i]>=height[i-1]){
				tallest = i;
			}
		}
		
		//Print the youngest and tallest.
		System.out.println("The youngest is: "+ names[youngest] + "\n The tallest is: "+ names[tallest] );
		
	}
}