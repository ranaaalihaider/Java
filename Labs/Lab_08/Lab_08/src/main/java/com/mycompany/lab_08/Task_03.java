package com.mycompany.lab_08;

public class Task_03 
{
    public static void main (String [] args)
    {
        printer(5);
    }
    public static void printer (int n)
    {
        for (int i=1;i<=n;i++)
        {
            for (int j=i;j==1;j++)
            {
                System.out.print("  ");
                for (int k=i;k<=n; k++)
                {
                    System.out.printf("%-4d",k);
                }
                System.out.println("");
            }
            System.out.printf("%-2d",i);
            for(int l=1;l<=n ;l++)
            {
                System.out.printf("%-4d",l*i);
            }
            System.out.println("");
        }
    }
    
}
