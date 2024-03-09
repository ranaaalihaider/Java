import java.util.Scanner;

public class tut_019_04_leap_year {
    public static void main(String[] args) {
        System.out.print("Enter Year to Check Leap or not : ");
        Scanner input=new Scanner(System.in);
        int year=input.nextInt();
        if ((year%4==0 && year%100 !=0) ||(year%100==0 && year%400==0)||(year%4==0 && year%100 ==0 && year%400==0)) {
            System.out.println("Year is leap");
        }
        else{
            System.out.println("Year is not leap");
        }
    }
}
