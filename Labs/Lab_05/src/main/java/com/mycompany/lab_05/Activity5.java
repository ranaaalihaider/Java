package com.mycompany.lab_05;
import java.util.Scanner;
public class Activity5 
{
    public static void main (String [] args)
    {
        Scanner  input= new Scanner (System.in);
        int number, sum=0, count;
        for(count =1; count<=5; count++)
        {
            System.out.println("Enter Numner "+count);
            number=input.nextInt();
            sum+=number;
        }
        System.out.println("The sum is "+sum);
    }
}
