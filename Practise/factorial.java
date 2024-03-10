import java.util.Scanner;
public class factorial {
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number to Find Factorial ");
        int number=input.nextInt();
        int extra=number;
        int result=1;
        for( ;number>=2;number--)
        {
            if (extra==number) 
            {
                result=(number)*(number-1);
            }
            else
            {
                result=result*(number-1);
            }

        }
        System.out.println(result);
    }
}
