package com.mycompany.lab_05;
public class Task9_V 
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
                System.out.print(i);
            }
            //Printing right triangle
            for(int l=2; l<=i;l++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}