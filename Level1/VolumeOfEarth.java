// Create a class VolumnOfEarth for computing the volume of Earth in km^3 and miles^3.
public class VolumeOfEarth{
	
	public static void main(String args[]){
		
		//Create the variable for Radius of earth.
		float radius = 6378f;
		
		//Create the variable for Volume of sphere of earth in km^3.
		double volumeInKm = (4f/3f)*Math.PI*radius*radius*radius;
		
		//Create the variable for Radius of earth in miles.
		radius = 6378f/1.6f;
		
		//Create the variable for Volume of sphere of earth in km^3.
		double volumeInMiles = (4f/3f)*Math.PI*radius*radius*radius;
		
		
		//Print volume of sphere of earth in km^3 and miles^3.
		System.out.println("The volume of earth in cubic kilometers is "+volumeInKm+" and cubic miles is "+volumeInMiles);
		
		
	}
}