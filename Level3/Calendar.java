import java.util.Scanner; //Import Scanner class for taking the user input in the program.

//Create class Calendar to display a calendar for a given month and year.
public class Calendar{

    // Array to store the names of the months
    static final String[] months = {"January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"};

    // Array to store the number of days in each month
    static final int[] daysInMonth ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	// Create a method to calculate the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int year, int month) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
    }
	
    // Create a method to check if a year is a leap year
    public static boolean isLeapYear(int year){
        if (year % 4 == 0){
            if (year % 100 == 0){
                return year % 400 == 0;
            } 
			else{
                return true;
            }
        }
        return false;
    }

    // Create a method to get the number of days in a month
    public static int getDaysInMonth(int month, int year){
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Create a method to display the calendar
    public static void displayCalendar(int month, int year) {
        // Get the number of days in the month
        int days = getDaysInMonth(month, year);

        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(year, month);

        // Print the month and year
        System.out.printf("     %s %d%n", months[month - 1], year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print initial spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print all days of the month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }

        // Print a new line at the end
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Create variable month and year to take input from the user.
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Display the calendar
        displayCalendar(month, year);
    }
}
