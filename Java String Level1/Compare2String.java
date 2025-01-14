import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create class Compare2String to see result two different approaches are same or not.
public class Compare2String{

	//Method to compare and return result for string 1 and string 2.
	public static boolean compare(String str1, String str2){
		
		if(str1.length() != str2.length())
			return false;
		
		for(int i=0;i<str1.length();i++){
		if(str1.charAt(i) != (str2.charAt(i))){
			return false;
			}
		}
		return true;
	}
	
	//Method using in built function.
	public static boolean compareUsingInBuilt(String str1, String str2){
		return str1.equals(str2);
	}

	public static void main(String args[]){
		//Scanner class object to input two strings.
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		//Compare and call functions for results.
		if(compare(str1,str2) == compareUsingInBuilt(str1,str2)){
			System.out.println("The results are same when using chartAt() and in built function");
		}
		else{
			System.out.println("The results are different when using chartAt() and in built function");
		}
	}
		
		
}