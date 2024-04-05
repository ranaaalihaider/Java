package com.mycompany.lab_07;
import java.util.Scanner;
public class Task_03 
{
    public static void main (String [] args)
    {
        System.out.println("Enter Numbers to sort them in increasing order .");
        Scanner input= new Scanner (System.in);
        System.out.print("Enter Number 1 : ");
        double num1=input.nextDouble();
        System.out.print("Enter Number 2 : ");
        double num2=input.nextDouble();
        System.out.print("Enter Number 3 : ");
        double num3=input.nextDouble();
        displaySortedNumbers(num1,num2,num3);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3)
    {
        if(num1==num2 || num1==3 || num2==num1 || num2==num3 || num3==num1 || num3==num2)
        {
            System.out.println("Any of Two Numbers are Eequall Please Run Programme Again !");
        }
        else
        {
       if (num1>num2 && num1>num3)
       {
           if(num2>num3)
           {
               System.out.printf("%.1f %.1f %.1f",num3,num2,num1);
           }
           else
           {
               System.out.printf("%.1f %.1f %.1f",num2,num3,num1);
           }
       }
       else if (num2>num1 && num2>num3)
       {
           if(num1>num3)
           {
               System.out.printf("%.1f %.1f %.1f",num3,num1,num2);
           }
           else 
           {
               System.out.printf("%.1f %.1f %.1f",num1,num3,num2);
           }
       }
       else if (num3>num1 && num3>num2)
       {
           if (num1>num2)
           {
               System.out.printf("%.1f %.1f %.1f",num2,num1,num3);
           }
           else 
           {
               System.out.printf("%.1f %.1f %.1f",num1,num2,num3);
           }
       }
        }
        }

    
}
