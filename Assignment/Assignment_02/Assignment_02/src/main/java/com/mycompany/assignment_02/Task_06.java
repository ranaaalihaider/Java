package com.mycompany.assignment_02;
public class Task_06 
{
    public static void main(String[] args) 
    {
        pattern();
    }
    public static void pattern ()
    {
        for (int i=1;i<=8;i++)
        {
            for(int j=8;j>i;j--)
            {
                System.out.print("    ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.printf("%4d",((int)Math.pow(2, k)));
            }
            for(int k=i;k>=2;k--)
            {
                System.out.printf("%4d",((int)Math.pow(2, (k-2))));
            }
            System.out.println("");
        }

    }
}
