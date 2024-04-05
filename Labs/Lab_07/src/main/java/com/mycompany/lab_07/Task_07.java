package com.mycompany.lab_07; 
import java.util.Scanner;
public class Task_07 
{
    public static void main (String [] args )
    {
        Scanner input=new Scanner (System.in);
        System.out.print("Enter Number : ");
        int number=input.nextInt();
        printMatrix(number);
    }
    public static void printMatrix(int n)
    {
        for(int i=1; i<=n;i++)
        {
            for (int j=1 ;j<=n;j++)
            {
                double doubleRandom=Math.random();
                int random=(int) Math.round(doubleRandom);
                System.out.printf("%2d",random);
            }
            System.out.println("");
        }
        
    }
    
}
