package com.mycompany.lab_07;
import java.util.Scanner;
public class Task_01_b 
{
    public static void main (String []args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Number to get it Reversed : ");
        int num=input.nextInt();
        reverse(num);
    }
    public static void reverse (int number)
    {
        System.out.print("Reverse Number is : ");
        while (number>0)
        {
            System.out.print(number%10);
            number/=10;
        }
    }
    
}
