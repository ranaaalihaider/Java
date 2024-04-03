import java.util.Scanner;
public class Task_04 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        while (true) 
        {
            System.out.print("Enter Number of Lines : ");
        int number =input.nextInt();
        if (number>=1 && number<=10) 
        {
            pattern(number);
            break;
        }
        else
        {
            System.out.println("Wrong Input Try Agin !");
        }
        }
        
    }
    public static void pattern(int number)
    {
        for (int i=1;i<=number;i++)
        {
            for(int j=number;j>i;j--)
            {
                System.out.print("   ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.printf("%3d",k);
            }
            for(int l=2;l<=i;l++)
            {
                System.out.printf("%3d",l);
            }
            System.out.println("");
        }
    }
}
