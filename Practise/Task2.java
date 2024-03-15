import java.util.Scanner;
public class Task2 
{
    public static void main(String[] args)
    {   
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number to get Factoral : ");
        int number=input.nextInt();
        int result=1;
        for(int i=1; i<=number;i++)
        {
            result=result*i;
        }
        System.out.println("Your Factorial is "+result);
    }
}
