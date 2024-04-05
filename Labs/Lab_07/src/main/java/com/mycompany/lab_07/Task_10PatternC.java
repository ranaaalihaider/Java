package com.mycompany.lab_07;
public class Task_10PatternC 
{
    public static void main (String [] args)
    {   int i=1;
        int j=1;
        rows(i,j);
    }
    public static void rows (int i ,int j)
    {
        if (i<=5)
        {
        stars(i,j);
        System.out.println("");
        rows(i+1,j);
        }
    }
    public static void stars (int i,int j)
    {
        
        if (j<=i)
        {
            System.out.print("* ");
            stars(i,j+1);
        }
    }
    
}
