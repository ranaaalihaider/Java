package com.mycompany.lab_05;
public class Task9_III 
{
    public static void main (String [] args)
    {
        for (int i=1; i<=5; i++)
        {   //printing spaces in line
            for(int j=5; j>i; j--)
            {
                System.out.print(" ");
            }
            //printing stars
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            //changing line
            System.out.println("");
        }
    }
}
