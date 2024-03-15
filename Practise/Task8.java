import java.util.Scanner;
public class Task8 
{   

    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int count=1;
        int max=0;
        int result=0;
        while (true)
        {
            System.out.printf("Enter Number %d : ",count);
            int number=input.nextInt();
            if (number==0)
            {
                break;
            }
            if (count==1) 
            {
                max=number;
            }
            if (number>max)
            {
                max=number;
                result++;
            }
            else
            {
                max=number;
            }
            count++;

        }
        System.out.printf("%d numbers are greater than their previous numbers ",result);
    }
}
