import java.util.Scanner; //Import Scanner class for taking the user input in the program

//Create class ToLowerCase to convert the string in Lowercase.
public class ToLowerCase{
	
	//Create method lowerCaseConversion to convert uppercase to lowercase
	public static String lowerCaseConversion(String str){
		String temp = "";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>=65 && str.charAt(i)<=90){
				temp = temp + (char)(str.charAt(i)+32);
			}
			else{
				temp = temp + str.charAt(i);
			}
		}
		return temp;
	}
	
	//In built function for converting to lowercase
	public static String lowerCaseUsingInBuilt(String str){
		return str.toLowerCase();
	}
	
	public static void main(String args[]){
		//Scanner class object to input string.
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//Storing result in 2 variables
		String result1 = lowerCaseConversion(str);
		String result2 = lowerCaseUsingInBuilt(str);
		
		//Compare the two results checking if both give same result or not.
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