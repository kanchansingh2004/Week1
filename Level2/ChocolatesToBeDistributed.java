//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a class ChocolatesToBeDistributed for calculating the chocolates for each children and remaining chocolates.
public class ChocolatesToBeDistributed{
	
	public static void main(String args[]){
		
		//Create object of scanner class sc for taking input.
		Scanner sc = new Scanner(System.in);
		
		//Create the variable totalChocolates for the total number of chocolates.
		System.out.println("Enter the number of chcolates: ");
		int totalChocolates = sc.nextInt();
		
		//Create the variable totalChildrens for total number of childrens.
		System.out.println("Enter the number of childrens: ");
		int totalChildrens = sc.nextInt();
		
		//Create the variable chocolatesPerChildren for calculating chcolates for each children.
		int chocolatesPerChildren = totalChocolates / totalChildrens;
		
		//Create the variable remainingChocolates for calculating remaining chcolates after the distribution.
		int remainingChocolates = totalChocolates % totalChildrens;
		
		//Print the remaining pen and pen per person
		System.out.println(" The number of chocolates each child gets is "+ chocolatesPerChildren+" and the number of remaining chocolates are "+ remainingChocolates);
		
		
	}
}