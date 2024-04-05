package com.mycompany.lab_07;
import java.util.Scanner;
public class Task_10_a 
{
    public static void main (String [] args)
    {   
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number to get its reversed : ");
        int number=input.nextInt();
        System.out.print("Its reversed Number is : ");
        reverse(number);
    }
    public static void reverse(int number)
    {
        if (number !=0)
        {
            System.out.print(number%10);
            number/=10;
            reverse( number);
        }
    }
    
}
