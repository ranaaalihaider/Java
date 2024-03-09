import java.util.Scanner;

public class tut_25_02_practise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Range to Get Sum of even numbers : ");
        int range=input.nextInt();
        int result=0;
        for(int i=0; i<=range ;i=i+2){
            result=result+i;
        }
        System.out.println("Sum of even Numbers upto "+ range+" are given below");
        System.out.println(result);
    }
}
