import java.util.Scanner;
public class Tassk4 
{
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Hexa Decimal Digit : ");
        String digit=input.next();
        digit=digit.toUpperCase();
        char oneDigit=digit.charAt(0);
        int finalNumber=-999;
        if (oneDigit=='A' || oneDigit=='B'|| oneDigit=='C' || oneDigit=='D' || oneDigit=='E'|| oneDigit=='F') 
        {
            switch (oneDigit) {
                case 'A':finalNumber=10;break;
                case 'B':finalNumber=11;break;
                case 'C':finalNumber=12;break;
                case 'D':finalNumber=13;break;
                case 'E':finalNumber=14;break;
                case 'F':finalNumber=15;break;
                default:System.out.println("Something wrong"); break;
            }
        }
        else
        {
            int number = (int) (oneDigit-'0');
            if (number>=0 && number<=9)
            {
                finalNumber=number;
            }
            else
            {
                System.out.println("Wrong Input");
                return;
            }
        }
        // now we have converted hexa to decimal now we will convert decimal to binary 
        System.out.print("Your output in Binary is ");
        if (finalNumber==0) 
        {
            System.out.print("0");
        }
        else
        {
            while (finalNumber>0)
            {
                int result=finalNumber%2;
                finalNumber=finalNumber/2;
                System.out.print(result);
            }
        }

    }
    
}
