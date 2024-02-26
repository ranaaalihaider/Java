import java.util.Scanner;
public class tut_03{
    public static void main(String [] args){
        System.out.println("Grade Finder");
        Scanner input= new Scanner(System.in);
        int marks;
        System.out.println("Enter Your Marks");
        marks = input.nextInt();
        if (marks>50) {
            System.out.println("You are Pass");
            
        }
        else if( marks>30){
            System.out.println("You Need to Improve");

        }
        else{
            System.out.println("You are Fail");
        }

    }
}