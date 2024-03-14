package com.mycompany.lab_05;
import java.util.Scanner;
public class Activity6 
{
    public static void main (String [] args)
    {
        Scanner input= new Scanner (System.in);
        int number,max;
        System.out.println("Enter Numbers ");
        number =input.nextInt();
        max=number;
        do
        {
            number=input.nextInt();
            if(number>max)
            {
            max=number;
            }
            
        }while(number !=0);
        System.out.printf("Max is %d and number is %d",max,number);
    }
}
