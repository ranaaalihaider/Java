package com.mycompany.lab_07;
import java.util.Scanner;
public class Task_02 
{
    public static void main (String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter Number to Check Palindrome : ");
        int number=input.nextInt();
        boolean status=isPalindrome(number);
        if (status==true)
        {
            System.out.println("Your Number is Palindrome");
        }
        else
        {
            System.out.println("Your Number is Not Palindrone");
        }
    }
    public static int reverse(int number)
    {
        int result=0;
        while (number>0)
        {
            result=(result*10)+(number%10);
            number=number/10;
        }
        return result;
    }
    public static boolean isPalindrome(int number)
    {
        boolean status=(number==reverse(number));
        return status;
    }
    
}
