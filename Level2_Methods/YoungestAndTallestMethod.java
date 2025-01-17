//Import Scanner class for taking the user input in the program.
import java.util.Scanner;

//Create a public class YoungestAndTallestMethod to compare the heights and ages
public class YoungestAndTallestMethod{

    // Create method to find the youngest among amar akbar and anthony.
    public static String findYoungest(int[] ages){
        int minAge = ages[0];
        String youngest = "Amar";
        
        // Compare ages to find the minimum(youngest)
        for (int i = 1; i < ages.length; i++){
            if (ages[i] < minAge){
                minAge = ages[i];
                if (i == 1) 
					youngest = "Akbar"; 
                else if (i == 2)
					youngest = "Anthony";
            }
        }
		//Return the results
        return youngest;
    }

    // Create method to find the tallest friend among the three based on their heights
    public static String findTallest(double[] heights){
        double maxHeight = heights[0];
        String tallest = "Amar";
        
        // Compare heights to find the maximum (tallest)
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight){
                maxHeight = heights[i];
                if (i == 1) 
					tallest = "Akbar"; 
                else if (i == 2) 
					tallest = "Anthony"; 
            }
        }
		
		//Return results
        return tallest;
    }

    public static void main(String[] args) {
		 // Create sc class object and take input.
		Scanner sc = new Scanner(System.in);
        
        // Arrays to store age and height of the 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take input for ages and store in array ages
        System.out.print("Amar's age: ");
        ages[0] = sc.nextInt();
        System.out.print("Akbar's age: ");
        ages[1] = sc.nextInt();
        System.out.print("Anthony's age: ");
        ages[2] = sc.nextInt();

        // Take input for height and store in array heights
        System.out.print("Amar's height (in cm): ");
        heights[0] = sc.nextDouble();
        System.out.print("Akbar's height (in cm): ");
        heights[1] = sc.nextDouble();
        System.out.print("Anthony's height (in cm): ");
        heights[2] = sc.nextDouble();

        // Obtain the youngest and the tallest friend using methods
        String youngest = findYoungest(ages);
        String tallest = findTallest(heights);
        
        // Display the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        sc.close();
    }
}