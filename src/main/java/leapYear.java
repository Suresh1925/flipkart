public class leapYear {

    public static void main(String[] args) {
        // Specify the year directly
        int year = 2024;

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Function to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        // A leap year is divisible by 4
        // If it is a century, it must also be divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
