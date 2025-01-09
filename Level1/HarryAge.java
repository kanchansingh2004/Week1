 // Create HarryAge Class to compute the age of harry by performing substraction with birth year and current year.
 class HarryAge{
	 
	public static void main(String args[])
	{
		// Create a variable name to indicate the harry's birth year.
		int birthYear = 2000;
		
		// Create a variable name to indicate the current year.
		int currentYear = 2024;
		
		// Create a variable name to calculate the harry's age as of 2024.
		int age = currentYear-birthYear;
		
		// Print the Age as of 2024
		System.out.println("Harry's age in 2024 is "+ age);
	}
}