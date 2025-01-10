//Import Scanner class for taking the user input in program.
import java.util.Scanner; 

// Create a class TallestOne to find the youngest and tallest friend
public class TallestOne{

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for ages and heights of the three friends
        System.out.println("Enter the age and height (in cm) of Amar:");
        int ageAmar = input.nextInt();
        int heightAmar = input.nextInt();

        System.out.println("Enter the age and height (in cm) of Akbar:");
        int ageAkbar = input.nextInt();
        int heightAkbar = input.nextInt();

        System.out.println("Enter the age and height (in cm) of Anthony:");
        int ageAnthony = input.nextInt();
        int heightAnthony = input.nextInt();

        // Find the youngest friend based on age
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = "";

        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } 
		else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } 
		else {
            youngestFriend = "Anthony";
        }

        // Find the tallest friend based on height
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = "";

        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } 
		else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } 
		else {
            tallestFriend = "Anthony";
        }

        // Display the results for height comparision
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm.");

        
    }
}
