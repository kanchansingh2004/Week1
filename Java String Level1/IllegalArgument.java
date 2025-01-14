import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create class IllegalArgument to check and generate exception
public class IllegalArgument{
	
	//Method to generate and handle the exception using try and catch.
	public static void generateException(String str){
		int start = str.length()-1;
		int end = 0;
		try{
			validSubStringArgs(start,end);
		System.out.println("Output the subString: " + str.substring(start , end));
		
		}catch(IllegalArgumentException e){
			System.out.println("\nThe start is greater than end so subString have Illegal Arguments");
			System.out.println("\nHandled the exception IllegalArgumentException");
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
	
	//Create method to check validity of sub string.
	public static void validSubStringArgs(int start, int end){
		if(start>end)
			throw new IllegalArgumentException("Start must be smaller than end.");
	}
}