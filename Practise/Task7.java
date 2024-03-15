import java.util.Scanner;
public class Task7 
{
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Numbers to Count Even Numbers (0 to exit)");
        int count=0;
        int num=1;
        while (true) 
        {
            System.out.printf("Enter Number %d : ",(num));
            int number= input.nextInt();
            if (number==0) 
            {
                break;
            }
            else if (number%2==0)
            {
                count++;
            }
            num++;
        }
        System.out.println("Even Numbers is Sequence are "+count);
    }
}
