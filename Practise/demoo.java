import java.util.Scanner;

public class demoo {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        // part (a)
        int num1,num2;
        /*System.out.print("Enter num1: ");
        num1 = in.nextInt();
        System.out.print("Enter num2: ");
        num2 = in.nextInt();
        for(int i=num1;i<=num2;i++)
            System.out.print(i+" "); */ 
        // part (b)
        System.out.print("Enter num1: ");
        num1 = in.nextInt();
        System.out.print("Enter num2: ");
        num2 = in.nextInt();
        if (num1<=num2){
            for(int i=num1;i<=num2;i++)
            System.out.print(i+" ");
        }
        else
            for(int i=num1;i>=num2;i--){
                System.out.print(i+" ");
            }
    }
}
