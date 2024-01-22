import java.util.Scanner;

public class tut_018_else_if {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age=input.nextInt();
        if (age>56) {
            System.out.println("You are experienced");
        }
        else if (age>40) {
            System.out.println("You are semi Experience");
        }
        else if (age>30) {
            System.out.println("You are new commer");
        }
        else{
            System.out.println("You are too young");
        }
        if (age>10) {
            System.out.println("You are also not a child");
            
        }
    }
}
