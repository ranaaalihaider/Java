package com.mycompany.lab_05;
import java.util.Scanner;
public class Task3 
{
        public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("In how much numbers you want to find 0 numbers : ");
        int limit=input.nextInt();
        int count=0;
        for(int i=1; i<=limit; i++)
        {
            System.out.print("Enter Number "+i+" : ");
            int number=input.nextInt();
            if (number==0)
            {
                count++;
            }
        }
        System.out.println("\nTotal 0 numbers count is "+count);
    }
    
}
