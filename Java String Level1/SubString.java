//import the class Scanner 
import java.util.*;

//Create class Compare2charArray for comparing two strings 
public class Compare2charArray{
	
	// Create a stringByMethod method for checking substring using user defined method  
	public static String substringByMethod(String str1 , int start , int end){
		String sub = "";
		//Add the array element
		for (int i = start ; i < end ; i++ ){
			sub += str1.charAt(i);
		}
	
		return sub;
	}
	
	public static void main(String args[]){
		
		//Initiating Scanner class for taking user input as string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str1 = sc.next();
		
		System.out.println("Enter the start index: ");
		int start = sc.nextInt();
		
		System.out.println("Enter the end index: ");
		int end = sc.nextInt();
		
		//Calling stringBybuiltIn method 
		String stringBybuiltIn = str1.substring(start , end);
		
		//Calling stringByMethod method
		String stringByMethod = substringByMethod(str1,start,end);
		
		//printing both substring from method as well as builtin 
		System.out.println("The result from stringBybuiltIn is : "+stringBybuiltIn);
		System.out.println("The result from stringByMethod is : "+stringByMethod);
		
		//Comparing the results from both builtin and charAt() 
		if(stringBybuiltIn.equals(stringByMethod)){
			System.out.println("Substrings are same using both bulitin and using charAt method.");
		}
		else{
			System.out.println("The results are different for generating the sub strings.");
		}
		
	}
	
}