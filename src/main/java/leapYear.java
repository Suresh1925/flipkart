public class leapYear {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java LeapYearCommandLine <year>");
            System.exit(1);
        }

        int year = Integer.parseInt(args[0]);
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
