package com.mycompany.lab_07;
import java.util.Scanner;
public class Task_09 
{
    
    public static void main(String [] args)
    {
        Scanner input= new Scanner (System.in);
        System.out.print("Enter Number : ");
        int number=input.nextInt();
        System.out.print("Enter Power : ");
        int power=input.nextInt();
        int result=power(number,power);
        System.out.println("Your Output is "+result);
        
    }
    public static int power(int a, int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return a*power(a,n-1);
        }
    }
    
}
