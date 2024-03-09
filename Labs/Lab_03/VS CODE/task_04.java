import java.util.Scanner;
public class task_04 {
    public static void main(String[] args) {
        System.out.println("Enter Number of Minutes");
        Scanner input=new Scanner(System.in);
        int minutes=input.nextInt();
        int hours=minutes/60;
        int remaningMinutes=minutes%60;
        System.out.println("Now Time after Mid-Night is "+hours+" "+remaningMinutes);
    }
}
