package com.mycompany.assignment_02;
public class Task_05_D 
{
    public static void main(String[] args) 
    {
        pattern();
    }
    public static void pattern()
    {
        for(int i=1; i<=6;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=(7-i);k++)
            {
                System.out.printf("%-2d",k);
            }
            System.out.println("");
        }

    }
}
