public class leapYear {
  public static void main(String[]args){
    int year=Integer.parseInt(args[0]);
    if(year%4==0){
      System.out.println("It is a Leap Year");
    }
    else {
      System.out.println("It is not a leap year");
    }
  }
}