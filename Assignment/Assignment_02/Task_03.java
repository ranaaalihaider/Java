import java.util.Scanner;
public class Task_03 
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to Prime Number finder Programme !");
        primeFinder();
    }
    public static void primeFinder ()
    {
        Scanner input=new Scanner(System.in);
        boolean primeStatus=true;
        System.out.print("Enter Number : ");
        do{
            primeStatus=true;
            int number =input.nextInt();
            for(int i=2;i<number;i++)
            {
                if (number%i==0) 
                {
                    primeStatus=false;
                    break;
                }
            }
            if (primeStatus==true) 
            {
                System.out.println("Your Number is prime that is "+number);
            }
            else
            {
                System.out.print("Enter Nuber again : ");
            }
        

        }while(primeStatus==false);
        
    }
}
