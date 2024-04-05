package com.mycompany.lab_07;
import java.util.Scanner;
public class Task_04 
{
    public static void main (String []args )
    {
        Scanner input= new Scanner (System.in);
        System.out.print("Enter Year to Check Number of Days  (Year from 2000 to 2020) : ");
        int year=input.nextInt();
        if (year>=2000 && year <=2020)
        {
        int days =numberOfDaysInAYear(year);
        System.out.println("Your Number of Days in year are "+days);
        }
        else
        {
            System.out.println("Enter Year between 2000 and 2020");
        }
    }
    public static int numberOfDaysInAYear(int year)
    {
       if(isLeap(year)==true)
       {
           int days=366;
           return days;
       }
       else
       {
           int days=365;
           return days;   
       }
    }
    public static boolean isLeap(int year)
    {
        if ((year %400==0) || (year%4==0 && year%100 !=0))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}