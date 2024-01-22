import java.util.Scanner;

public class tut_018_switch_case {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age=input.nextInt();
        switch (age) {
            case 18:
                System.out.println("Age is 18");
                break;
            case 20:
                System.out.println("Age is 20");
                break;
            case 25:
                System.out.println("Age is 25");
                break;
        
            default:
                System.out.println("Not in list");
                break;
        }
        char ch='d';
        switch (ch) {
            case 'r':
                System.out.println("its r");
                break;
        
            default:
                System.out.println("its not r");
                break;
        }
        //method 2
        int var=20;
        switch (var) {
            case 15->System.out.println("matched 15");
            case 20->System.out.println("matched 20");
            default->System.out.println("Not Mathced");
        }
    }
}
