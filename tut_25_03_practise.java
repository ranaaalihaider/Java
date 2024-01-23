import java.util.Scanner;

public class tut_25_03_practise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number to Get Factorial : ");
        int number=input.nextInt();
        int result=1;
        int multiple=1;
        while (multiple<=number) {
            result=result*multiple;
            multiple=multiple+1;
        }
            
    System.out.println(result);
    }
}
