import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create class StringIndexOutOfBounds to check and generate exception
public class StringIndexOutOfBounds{
	
	//Create generateException method for performing the exception handling.
	public static void generateException(String str){
		//Using try and catch block
		try{
		System.out.println("Output the string: ");
		for(int i=0; i<=str.length(); i++){
			System.out.print(str.charAt(i) + " ");
		}
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("\nError: Trying to access element at index higher than string size");
			System.out.println("\nHandled the exception StringIndexOutOfBoundsException");
		}
	}
	
	public static void main(String args[]){
		//Scanner class object to input string value.
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//Calling method generateException to generate and handle the exception.
		generateException(str);
	}
}