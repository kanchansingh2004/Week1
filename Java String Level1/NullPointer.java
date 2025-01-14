//Create class NullPointer to check and generate exception
public class NullPointer{

	public static void demostrateException(String str){
		// Generate a NullPointerException using try and catch block by extracting the length
        try {
            System.out.println("The length of the string is: " + getLength(str));
        } catch (NullPointerException e){
            System.out.println("\nAttempted to access a null object. " + e.getMessage());
			System.out.println("\nHandled the exception NullPointerException");
        }
		
	}
    public static void main(String[] args){
        String str = null; // A string variable is declared but not initialized
        
		//Calling method demostrateException to generate and handle the exception.
		demostrateException(str); 
    }

    // Method to get the length of a string
    public static int getLength(String str){
		
        // This will throw NullPointerException if str is null
        return str.length();
    }
}
