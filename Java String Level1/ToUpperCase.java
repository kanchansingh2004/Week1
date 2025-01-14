import java.util.Scanner; //Import Scanner class for taking the user input in the program

//Create class ToUpperCase to convert the string in upper case.
public class ToUpperCase{
	//Create method upperCaseConversion to convert lowercase to uppercase
	public static String upperCaseConversion(String str){
		
		String temp = "";
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>=97 && str.charAt(i)<=122){
				temp = temp + (char)(str.charAt(i)-32);
			}
			else{
				temp = temp + str.charAt(i);
			}
		}
		
		return temp;
	}
	
	//In built function for converting to uppercase
	public static String upperCaseUsingInBuilt(String str){
		return str.toUpperCase();
	}
	
	public static void main(String args[]){
		//Scanner class object to input string.
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//Storing result in 2 variables
		String result1 = upperCaseConversion(str);
		String result2 = upperCaseUsingInBuilt(str);
		
		//Compare the two results.
		if(result1.equals(result2)){
			System.out.println("Result 1 : " + result1 + "\nResult 2 : " + result2);
			System.out.println("The results are same with and without the built function");
		}
		else{
			System.out.println("Result 1 : " + result1 + "\nResult 2 : " + result2);
			System.out.println("The results are not same with and without the built function");
		}
	}
}