import java.util.Scanner;
public class task1_iii 
{
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        System.out.print("How Much Number you want to sum ? : ");
        int limit= input.nextInt();
        int sum=0;
        for(int i=1; i<=limit; i++)
        {
            System.out.println("Enter Number "+i);
            int number=input.nextInt();
            sum+=number;
        }
        System.out.println("Your Sum is "+sum);
    }
}
