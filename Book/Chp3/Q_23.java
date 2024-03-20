import java.util.Scanner;
public class Q_23 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int firstLargest=0,secondLargest=0;
        for(int i=1; i<=4;i++)
        {
            System.out.print("Enter Number "+i+" : ");
            int number =input.nextInt();
            if (i==1) 
            {
                firstLargest=number;
            }
            else if (i==2) 
            {
                secondLargest=number;
                if (secondLargest>firstLargest) 
                {
                    int c=firstLargest;
                    firstLargest=secondLargest;
                    secondLargest=c;
                }
            }
            if (i!=1 && i!=2) 
            {
                
            
            if (number>firstLargest)
            {
                secondLargest=firstLargest;
                firstLargest=number;
            }
            else if (number>secondLargest) 
            {
                secondLargest=number;
            }
        }

        }
        System.out.println("Your first largest Number is "+firstLargest);
        System.out.println("Your 2nd largest Number is "+secondLargest);
    }
    
}
