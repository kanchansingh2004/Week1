import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create class ArrayIndexOutOfBounds to check and generate exception
public class ArrayIndexOutOfBounds{
	
	//Create generateException using try and catch block, accessing the element at length+1 index
	public static void generateException(String[] str){
		try{
		System.out.println("Output the string array: ");
		for(int i=0; i<=5; i++){
			System.out.print(str[i] + " ");
		}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("\nHandled the exception ArrayIndexOutOfBoundsException");
		}
	}
	
	public static void main(String args[]){
		//Scanner class object to input string value.
		System.out.println("Enter a string array: ");
		Scanner sc = new Scanner(System.in);
		String[] str = new String[5];    //Supposing size 5.
		
		//Running loop to get names as input
		for(int i = 0; i<5 ; i++)
		{
			str[i] = sc.next();
		}
		
		//Calling method generateException to generate and handle the exception.
		generateException(str);

		sc.close();
	}
}