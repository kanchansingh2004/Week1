//Import Random class for taking  random values.
import java.util.Random; 

//Create a Class FootBallDetails for finding the short, tallest meam height of the football player 
public class FootBallDetails{
	
		//Create a Function sumOfHeight to calculate the sum 
		public static int sumOfHeight(int[] height){
			int sum = 0 ;
			for (int i = 0 ; i < height.length ; i ++){
				sum += height[i];
			}
			return sum; 
		}
		
		//Create a Function meanHeight to calculate the mean 
		public static double meanHeight(int sum,int[] height){
			return sum / height.length;
		}
		
		//Create a Function shortestHeight to find the shortest player 
		public static int shortestHeight(int[] height){
			int shortestHeight = Integer.MAX_VALUE;
			for (int i = 0; i < height.length ; i++){
				if (height[i]<shortestHeight){
					shortestHeight = height[i];
				}
			
			}
			return shortestHeight;
		}
		
		//Create a function tallestHeight to find the tallest player 
		public static int tallestHeight(int[] height){
			int tallestHeight = 0;
			for (int i = 0; i < height.length ; i++){
				
				if (height[i]>tallestHeight){
					tallestHeight = height[i];
				}
			}
			return tallestHeight;
		}
		
		public static void main(String args[]){
			
			//Create an array to store heights.
			int[] height = new int[11]; 
			Random random = new Random();

			// Calculate the array with random heights between 150 and 250
			for (int i = 0; i < height.length; i++) {
				height[i] = 150 + random.nextInt(101); // Generate random numbers between 150 and 250
			}
			
			//Calling functions to find the sum, shortestHeight, tallestHeight, meanHeight of player.
			int sum = sumOfHeight(height);
			int shortestHeight = shortestHeight(height);
			int tallestHeight = tallestHeight(height);
			double meanHeight = meanHeight(sum,height);
			
			//Display the results
			System.out.println("Sum of height : "+sum +"\nMean Height : "+meanHeight+"\nTallest height : " + tallestHeight+"\nShortest height : " + shortestHeight);
		}
}