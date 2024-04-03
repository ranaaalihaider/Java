import java.util.Scanner;
public class Task_08 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Decimal Number to get Binary output : ");
        long number=input.nextLong();
        long binaryNumber=converter(number);
        System.out.print("Your Binary output is : "+binaryNumber);
    }
    public static long converter(long number)
    {
        if (number ==0) 
        {
            return 0;
        }
        else
        {
            return number%2 +10*converter(number/2);
        }

    }
}
