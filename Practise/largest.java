import java.util.Scanner;
public class largest 
    {
    public static void main(String[] args)
    {
        System.out.println("Enter 5 Numbers to Find Largest");
        Scanner input= new Scanner(System.in);
        int result=0;
        for(int i=1; i<=5; i++)
        {
            System.out.println("Enter Number "+i +" : ");
            int number=input.nextInt();
            if (i==1) 
            {
                result=number;    
            }
            if (number>result)
            {
                result=number;
            }

        }
        System.out.println("Laargest Number is "+result);

    }
    
}
