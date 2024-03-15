package com.mycompany.lab_05;
public class Task9_IV 
{
    public static void main (String [] args)
    {
        for (int i=1; i<=5; i++)
        {   //printing spaces
            for(int j=5; j>i; j--)
            {
                System.out.print(" ");
            }
            //printing left triangle
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            //Printing right triangle
            for(int l=2; l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}