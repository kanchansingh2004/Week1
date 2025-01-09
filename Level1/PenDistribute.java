// Create a class PenDistribute for calculating the remaining pens and pens for each person.

public class PenDistribute{
	
	public static void main(String args[]){
		
		//Create the variable for the total number of Pens.
		int totalPens = 14;
		
		//Create the variable for total number of students.
		int totalStudents = 3;
		
		//Create the variable for calculating remaining Pens.
		int remainingPens = totalPens % totalStudents;
		
		//Create the variable for calculating pens for each person.
		int pensPerPerson = totalPens / totalStudents;
		
		//Print the remaining pen and pen per person
		System.out.println(" The Pen Per Student is "+ pensPerPerson+" and the remaining pen not distributed is "+ remainingPens);
		
		
	}
}