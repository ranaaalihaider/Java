import java.util.Scanner;
public class Question8_b {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First 9 Digits of an ISBN as an integer : ");
        int number=input.nextInt();
        int extra=number;
        String number_str=""+number;
        int length=number_str.length();
        if (length==8) 
        {
            int result=0;
            for(int i=0; i<(length); i++)
            {
                int reminder=number%10;
                number=number/10;
                if (i==0)
                {
                    System.out.printf("The ISBN-10 Number is 0%d",extra);
                }
                result=result+(reminder*((length+1)-i));
            }
            result=result%11;
            if (result==10) 
            {System.out.print("X");}
            else
            {System.out.print(result);}
        }
        else
        {
            System.out.println("Wrong Input Try Again . Number Should be of Length 9 with Starting 0");
        }
    }
}
