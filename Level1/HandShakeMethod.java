// Import Scanner class for taking the user input in the program.
import java.util.Scanner;

// Create a class HandShakeMethod for calculating the maximum number of handshakes
public class HandShakeMethod{
	//Function returning the  maximum number of handshakes possible
	public static int handshakes(int students){
		return (students*(students - 1))/2;
	}

    public static void main(String args[]) {

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Create the variable for the number of students
        System.out.println("Enter the number of students:");
        int students = sc.nextInt();

        // Calculate the maximum number of handshakes using the method.
        int maxHandshakes = handshakes(students);

        // Print the maximum number of handshakes
        System.out.println("The maximum number of handshakes among " + students + " students is " + maxHandshakes);

    }
}
