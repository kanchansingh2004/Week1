// Create a class Payment for calculating the the discounted amount and discounted price the student will pay for the course.
public class Payment{
	
	public static void main(String args[]){
		
		//Create the variable for fees.
		int fees = 125000;
		
		//Create the variable for discount percent.
		int discountPercent = 10;
		
		//Create the variable for calculating the discount .
		int discountedPrice = (fees*discountPercent)/100 ;
		
		//Create the variable for calculating discounted price.
		int finalFees = fees-discountedPrice;
		
		//Print the Final price student need to pay.
		System.out.println("The discount amount is INR "+discountedPrice+ " and final discounted fee is INR "+finalFees);
		
		
	}
}