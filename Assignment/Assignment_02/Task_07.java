import java.util.Scanner;
public class Task_07 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number =input.nextInt();
        checker(number);
            
        

    }
    public static void checker (int number)
    {
        int reult=0;
        for (int i=1; i<number; i++)
        {
            if (number%i==0) 
            {
                reult+=i;
            }
        }
        if (number==reult) 
        {
            System.out.println("Its Perfect Number ");
        }
        else
        {
            System.out.println("Its Not Perfect Number ");
        }

    }
}
