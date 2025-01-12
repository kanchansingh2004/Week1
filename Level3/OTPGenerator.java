//Import Arrays class for using the sort function in the program.
import java.util.Arrays;

//Create class OTPGenerator to generate a six-digit OTP number. 
public class OTPGenerator{

    // Create method to generate a 6-digit OTP using Math.random() between 100000 and 999999
    public static int generateOTP(){
        return (int)(Math.random() * 900000) + 100000;
    }

    // Create a method to generate 10 OTPs and save them in an array
    public static int[] generateMultipleOTPs(int count) {
        int[] otpArray = new int[count];
        for (int i = 0; i < count; i++) {
            otpArray[i] = generateOTP();
        }
        return otpArray;
    }

    // Method to check if OTPs are unique
    public static boolean areOTPsUnique(int[] otpArray) {
        Arrays.sort(otpArray);
		
		for(int i=1; i<otpArray.length; i++){
			if(otpArray[i] == otpArray[i-1])
				return false;
		}
		
		return true;
    }

    public static void main(String args[]){
        // Number of OTPs to generate
        int otpCount = 10;

        // Generate 10 OTPs
        int[] otpArray = generateMultipleOTPs(otpCount);

        // Display the generated OTPs
        System.out.println("Generated OTPs:");
        for (int i=0; i<otpArray.length; i++) {
            System.out.println(otpArray[i]);
        }

        // Check if OTPs are unique
        boolean unique = areOTPsUnique(otpArray);
        System.out.println("\nAre all OTPs unique? " + (unique ? "Yes" : "No"));
    }
}
