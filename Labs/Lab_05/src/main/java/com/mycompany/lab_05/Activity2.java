package com.mycompany.lab_05;
import java.util.Scanner;
public class Activity2 
{
    public static void main (String [] args)
    {
        Scanner input= new Scanner(System.in);
        int limit;
        int number;
        int sum;
        int counter;
        System.out.print("Enter Number of Integers in list to get Average : ");
        limit = input.nextInt();
        sum=0;
        counter=0;
        System.out.print("Enter "+limit+" integers : ");
        while(counter < limit)
        {
            number=input.nextInt();
            sum=sum+number;
            counter++;
        }
        if (counter !=0)
        {
            System.out.printf("The Sum of %d numbers is %d \n",limit,sum);
            System.out.print("The Aerage is "+(sum/limit));
        }
        else
        {
            System.out.println("NO Input !");
        }
        
    }
    
}
