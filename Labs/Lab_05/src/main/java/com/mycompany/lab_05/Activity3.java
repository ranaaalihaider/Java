package com.mycompany.lab_05;
import java.util.Scanner;
public class Activity3 
{
    static Scanner input= new Scanner (System.in);
    static final int SENTINEL = -999;
    public static void main (String [] args )
    {
        int number;
        int sum=0;
        int count=0;
        System.out.println("Enter positive integers ending with "+SENTINEL);
        number= input.nextInt();
        while (number != SENTINEL)
        {
            sum=sum+number;
            count++;
            number=input.nextInt();
        }
        if(count !=0)
        {
            System.out.printf("The sum of %d numbers = %d \n",count,sum);
            System.out.println("The average is "+(sum/count));
        }
        else
        {
            System.out.println("No Input !");
        }
    }
}
