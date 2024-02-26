import java.util.Scanner;
public class tut_06{
    public static void main(String [] args){
        System.out.println("Grade Finder");
        Scanner input= new Scanner(System.in);
        double marks=input.nextDouble();
        char grad=64;
        //Using And Satatements
        if (marks>50 && marks<60) {
            System.out.println("D");
            
        }
        else if (marks>=60 && marks<70){
            System.out.println(grad);
        }
        else if(marks>=70 && marks<80){
            System.out.println("B");

        }
        else if(marks>=80){
            System.out.println("A");

        }
    }
}