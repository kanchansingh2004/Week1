import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create class LengthOfString to calculate string size by user define method
public class LengthOfString{
	
	//Method to calculate size using try and catch block
	public static int lengthOfStringTryCatch(String str){
		int count = 0;
		try{
			while(true){
			char ch = str.charAt(count);
			count++;
			}
		}catch (StringIndexOutOfBoundsException e){
			return count;
		}
		
	}
	
	public static void main(String args[]){
		//Scanner class object to input string.
		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//Store size result in variables
		int result1 = lengthOfStringTryCatch(str);
		int result2 = str.length();
		
		//Compare and print the result 
		if(result1 == result2){
			System.out.println("The length by user define method is : " + result1+ " and the length by inbuilt method is : " + result2);
			System.out.println("The results are same using both methods");
		}
		else{
			System.out.println("The length by user define method is : " + result1+ " and the length by inbuilt method is : " + result2);
			System.out.println("The results are not same using both methods");
			}
	}
}