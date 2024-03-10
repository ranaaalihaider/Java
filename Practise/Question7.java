import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num1=input.nextInt();
        System.out.println("Enter Number 2");
        int num2=input.nextInt();
        System.out.println("Enter Number 3");
        int num3=input.nextInt();
        if ((num1>num2)&&(num1>num3)) 
        {
            if (num2>num3)
            {
                System.out.printf("Your Output in decreasing order is %d %d %d",num1,num2,num3);
            }
            else if (num3>num2) 
            {
                System.out.printf("Your Output in decreasing order is %d %d %d",num1,num3,num2);
            }
        }
        else if ((num2>num3)&&(num2>num1)) 
        {
            if (num3>num1)
            {
                System.out.printf("Your Output in decreasing order is %d %d %d",num2,num3,num1);
            }
            else if (num1>num3)
            {
                System.out.printf("Your Output in decreasing order is %d %d %d",num2,num1,num3);
            }
        }
        else if ((num3>num1)&&(num3>num2))
        {
            if (num1>num2) {
                System.out.printf("Your Output in decreasing order is %d %d %d",num3,num1,num2);
            }
            else if (num2>num1) {
                System.out.printf("Your Output in decreasing order is %d %d %d",num3,num2,num1);
            }
        }
    }
}
