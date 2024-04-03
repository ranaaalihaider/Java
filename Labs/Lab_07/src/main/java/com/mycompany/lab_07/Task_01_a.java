package com.mycompany.lab_07;
import java.util.Scanner;
public class Task_01_a 
{
    public static void main (String [] args)
    {
        Scanner input= new Scanner (System.in);
        System.out.print("Enter Number to get sum of integers : ");
        long number=input.nextLong();
        int result=sumDigits(number);
        System.out.println("Sum of Integers is "+result);
        
    }
    public static int sumDigits(long n)
    {
        int sum=0;
        while (n>0)
        {
            sum+= (int) n%10;
            n=n/10;
        }
        return sum;
        
    }
    
}
