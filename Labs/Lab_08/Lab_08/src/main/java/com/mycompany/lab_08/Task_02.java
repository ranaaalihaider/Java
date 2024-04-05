package com.mycompany.lab_08;
import java.util.Scanner;
public class Task_02 
{
    public static void main (String [] args)
    {
        Scanner input= new Scanner (System.in);
        System.out.println("Enter Numbers until we find Prime Number !");
        while (true)
        {
            System.out.print("Enter Number : ");
            int number =input.nextInt();
            boolean status=isPrime(number);
            if(status==true)
            {
                System.out.println("That was Prime Number .\nExit......Done");
                break;
            }
            else 
            {
                System.out.println("Not Prime ! Try again .");
            }
        }
    }
    public static boolean isPrime(int n)
    {
        boolean status=true;
        for (int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                status=false;
                break;
            }
        }
        if (status==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
