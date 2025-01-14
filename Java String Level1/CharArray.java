import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create class CharArray to see result with two different approaches.
public class CharArray{

	//Method to compare and return result for string by comparing each element
	public static boolean compare(char[] arr1, char[] arr2){
		
		for(int i=0;i<arr1.length;i++){
			if(arr1[i] != arr2[i])
				return false;
		}
		
		return true;
		
	}
	
	//Method using in built function.
	public static char[] arrayUsingInBuilt(String str){
		return str.toCharArray();
	}
	
	//Method using for loop to create character array.
	public static char[] array(String str){
		char[] arr = new char[str.length()];
		for(int i=0;i<str.length();i++){
			arr[i] = str.charAt(i);
		}
		
		return arr;
	}

	public static void main(String args[]){
		//Scanner class object to input string.
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//Compare and call functions for results.
		char[] arr1 = array(str);
		char[] arr2 = arrayUsingInBuilt(str);
		
		if(compare(arr1,arr2)){
			System.out.println("The length of arr1 is : " + arr1.length + " and arr2 is : " + arr2.length);
			System.out.println("The results are same when using character array and in built function");
		}
		else{
			System.out.println("The length of arr1 is : " + arr1.length + " and arr2 is : " + arr2.length);
			System.out.println("The results are not same when using character array and in built function");
		}
		
	}
}