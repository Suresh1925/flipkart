public class my_first {
    public static void main(String[] args){
        int year=Integer.parseInt(args[0]);
        if(year%4==0){
            System.out.println("It is a Leap yaer");
        }
        else{
            System.out.println("It is not a Leap Year");
        }
    }
}
