import java.util.Scanner;
public class tut_07 {
    public static void main(String[] args) {
        System.out.println("Enter Marks  :");
        Scanner input=new Scanner(System.in);
        int marks=input.nextInt();
        /* 
        if (marks !=50) {
            System.out.println("Not Equall to 50");
            
        }
        else{
            System.out.println("Equall to 50");
        }
        */
        if (!(marks<50)) {
            System.out.println("You are Pass");
            
        }
        else{
            System.out.println("You are Fail");
        }
    }
}
