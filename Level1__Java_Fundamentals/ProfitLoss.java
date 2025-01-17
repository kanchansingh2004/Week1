 // Creating profit_Loss Class to compute the profit and loss in number and percentage based on the cost price.

 class ProfitLoss{
	 
	public static void main(String args[])
	{
		// Create a variable to declare the cost price.
		float costPrice=129;
		
		// Create a variable to declare the selling price.
		float sellingPrice=191;
		
		// Create a variable to compute the profit.
		float profit=sellingPrice-costPrice;
		
		// Create a variable to calculate the profit percentage.
		float profit_Percentage=(profit/costPrice)*100.00f;
		
		// Printing the result
		System.out.println("The Cost Price is INR "+costPrice+" and Selling Price is INR "+sellingPrice+"\n The profit is INR "+profit+" and the profit Percentage is "+profit_Percentage);
	}
}