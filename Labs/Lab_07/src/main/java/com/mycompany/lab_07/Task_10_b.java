package com.mycompany.lab_07;
import java.util.Scanner;
public class Task_10_b 
{
    public static void main (String [] args)
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter Number to Convert in Binary : ");
        int number=input.nextInt();
        long binaryOutput=binaryConverter(number);
        System.out.println("Your Binary number is : "+binaryOutput);
    }
    public static long binaryConverter(int number)
    {
        if (number !=0)
        {
            return (long)(number%2 +10*binaryConverter( number/2));
        }
        else
        {
            return 0;
        }
    }    
}
