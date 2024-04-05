package com.mycompany.lab_08;
import java.util.Scanner;
public class Task_01 
{
    public static void main( String [] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Prime Number Printer !");
        System.out.println("Your Prime Numbers from 100 to 200 are !");
        for(int i=100;i<=200; i++)
        {
            boolean check=isPrime(i);
            if(check==true)
            {   
                System.out.printf("%-4d",i);
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
