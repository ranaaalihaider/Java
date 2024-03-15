import java.util.Scanner;
public class Question9 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 digit integer ");
        int number=input.nextInt();
        int extra=number;
        if ((number>99)&&(number<1000)) 
        {
            int result=0;
            for(int i=100 ;i>0 ;)
            {   
                int temp=0;
                temp=number%10;
                number=number/10;
                temp=temp*i;
                result=result+temp;
                i=i/10;
            }
            if (extra==result) 
            {
                System.out.printf("%d is a palindrome on reverse it gives same %d",extra,result);
            }
            else
            {
                System.out.printf("%d is not palindrome on reverse it gives %d",extra,result);
            }
        }
        else
        {
            System.out.println("Wrong Input. Please Enter 3 Digit Number.");
        }
    }
}
