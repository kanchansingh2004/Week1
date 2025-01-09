 // Creating Sam's_result Class to compute the marks of Sam's by performing average of marks.
 class SamResult{
	 
	public static void main(String args[])
	{
		// Create a variable to declare Sam's Maths marks.
		int maths = 94;
		
		// Create a variable to declare Sam's Physics marks.
		int physics = 95;
		
		// Create a variable to declare Sam's Chemistry marks.
		int chemistry = 96;
		
		// Create a variable to calculate the Sam's average marks.
		float marks = (physics+chemistry+maths)/3.0f;
		
		// Printing the average marks of Sam
		System.out.println("Sam's marks is "+ marks);
	}
}