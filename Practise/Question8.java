import java.util.Scanner;
public class Question8 
{
    public static void main(String[] args) 
    {   
        Scanner input= new Scanner(System.in);
        int result=0;
        for(int i=1; i<=9;i++)
        {   
            System.out.print("Enter Number "+i);
            int number=input.nextInt();
            result=(number*i)+result;
        }
        System.out.println(result);
        for(int i=9;i>=1;i--)
        {
            result=result%i;
            System.out.print(result);
        }
        result=(result%11);
        System.out.print(result);
    }
}
