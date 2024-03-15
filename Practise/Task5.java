import java.util.Scanner;
public class Task5 
{
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        int max=0;
        int number;
        do
        {
            System.out.println("Enter Number ");
            number=input.nextInt();
            if (number>max) 
            {
                max=number;
            }
        }while(number !=0);
        System.out.println("Max number is "+max);
    }
    
}
