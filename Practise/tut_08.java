import java.util.Scanner;
public class tut_08{
    public static void main(String[] args) {
        System.out.println("Enter Marks  :");
        Scanner input=new Scanner(System.in);
        int marks=input.nextInt();
        int marks2=input.nextInt();
        if (marks>50 || marks2>50){
            System.out.println("You are pass");

        }
        else{
            System.out.println("You are FAIL");
        }

    }
}