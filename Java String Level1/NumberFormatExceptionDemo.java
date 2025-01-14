import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create class NumberFormatExceptionDemo to check and generate exception
public class NumberFormatExceptionDemo{

	public static void demostrateException(String str){
		// Generate a NumberFormatException
		try{
            // Attempt to parse the input text
            System.out.println("Parsed number: " + Integer.parseInt(str));
        } catch (NumberFormatException e){
            // Handle NumberFormatException with message
            System.out.println("Invalid input. '" + str + "' is not a valid number.");
			System.out.println("\nHandled the exception NumberFormatException");
        } catch (RuntimeException e){
            // Handle any other runtime exception
            System.out.println("A runtime exception occurred: ");
        }
		
	}
    public static void main(String[] args){
		//Scanner class object to input string value.
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
		
		//Calling method demostrateException to generate and handle the exception.
		demostrateException(str); 
    }
}
